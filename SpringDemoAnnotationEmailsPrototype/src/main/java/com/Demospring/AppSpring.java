package com.Demospring;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.config.AppConfig;


public class AppSpring 
{
   

	public static void main( String[] args )
    {
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Email email=context.getBean(Email.class);
    	Email email1=context.getBean(Email.class);
    	To to=context.getBean(To.class);
    	to.setToName("Tulsi");
    	to.setToEmail("tulsi@gmail.com");
    	From from=context.getBean(From.class);
    	from.setFromName("Madhushree");
    	from.setFromEmail("madhushree@gmail.com");
    	Subject subject=context.getBean(Subject.class);
    	subject.setCaption("Reading");
    	Body body=context.getBean(Body.class);
    	body.setMessage("Books need to be sent");
    	
    	
    	System.out.println(email);
    	System.out.println(email1);
    	
    	
    }
}
