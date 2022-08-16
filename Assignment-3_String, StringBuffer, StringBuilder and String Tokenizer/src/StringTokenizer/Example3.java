package StringTokenizer;

import java.util.StringTokenizer;

public class Example3 {
	
	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("Lets try this");
		
		while(s.hasMoreElements())
		{
			System.out.println(s.nextToken());
		}
	}
}

