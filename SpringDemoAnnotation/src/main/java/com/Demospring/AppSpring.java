package com.Demospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.config.AppConfig;


public class AppSpring { 

	public static void main(String[] args) 
	{
		
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
			Customer customer=context.getBean(Customer.class);
   customer.setCustomerId(1990);
   customer.setCustomerName("Jaya");
   customer.setCustomerAddress("Kota");
   customer.setBillAmount(99990);
   
   ContactDetails contactDetails=context.getBean(ContactDetails.class);
   contactDetails.setMobileNumber("9874023677");
   contactDetails.setEmailId("jaya@gmail.com");
   customer.setContactDetails(contactDetails);
   System.out.println(customer);
	}

}
