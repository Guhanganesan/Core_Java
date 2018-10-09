package BasicProgram;
import java.util.Scanner;
public class CompareTwoNumber {
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int first = sc.nextInt();
	
	System.out.println("Enter second number");
	int second=sc.nextInt();
	
	if(first>second)
	{
		System.out.println("First number is greater");
	}
	else if(second>first)
	{
		System.out.println("Second is greater");
	}
	else 
	{
		System.out.println("both are equal");
	}
	
} }
