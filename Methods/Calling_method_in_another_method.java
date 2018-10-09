package Conditional;

public class Methods1 {
	
	public static int test()
	{
		int x=100;
		return x;
	}
	
	public static int add(int a, int b)
	{
		int c= test();// calling method in another method
		return a+b+c; 
	}

	public static void main(String[] args) {

		int result =add(10,20);
		System.out.println(result);

	}

}


Result:-

130

