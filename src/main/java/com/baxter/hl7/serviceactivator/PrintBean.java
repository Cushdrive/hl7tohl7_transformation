package com.baxter.hl7.serviceactivator;

import ca.uhn.hl7v2.model.Message;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class PrintBean {
	@ServiceActivator
	public void printContents(Message input) {
		System.out.println("Transformed message");
        String temp = input.toString();
        temp = temp.replaceAll("\r","\n");
		System.out.println(temp);
	}
}
