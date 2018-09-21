package Basics;

public class Testing {

	public static void main(String[] args) {
		int x = 4;
		String s= "amma";
		
		String g="";
		
		/*g= g.concat("R");
		System.out.println(g);
		      g=g.concat("T");// we can concat string only
		System.out.println(g);
		
		*/
		
		for(x=s.length()-1; x>=0; x--)// x=5; x>=0;x--
		{
		     char c=s.charAt(x);//character
		     String str = Character.toString(c);
			     g=g.concat(str);
        }
	    if(s.equals(g))
	    {
	    	System.out.println("Given data is palindrome");
	    }
		
	}
}


Result:-

Given data is palindrome
