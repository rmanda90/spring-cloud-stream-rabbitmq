package com.mpk.samples.springcloudstreamrabbitmq.controller;

import com.mpk.samples.springcloudstreamrabbitmq.model.Employee;
import com.mpk.samples.springcloudstreamrabbitmq.source.EmployeeRegistrationSink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(EmployeeRegistrationSink.class)
@Slf4j
public class EmployeeReceiver {

    @StreamListener(target = EmployeeRegistrationSink.INPUT)
    public void receiveEmployee(Employee employee){
        log.info("Receiving Message from Queue -> {}", employee);
    }
}
