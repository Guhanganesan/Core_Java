package String;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
	Scanner obj= new Scanner(System.in);
	System.out.println("Eneter string data");
	String input = obj.nextLine();
	char[] chr = {'a','e','i','o','u'};
	int vowels_count=0;
	for(int i=0;i<input.length();i++)
	{
		char c=input.charAt(i);
		for(int j=0; j<chr.length;j++)
		{
			if(c==chr[j])
			{
				vowels_count++;
			}
		}
	}
	
	System.out.println("Vowels count: "+vowels_count);

	}

}


Result:-
Eneter string data
He is my dear friend
Vowels count: 6

