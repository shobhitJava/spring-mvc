package com.spring.scheduling;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("anotherBean")
public class AnotherBean {
	
	public void printAnotherMessage(){
		System.out.println("Called by Quartz jobBean using CronTriggerFactoryBean : -" + new Date());
	}
	
}
