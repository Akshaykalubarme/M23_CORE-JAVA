package com.cg.generic;

public class Sender <T>
{
	private T message;
	
	public T getMessage()
	{
		return message;
		
	}

	public void setMessage(T message) {
		this.message = message;
	}
	public void sendMessage()
	{
		
		System.out.println("Mesage Type: "+getMessage().getClass());
	}
}
