package MyString;

public class ReverseString {

	public static void main(String[] args) {
		
		String letters="ABCD";
		String temp="";
		
		for(int i=letters.length()-1; i>=0; i--)
		{
			char c = letters.charAt(i);
			temp=temp+c;
		}
        System.out.println(temp);
	}

}

Result:-
DCBA
