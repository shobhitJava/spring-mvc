package com.spring.scheduling;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {
	int cnt = 1;
	public void printMessage() {
		System.out.println("Called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean"
				+ new Date() + "::"  + cnt++);
	}
	
}
