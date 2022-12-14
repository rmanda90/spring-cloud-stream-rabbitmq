package com.mpk.samples.springcloudstreamrabbitmq.controller;

import com.mpk.samples.springcloudstreamrabbitmq.model.Employee;
import com.mpk.samples.springcloudstreamrabbitmq.source.EmployeeRegistrationSource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@EnableBinding(EmployeeRegistrationSource.class)
@RequiredArgsConstructor
@Slf4j
public class EmployeeRegistrationRestController {

    @Autowired
    EmployeeRegistrationSource employeeRegistrationSource;

    /*
    * POST : http://localhost:8095/employee/register
    * Body : { "id": "Praveen", "empName": "Kumar" }
    * */
    @PostMapping("/register")
    public ResponseEntity<String> postEmployee(@RequestBody Employee employee){
        employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(employee).build());
        log.info("Sending Message to Exchange -> {}", employee);
        return ResponseEntity.ok(employee.toString());
    }

}
