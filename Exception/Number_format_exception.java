package Exception;

import java.util.Scanner;

public class ArithMeticException {
     
	public static int add(int first, int sec)
	{
		int res=first+sec;
		return res;
	}
	
	public static void main(String[] args) {
		
		
		
		try {
		     int first = Integer.parseInt("5o5");//can use input mismatch exception
		     int sec   = Integer.parseInt("500");
		     int result =add(first,sec);
		     System.out.println(result);
		 }
		catch(NumberFormatException e)
		{
			System.out.println("Don't use alphabets in number");
		}
 }

}

Result:-

Don't use alphabets in number
