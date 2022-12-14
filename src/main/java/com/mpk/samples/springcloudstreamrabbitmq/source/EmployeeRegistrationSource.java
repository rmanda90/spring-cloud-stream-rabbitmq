package com.mpk.samples.springcloudstreamrabbitmq.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface EmployeeRegistrationSource {

    public static final String OUTPUT="employee-registration-channel";

    @Output("employee-registration-channel")
    MessageChannel employeeRegistration();
}
