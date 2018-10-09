package Basics;

import java.util.Scanner;  

public class Password {
	
	

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
         
		System.out.println("Enter your Password");
		
		int number=obj.nextInt();
		
		int mypassword =1234;
		
		if(number==mypassword)
		{
		  System.out.println("Succees");
		}
		else
		{
			System.out.println("Check Password");
		}
		
	}

}
