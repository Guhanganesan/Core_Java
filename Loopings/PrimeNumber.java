package MyForLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=obj.nextInt();
		int count=2;
		for(int i=2; i<=num; i++)
		{
			if(num%i!=0)
			{
				count++;
			}
		}
		//System.out.println(count);
		if(num==count)
		{
			System.out.println("Given Number is prime");
		}
		else
		{
			System.out.println("Given Number is not prime");
		}
	}

}
