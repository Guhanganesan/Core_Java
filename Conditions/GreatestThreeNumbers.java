package MyBasics;

import java.util.Scanner;

public class GreatestThreeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number1");
		int a =sc.nextInt();
		System.out.println("Enter Number2");
		int b =sc.nextInt();
		System.out.println("Enter Number3");
		int c = sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a");
			}
			else if(c>a)
			{
				System.out.println("c");
			}
			
		}
		else if(b>a)
		{
			if(b>c)
			{
				System.out.println("b");
			}
			else if(c>b)
			{
				System.out.println("c");
				
			}
			
		}
		
	}

}
