package org.telecom.telecomConsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;
import org.telecom.telecomConsumer.service.Impl.ConsumerService;
import org.telecom.telecomConsumer.service.Impl.impl.ConsumerServiceImpl;

import java.util.List;

@RestController
public class ConsumerController {

    Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    public ConsumerService consumerService;

    @GetMapping("/consumer/status")
    public ResponseEntity<SimDetailsResponse> simStatus(@RequestBody SimDetailsRequest simDetailsRequest){
        return new ResponseEntity<>(consumerService.simStatus(simDetailsRequest), HttpStatus.OK);
    }

    @GetMapping("/hi/{name}")
    public ResponseEntity<String> simStatus(@PathVariable String name){
        String str = "Helloworld";
        return new ResponseEntity<>(consumerService.helloWorld(str), HttpStatus.OK);
    }

    @PostMapping("/consumer/add")
    public ResponseEntity<List<SimDetailsResponse>> addConsumerSim(@RequestBody SimDetailsRequest simDetailsRequest){
        logger.debug("Consumer Controler add method with request: " + simDetailsRequest.toString());
        return new ResponseEntity<>(consumerService.addSimDetails(simDetailsRequest), HttpStatus.OK);
    }

    @PutMapping("/consumer/update")
    public ResponseEntity<SimDetailsResponse> updateConsumerSim(@RequestBody SimDetailsRequest simDetailsRequest){
        logger.debug("Consumer Controler upate method with request: " + simDetailsRequest.toString());
        return new ResponseEntity<>(consumerService.updateSimDetails(simDetailsRequest), HttpStatus.OK);
    }

    @DeleteMapping("/consumer/delete")
    public ResponseEntity<List<SimDetailsResponse>> deleteConsumerSim(@RequestBody SimDetailsRequest simDetailsRequest){
        logger.debug("Consumer Controler delete method with request: " + simDetailsRequest.toString());
        return new ResponseEntity<>(consumerService.deleteSimDetails(simDetailsRequest), HttpStatus.OK);
    }
}
