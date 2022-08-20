package StringBuffer;

public class Example5 {
	
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("java");
		System.out.println(s);
		System.out.println(s.charAt(1));
		
		s.setCharAt(1, 'a');
		
		System.out.println(s);
		System.out.println(s.charAt(1));
		
	}

}


