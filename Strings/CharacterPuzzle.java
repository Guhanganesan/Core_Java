package MyString;

public class CharacterPuzzle {

	public static void main(String[] args) {
		// if "ckr" ==> "emt"
		// if c+2 => e
		// if k+2 => m
		// if r+2 => t
		// then "tek"?
		
		char[] chr = new char[26];
		char c;
		int i=0;
		for(c='a'; c<='z';c++)
		{
			chr[i]=c;
			i++;
		}
		//System.out.println(chr[3]);
		
		String temp="";
		for(c='a';c<='z';c++)
		{
			if(c=='e')
			{
				c=(char) (c+2);
				temp=temp+(c);
			}
			else if(c=='k')
			{
				c=(char) (c+2);
				temp=temp+(c);
			}
			else if(c=='t')
			{
				c=(char) (c+2);
				temp=temp+(c);
			}
		}
		
       System.out.println(temp);
	}

}

Result:-
gmv
