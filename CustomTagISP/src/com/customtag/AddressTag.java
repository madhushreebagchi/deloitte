package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AddressTag extends TagSupport{
	@Override
	public int doStartTag()throws JspException{
		JspWriter out=pageContext.getOut();
		try {
			out.println("Deloitte<br/>");
			out.println("Block C<br/>Divyasree Technopolis <br/");
			out.println("Survey No.:123 & 132/2");
			out.println("Yemlur Post");
			out.println("Off old Airport Road");
			out.println("Karnataka 500209");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	return super.doStartTag();
	}
	

}
