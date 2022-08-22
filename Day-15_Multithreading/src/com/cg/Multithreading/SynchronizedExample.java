package com.cg.Multithreading;

public class SynchronizedExample {
	
class counter 
{
	int count;
	public synchronized void  Counter()
	{
		count++;
	}
}

public class Main {

	public void main(String[] args) throws Exception{
	{
		
		counter c=new counter();
		
			Thread t=new Thread(new Runnable()
			{
				public void run()
				{
					for(int i=1;i<=1000;i++)
					{
						c.Counter();
					}
				}
			});
		
			Thread t1=new Thread(new Runnable()
				{
				public void run()
				{
					for(int i=1;i<=1000;i++)
					{
						c.Counter();
					}
				}
				
				});
				t.start();
				t1.start();
				t.join();
				t1.join();
			
			
			System.out.println(c.count);
		}
	}
}
}
