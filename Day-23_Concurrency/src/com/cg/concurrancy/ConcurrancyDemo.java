package com.cg.concurrancy;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrancyDemo 
{
	public static void main(String[] args) throws ExecutionException{
		//lambda exp for Runnable nterface (Functional Interface)
		Runnable r=()->
		{
			try
			{
				TimeUnit.MILLISECONDS.sleep(3000);
				System.out.println("Current Time: "+LocalDate.now());
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		};
		//executor server instance
		ExecutorService obj=Executors.newFixedThreadPool(10);
		obj.execute(r);
		@SuppressWarnings("unused")
		Future<String> res=obj.submit(r,"Done");
		//isDone{}-> if the task is completed it reyirns true else false
		while (res.isDone()==false)
		{
			try
			{
				System.out.println("The method returns value: "+res.get());
				break;
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			try
			{
				Thread.sleep(1000L);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		obj.shutdown();
		
		
	

	}

}
