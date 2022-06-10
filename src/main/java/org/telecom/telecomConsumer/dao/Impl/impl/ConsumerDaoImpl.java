package org.telecom.telecomConsumer.dao.Impl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.telecom.telecomConsumer.dao.Impl.ConsumerDao;
import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;

import java.util.List;

@Repository
public class ConsumerDaoImpl implements ConsumerDao {

    @Autowired
    public RestTemplate restTemplate;

    public SimDetailsResponse simStatus(SimDetailsRequest simDetailsRequest){
        String url = "http://localhost:8010/status";
        ResponseEntity<SimDetailsResponse> result = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(simDetailsRequest), SimDetailsResponse.class);
        return result.getBody();
    }

    @Override
    public String helloWorld(String str) {
        String url = "http://localhost:8010";
        ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(str), String.class);
        return result.getBody();
    }

    @Override
    public List<SimDetailsResponse> addSimDetails(SimDetailsRequest simDetailsRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String uri = "http://localhost:8010/add";
        HttpEntity<SimDetailsRequest> requestEntity = new HttpEntity<>(simDetailsRequest, headers);
        ResponseEntity<List> result = restTemplate.exchange(uri, HttpMethod.POST, requestEntity, List.class);
        return result.getBody();
    }

    @Override
    public SimDetailsResponse updateSimDetails(SimDetailsRequest simDetailsRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String uri = "http://localhost:8010/update";
        HttpEntity<SimDetailsRequest> requestEntity = new HttpEntity<>(simDetailsRequest, headers);
        ResponseEntity<SimDetailsResponse> result = restTemplate.exchange(uri, HttpMethod.PUT, requestEntity, SimDetailsResponse.class);
        return result.getBody();
    }

    @Override
    public List<SimDetailsResponse> deleteSimDetails(SimDetailsRequest simDetailsRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String uri = "http://localhost:8010/delete";
        HttpEntity<SimDetailsRequest> requestEntity = new HttpEntity<>(simDetailsRequest, headers);
        ResponseEntity<List> result = restTemplate.exchange(uri, HttpMethod.DELETE, requestEntity, List.class);
        return result.getBody();
    }
}
