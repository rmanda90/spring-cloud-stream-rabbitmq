package com.mpk.samples.springcloudstreamrabbitmq.source;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EmployeeRegistrationSink {

    public static final String INPUT="employee-receiver-channel";

    @Input(INPUT)
    SubscribableChannel retrieveEmployee();
}
