package com.delloite.customTags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport {
	@Override
	public int doStartTag() throws JspException
	{
		JspWriter out=pageContext.getOut();
		try {
			out.println("<h2>Address of deloitte</h2>");
			out.println("<h2>Survey No: 123 &132/2,</h2>");
			out.println("<h2>Divyasree Technopolis,</h2>");
			out.println("<h2>Block C, Off Old Airport Road,</h2>");
			out.println("<h2>Yemlur, Yemlur Post, Bengaluru, </h2>");
			out.println("<h2> Karnataka 560037</h2>");
		} catch(IOException e) {
			e.printStackTrace();
		}
	return super.doStartTag();
	}
}