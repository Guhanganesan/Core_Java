package MyForLoop;

import java.util.Scanner;

public class GreatestNumbers {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
        System.out.println("Enter how many numbers");
        int count=obj.nextInt();
        int temp=0;
        for(int i=1; i<=count; i++)
        {
        	System.out.println("Enter Number: "+i);
        	int num=obj.nextInt();
        	if(num>temp)
        	{
        		temp=num;
        	}
        }
        System.out.println("Greatest Number is: "+temp);

	}

}


Result:-
Enter how many numbers
4
Enter Number: 1
4
Enter Number: 2
8
Enter Number: 3
3
Enter Number: 4
7
Greatest Number is: 8

