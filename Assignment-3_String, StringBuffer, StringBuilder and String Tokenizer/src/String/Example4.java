package String;
// Program on string.Equals
import java.util.Scanner;

public class Example4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str1="Akshay";
		String str2=new String(sc.nextLine());
		//str2=sc.nextLine();
		if(str1.equals(str2))
		{
			System.out.println("String get matched:");
		}
		else
		{
			System.out.println("String get mismatched:");
		}
	}

}
