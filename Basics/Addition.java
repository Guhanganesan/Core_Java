package Basics;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		
		int a = obj.nextInt();

		System.out.println("Enter Second Number");
		
		int b= obj.nextInt();
		
		int  c = a+b;
		
		System.out.println(c);
	}

}
