package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/ahmed")	
public String gg()
{
	return "ghosia";
}
@RequestMapping("/customer")	
public String cc()
{
	return "customer";
}
@RequestMapping("/employee")	
public String ee()
{
	return "employee";
}
@RequestMapping("/product")	
public String pp()
{
	return "product";
}
@RequestMapping("/guest")	
public String ff()
{
	return "guest";
}
}
