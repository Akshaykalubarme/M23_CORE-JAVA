package StringBuilder;

public class Example5 {
	
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		
		System.out.println(s.capacity());
		s.append("boy");
		System.out.println(s.capacity());
		s.append("My name Akshay ");
		System.out.println(s.capacity());
		
	}

}
