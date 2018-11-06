package MyString;

public class CountCharacters {

	public static void main(String[] args) {
		
		String name="Ganesan";
		int count=0;
		for(int i=0; i<name.length();i++)
		{
			if('a'==name.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
		
		char[] chr = name.toCharArray(); 
		int new_count=0;
		
		for(int i=0; i<chr.length;i++)
		{
			if('n'==chr[i])
			{
				new_count++;
			}
		}
		System.out.println(new_count);
		
		int count1=0;
		for(char c:name.toCharArray())
		{
			if(c=='n')
			{
				count1++;
			}
		}
		System.out.println(count1);

	}

}


Result:-
2
2
2
