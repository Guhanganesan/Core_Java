package MyBasics;

import java.util.Scanner;

public class CalcUsingSwitch {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number1");
		int a =sc.nextInt();
		System.out.println("Enter Number2");
		int b =sc.nextInt();
		System.out.println("Enter Operator");
		char chr = sc.next().charAt(0);
		switch(chr)
		{ 
			case '+':
				System.out.println(a+b);
			break;
			case '-':
				System.out.println(a-b);
			break;
			case '*':
				System.out.println(a*b);
			break;
			case '/':
				System.out.println(a/b);
			break;
		
		}

	}

}
