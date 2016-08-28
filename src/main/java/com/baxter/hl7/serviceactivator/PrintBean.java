package com.baxter.hl7.serviceactivator;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class PrintBean {
	@ServiceActivator
	public void printContents(String input) {
		System.out.println(input);
	}
}
