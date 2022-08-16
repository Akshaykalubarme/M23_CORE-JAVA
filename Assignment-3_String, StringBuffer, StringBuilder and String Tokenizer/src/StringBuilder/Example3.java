package StringBuilder;

public class Example3 {
	
	public static void main(String[] args) {
		String str="Tomorrow"; 
		StringBuilder s=new StringBuilder(str.length());
		System.out.println(s.capacity());

	}
}

