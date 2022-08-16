package StringBuffer;

public class Example3 {
	
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Internet of Things");
		System.out.println(s.capacity());
		
		s=new StringBuffer(" ");
		System.out.println(s.capacity());
	}

}

