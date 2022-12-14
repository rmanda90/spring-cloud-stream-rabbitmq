package com.mpk.samples.springcloudstreamrabbitmq.student;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.SubscribableChannel;

/**
 * Spring cloud streams {@link Processor} which receives an inbound Student.
 */
public interface StudentProcessor {
	public static final String INPUT = "student-inbound-stream";

	@Input(INPUT)
	SubscribableChannel receiveStudent();

}
