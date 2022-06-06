package org.telecom.telecomConsumer.service.Impl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telecom.telecomConsumer.dao.Impl.ConsumerDao;
import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;
import org.telecom.telecomConsumer.service.Impl.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerDao consumerDao;

    public SimDetailsResponse simStatus(SimDetailsRequest simDetailsRequest){
        return consumerDao.simStatus(simDetailsRequest);
    }
}
