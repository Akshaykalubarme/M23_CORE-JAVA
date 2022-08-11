package com.cg.statickeyword;

public class StaticBox 
{
	double width;
	double height;
	static int count;
	public StaticBox(double width, double height)
	{
		this.width=width;
		this.height=height;
	}
	public StaticBox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("Count is: "+cnt);
		count++;
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StaticBox s=new StaticBox();
		
	}

}
