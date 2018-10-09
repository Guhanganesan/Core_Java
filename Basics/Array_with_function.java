package Basics;
import java.util.Scanner;
public class ArrayFunction {
	// Passing array elements to a function
        static int  sum=0; static int i=1;

		static int[] arr = new int[5];
	    
	    static void average(int m)
	    {
	     		    sum=sum +m;
	                System.out.println("The Average is:"+sum );
	    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    for(i=0; i<=arr.length-1; i++)
		{
		   System.out.println("Enter No "+ (i+1) +" Mark");
		   int getValue = input.nextInt();
		   arr[i]=getValue;
		   average(arr[i]);
		}
		
	}

}


Result:

Enter No 1 Mark
20
The sum is:20
Enter No 2 Mark
30
The sum is:50
Enter No 3 Mark
50
The sum is:100
Enter No 4 Mark
40
The sum is:140
Enter No 5 Mark
60
The sum is:200
