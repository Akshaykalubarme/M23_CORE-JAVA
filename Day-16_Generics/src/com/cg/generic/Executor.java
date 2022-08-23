package com.cg.generic;

public class Executor {

	public static void main(String[] args) {
		Sender<String> obj=new Sender<>();
		obj.setMessage("Generic Class Demo");
		obj.sendMessage();
		
		System.out.println();
		
		Email em=new Email();
		em.setFrom("kalubarmeakshay1371@gmail.com");
		em.setTo("Slashvampire3598");
		em.setsubject("Java Full Stack");
		em.setbody("About Traning and Placement");
		
		System.out.println(em.getbody());
		
		Sender<Email> obj1=new Sender <Email>();
		obj1.setMessage(em);
		obj1.sendMessage();
		
		

	}

}
