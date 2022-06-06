package org.telecom.telecomConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;
import org.telecom.telecomConsumer.service.Impl.ConsumerService;

@RestController
public class ConsumerController {

    @Autowired
    public ConsumerService consumerService;

    @GetMapping("/consumer/status")
    public ResponseEntity<SimDetailsResponse> simStatus(@RequestBody SimDetailsRequest simDetailsRequest){
        return new ResponseEntity<>(consumerService.simStatus(simDetailsRequest), HttpStatus.OK);
    }

    @GetMapping("/hi")
    public ResponseEntity<String> simStatus(){
        String str = "Helloworld";
        return new ResponseEntity<>(str, HttpStatus.OK);
    }
}
