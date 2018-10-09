package Basics;
import java.util.Scanner;  

public class Basic1 {
	
	

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
         
		System.out.println("Enter Number");
		
		int number=obj.nextInt();
		
		int i=0; int sum =0 ;
		for(i=0;i<=number;i++)
		{
			sum = sum+i;
			
		}
		
		System.out.println(sum);

	}

}
