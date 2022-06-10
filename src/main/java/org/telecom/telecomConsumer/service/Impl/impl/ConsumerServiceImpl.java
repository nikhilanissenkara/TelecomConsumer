package org.telecom.telecomConsumer.service.Impl.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telecom.telecomConsumer.controller.ConsumerController;
import org.telecom.telecomConsumer.dao.Impl.ConsumerDao;
import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;
import org.telecom.telecomConsumer.service.Impl.ConsumerService;

import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);
    @Autowired
    private ConsumerDao consumerDao;

    public SimDetailsResponse simStatus(SimDetailsRequest simDetailsRequest){
        logger.debug("In consumer service sim status");
        return consumerDao.simStatus(simDetailsRequest);
    }

    @Override
    public String helloWorld(String str) {
        logger.debug("In consumer service helloworld");
        return consumerDao.helloWorld(str);
    }

    @Override
    public List<SimDetailsResponse> addSimDetails(SimDetailsRequest simDetailsRequest) {
        logger.debug("In consumer service addSimDetails and get SimDetails Response... SimDetailsRequest: " + simDetailsRequest);
        return consumerDao.addSimDetails(simDetailsRequest);
    }

    @Override
    public SimDetailsResponse updateSimDetails(SimDetailsRequest simDetailsRequest) {
        logger.debug("In consumer service update SimDetails and get SimDetails Response... SimDetailsRequest: " + simDetailsRequest);
        return consumerDao.updateSimDetails(simDetailsRequest);
    }

    @Override
    public List<SimDetailsResponse> deleteSimDetails(SimDetailsRequest simDetailsRequest) {
        logger.debug("In consumer service deleteSimDetails and get SimDetails Response... SimDetailsRequest: " + simDetailsRequest);
        return consumerDao.deleteSimDetails(simDetailsRequest);
    }


}
