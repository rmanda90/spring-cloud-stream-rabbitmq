package com.mpk.samples.springcloudstreamrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudStreamRabbitmqApplication {
	/**
	 * Source - When a message is needed to be published it is done using Source.
	 * The Source is an interface having a method annotated with @Output.
	 * The @Output annotation is used to identify output channels.
	 * The Source takes a POJO object, serializes it and then publishes it to the output channel.
	 * */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamRabbitmqApplication.class, args);
	}

}
