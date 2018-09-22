package Basics;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s;
		
		StringBuilder sb = new StringBuilder("malayalam");
		
		//System.out.println(sb.charAt(4));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charcter to remove");
		String input = sc.next();
		
		for(int i=0; i<sb.length();i++)
		{
			char c =sb.charAt(i);
			s=Character.toString(c);
			if(input.equals(s))
			{
				sb.deleteCharAt(i);
				//System.out.println(sb.charAt(i));
				i=i-1;
			}
		}
       
		System.out.println(sb);
	}

}


Result:-

Enter charcter to remove
a
mlylm

Enter charcter to remove
m
alayala




