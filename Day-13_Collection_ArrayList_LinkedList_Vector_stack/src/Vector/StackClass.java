package Vector;

import java.util.Stack;
public class StackClass {

	public static void main(String[] args) {
		Stack <Object> s=new Stack<>();
		s.push(11);
		s.push(23);
		s.push("Sam");
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		
	}	

}


