package com.customtag;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class FormTag extends TagSupport{

		@Override
		public int doStartTag()throws JspException{
			JspWriter out=pageContext.getOut();
			try {
				out.println("<form><br/>");
				out.println("<font color=red><br/>");
				out.println("WELCOME");
				
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		return super.doStartTag();
		}
		

	}


