package org.telecom.telecomConsumer.dao.Impl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.telecom.telecomConsumer.dao.Impl.ConsumerDao;
import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;

import java.util.Collections;

@Repository
public class ConsumerDaoImpl implements ConsumerDao {

    @Autowired
    public RestTemplate restTemplate;

    public SimDetailsResponse simStatus(SimDetailsRequest simDetailsRequest){
        ResponseEntity<SimDetailsResponse> result = restTemplate.getForObject("http://localhost:8010/status", ResponseEntity.class, simDetailsRequest);
        return result.getBody();
    }
}
