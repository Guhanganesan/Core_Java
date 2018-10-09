package Array1;

import java.util.Scanner;

public class UserSum {

	public static void main(String[] args) {
		
		//Get values from user to find sum
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.println("Enter Array values");
		for(int i=0; i<arr.length;i++)
		{
		    int input=sc.nextInt();
			arr[i]=input;
		}
		
		//To check entered values in array
		System.out.println("Entered Array values");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		// To cal calculate sum of array values
		
		System.out.println("Sum of array values");
		int sum=0;		
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}

Result:-
Enter Array values
10
20
30
40
50
Entered Array values
10
20
30
40
50
Sum of array values
150
