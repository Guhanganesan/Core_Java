package String;

import java.util.Scanner;

public class GetDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to remove duplicates");
		String input =sc.next();
		StringBuilder sb = new StringBuilder(input);
		int length=sb.length();
		String temp="";
		
		for(int i=0; i<length;i++)
		{
			for (int j=i+1; j<length;j++)
			{
				char char1 =sb.charAt(i);
				char char2 =sb.charAt(j);
				if(char1==char2)
				{
				   String m= Character.toString(char2);
				   temp=temp+m;
				}
			}
		}
	System.out.println(temp);
	}
}

Result:-
Enter String to remove duplicates
malayalam
maaalaaa
