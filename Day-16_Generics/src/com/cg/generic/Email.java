package com.cg.generic;

public class Email 
{
	
	private String from;
	private String to;
	private String subject;
	private String body;
	
	public String getfrom() {
		return from;
	}
	public void setFrom(String from)
	{
		this.from = from ;
	}
	public String getTo()
	{
		return to;
	}
	public void setTo( String to)
	{
		this.to = to;
	}
	public String getsubject()
	{
		return subject;
	}
	public void setsubject(String subject)
	{
		this.subject = subject;
	}
	public String getbody()
	{
		return body;
	}
	public void setbody(String body)
	{
		this.body = body;
	}

}
