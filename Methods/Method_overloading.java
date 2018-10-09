package Conditional;

public class Methods1 {
	
	public static int add(int a)
	{		
		return a; 
	}
		public static int add(int a, int b)
	{		
		return a+b; 
	}
	public static int add(int a, int b, int c )
	{		
		return a+b+c; 
	}
	

	public static void main(String[] args) {

		int result1 =add(10);
		System.out.println(result1);

		int result2 =add(10,20);
		System.out.println(result2);
		
		int result3 =add(10,20,30);
		System.out.println(result3);
	}

}


Result:-
10
30
60
