package org.telecom.telecomConsumer.dao.Impl;

import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;

public interface ConsumerDao {

    SimDetailsResponse simStatus(SimDetailsRequest simDetailsRequest);
}
