package org.telecom.telecomConsumer.dao.Impl;

import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;

import java.util.List;

public interface ConsumerDao {

    SimDetailsResponse simStatus(SimDetailsRequest simDetailsRequest);
    String helloWorld(String str);
    List<SimDetailsResponse> addSimDetails(SimDetailsRequest simDetailsRequest);
    SimDetailsResponse updateSimDetails(SimDetailsRequest simDetailsRequest);
    List<SimDetailsResponse> deleteSimDetails(SimDetailsRequest simDetailsRequest);
}
