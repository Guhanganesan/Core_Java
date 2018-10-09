package String;
import java.util.Scanner;
public class CountVowelsConsonants {
	public static void main(String[] args) {
	Scanner obj= new Scanner(System.in);
	System.out.println("Eneter string data");
	String input = obj.nextLine();
	     input = input.replace(" ", "");
	int vowels_count=0;
	int consonants_count=0;
	for(int i=0;i<input.length();i++)
	{
		char c=input.charAt(i);
		
			if((c=='a')||(c=='e')||(c=='i')
					||(c=='o')||(c=='u'))
			{
				vowels_count++;
			}
			else
			{
				consonants_count++;
			}
		
	}
	System.out.println("Vowels count: "+vowels_count);
	System.out.println("Consonants count: "+consonants_count);
}
}


Result:-

Eneter string data
He is my dear friend
Vowels count: 6
Consonants count: 10
