package String;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string to sort each words");
		
		String input = sc.nextLine();
		      
		String[] x = input.split(" ");
		String temp="";
		        
		for(int i=0; i<x.length; i++)
		{
			if(x[i].length()>temp.length())
			{
				temp=x[i];
			}
		}
		System.out.println(temp);
		System.out.println(temp.length());
    }
}

Result:-

Please enter a string to sort each words
Hi my dear friend
friend
6
