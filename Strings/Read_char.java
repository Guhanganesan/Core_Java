package Guhan;

import java.io.IOException;
import java.util.Scanner;

public class GetCharValue {
	
public static void main(String[] args) throws IOException  {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Give Instructions");
	
	    char c = (char) System.in.read();
	
		if(c=='A')
		{
			System.out.println("A");
		}
		else if(c=='B')
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
   }
}

Result:-

Give Instructions
B
B



