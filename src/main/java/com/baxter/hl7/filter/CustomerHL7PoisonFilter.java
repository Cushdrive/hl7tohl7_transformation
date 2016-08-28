package com.baxter.hl7.filter;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;


public class CustomerHL7PoisonFilter implements MessageSelector{

	@Override
	public boolean accept(Message<?> message) {
		//Do some validation of the incoming message here.
		return true;
	}
	
}
