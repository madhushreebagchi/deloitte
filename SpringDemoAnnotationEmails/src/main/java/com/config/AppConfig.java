package com.config;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Demospring.Body;
import com.Demospring.Email;
import com.Demospring.From;
import com.Demospring.Subject;
import com.Demospring.To;



@Configuration
public class AppConfig 
{
	@Bean
	public Email getEmail()
	{
		return new Email();
	}
	
	@Bean
	public To getTo()
	{
		return new To();
		
	}

	@Bean
	public From getFrom()
	{
		return new From();
		
	}
	

	@Bean
	public Subject getSubject()
	{
		return new Subject();
		
	}
	

	@Bean
	public Body toBody()
	{
		return new Body();
		
	}
	
}
