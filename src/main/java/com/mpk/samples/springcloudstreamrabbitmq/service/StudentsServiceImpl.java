package com.mpk.samples.springcloudstreamrabbitmq.service;

import com.mpk.samples.springcloudstreamrabbitmq.objects.Student;
import com.mpk.samples.springcloudstreamrabbitmq.student.StudentProcessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@RequiredArgsConstructor
@EnableBinding(StudentProcessor.class)
@Slf4j
public class StudentsServiceImpl {
    
    @StreamListener(target = StudentProcessor.INPUT)
    public void receiveStudent(Student student){
        log.info("Received Student -> {}", student);
    }
}
