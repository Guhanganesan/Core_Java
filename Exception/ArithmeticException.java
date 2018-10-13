package Exception;

import java.util.Scanner;

public class ArithMeticException {
     
	
	public static int div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int first=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int sec = sc.nextInt();
		
		try {
			
		 int result =div(first,sec);
		 
		 System.out.println(result);
		 
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Don't use zero");
		}
		

	}

}

Result:-
1)
Enter 1st Number
12
Enter 2nd Number
0
Don't use zero

2)

Enter 1st Number
12
Enter 2nd Number
4
3
