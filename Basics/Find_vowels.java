package String;

import java.util.Scanner;

public class Vowels{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string to sort each words");
		String input = sc.nextLine();
		String[] x = input.split(" ");
		String temp="";
	
		//temp=x[0];
		//System.out.println(temp.charAt(0));
		
		char[] vowels = {'a','e','i','o','u'};
		//System.out.println(vowels[0]);

		for(int i=0; i<x.length; i++)
		{
			for(int j=0;j<vowels.length;j++)
			{
				temp=x[i];
				if(temp.charAt(0)==vowels[j])
				{
					System.out.println("Vowels in: "+temp);
					//break; //for first vowels word				
				}
			}
		}
		
    }
}


Result:-

Please enter a string to sort each words
He is my dear friend anbu and he using my phone
Vowels in: is
Vowels in: anbu
Vowels in: and
Vowels in: using

