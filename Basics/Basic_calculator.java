package Basics;

import java.util.Scanner;

public class Calculator {
	
	int a,b;
	
	Calculator(int x,int y)
	{
		this.a=x;
		this.b=y;
		
	}
	
	void add()
	{
		System.out.println(a+b);
	}
    void sub()
    {
    	System.out.println(a-b);
    }
    void mul()
    {
    	System.out.println(a*b);
    }
    void div()
    {
    	System.out.println(a/b);
    }
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int input1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int input2 = sc.nextInt();
				
		Calculator obj = new Calculator(input1,input2); 
		
		         
		System.out.println("Enter your choice + or - or * or /");
		
		
		String input3 = sc.next();
		
		if(input3.equals("+"))
		{
			 obj.add();  
		}
		else if(input3.equals("-")) 
		{
			obj.sub();
		}
		
		else if(input3.equals("*")) 
		{
			obj.mul();
		}         
		else if(input3.equals("/"))      
		{
			obj.div();
		}
		           
		           
   }

}
