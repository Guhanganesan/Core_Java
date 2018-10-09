package Basics;
import java.util.Scanner;
public class EntireArray {

	public static void main(String arg[]) 
	{
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int output = 0;
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter No "+(i+1)+" number");
			int getValue = input.nextInt();
			arr[i]=getValue;
			
		}
		output = sum(arr);
		System.out.println("The sum of array element is: "+output);
		
	}
	
	public static int sum(int[] arr)
	{   int result =0;
		for( int i=0; i<=arr.length-1; i++)
		{
		  result = result+arr[i];
		}
		return result;
	}
}


Result:

Enter No 1 number
10
Enter No 2 number
10
Enter No 3 number
10
Enter No 4 number
10
Enter No 5 number
10
The sum of array element is: 50


