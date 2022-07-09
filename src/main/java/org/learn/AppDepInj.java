package org.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDepInj {

	public static void main(String... args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PersonConfiguration.class);
		
		Person person = context.getBean("otherPerson",Person.class);
		
		System.out.println(person.doSport());
		
		context.close();
	}
}
