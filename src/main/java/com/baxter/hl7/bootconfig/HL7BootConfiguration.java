package com.baxter.hl7.bootconfig;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;

import com.baxter.hl7.serviceactivator.PrintBean;


@Configuration
public class HL7BootConfiguration {
	
	private static final String QUEUE_URL = "tcp://USDBBENDERJ4.global.baxter.com:61616";
	private static final String QUEUE_NAME = "POC_QUEUE";
	
	
	@Bean
	public ActiveMQConnectionFactory targetConnectionFactory() {
		ActiveMQConnectionFactory returnval = new ActiveMQConnectionFactory();
		returnval.setBrokerURL(QUEUE_URL);
		return returnval;
	}
	
	@Bean
	public CachingConnectionFactory connectionFactory() {
		CachingConnectionFactory returnval = new CachingConnectionFactory();
		returnval.setTargetConnectionFactory(targetConnectionFactory());
		returnval.setSessionCacheSize(10);
		return returnval;
	}
	
	@Bean
	public ActiveMQQueue requestQueue() {
		ActiveMQQueue returnval = new ActiveMQQueue(QUEUE_NAME);
		return returnval;
	}
	
	@Bean
	public PrintBean printBean() {
		return new PrintBean();
	}

}
