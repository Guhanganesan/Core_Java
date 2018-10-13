package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException {
     
	public static int add(int first, int sec)
	{
		int res=first+sec;
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			 System.out.println("Enter first number");
		     int first = sc.nextInt();
		     System.out.println("Enter second number");
		     int sec   = sc.nextInt();
		     int result =add(first,sec);
		     System.out.println(result);
		 }
		catch(InputMismatchException e)
		{
			System.out.println("Don't use alphabets in number");
		}
 }

}

Result:-
Enter first number
505
Enter second number
4o3
Don't use alphabets in number
