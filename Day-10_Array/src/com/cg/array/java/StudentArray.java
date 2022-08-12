package com.cg.array.java;
// Program on Student Array
 class Student
{
	public int roll_no;
	public String name;
	//Constructor
	Student(int roll_no, String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class StudentArray{
	
	public static void main(String[] args) {
		//Non-primitive Array memory allocatoin
		Student[] arr=new Student[3];
		arr[0]=new Student(101, "Akshay");
		arr[1]=new Student(102, "Sanjana");
		arr[2]=new Student(103, "Sapan");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Element at " +i+" index "+arr[1].roll_no+" "+arr[i].name);
		}
	}

}


