package Basics;

public class Addition1 {
	
	            static int number1()
	            {
	            	int a =200;
	            	return a;
	            }
	
	            static int number2()
	            {
	            	int a =50;
	            	return a;
	            }
	            
	public static void main(String[] args) {
		       System.out.println(number1());
		       System.out.println(number2());
		       int b= number1();
		       int c = number2();
		       int d = b+c;//250
		       int e = b-c;//150
		       int f = b/c;//4
		       int g = b%c;//0 remainder
		       
		       System.out.println(d);
		       System.out.println(e);
		       System.out.println(f);
		       System.out.println(g);
	}

}
