package org.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
	
	@Bean
	public SoccerPlayer sportist() {
		return new SoccerPlayer();
	}

	@Bean
	public Person otherPerson() {
		return new Person(sportist());
	}
	
}
