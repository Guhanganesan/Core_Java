package Exception;

import java.util.Scanner;

public class NullPointerException {
     
	
	public static int add(String first, String sec)
	{
		int res=first.length()+sec.length();
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Name");
		String first=sc.next();
		System.out.println("Enter last Name");
		String sec = sc.next();
		
		try {
			
		 int result =add(first,null);// here i am using null instead of sec
		 System.out.println(result);
		 
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Don't use null");
		}
		

	}

}


Result:-
1)
Enter 1st Name
Guhan
Enter last Name
Ganesan
Don't use null

