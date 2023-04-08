package com.try2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeAppDemo {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("footballCoach", FootballCoach.class);
		
		Coach anotherCoach = context.getBean("footballCoach", FootballCoach.class);
		
		
		boolean rslt = (coach==anotherCoach);
		System.out.println(rslt);
		System.out.println(coach.getDailyWorkout());
		System.out.println(anotherCoach.getDailyWorkout());
		
		context.close();
	}

}
