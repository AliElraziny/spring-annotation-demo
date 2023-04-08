package com.try2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "try again your exercise ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@PostConstruct
	private void tryPostMethod() {
		
		System.out.println("try post method ");
		
	}
	@PreDestroy
	private void destMethod() {
		System.out.println("destroyMethod");

	}

}
