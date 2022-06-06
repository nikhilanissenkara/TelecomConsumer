package org.telecom.telecomConsumer.service.Impl;

import org.telecom.telecomConsumer.dto.request.SimDetailsRequest;
import org.telecom.telecomConsumer.dto.response.SimDetailsResponse;

public interface ConsumerService {
     SimDetailsResponse simStatus(SimDetailsRequest simDetailsRequest);
}
