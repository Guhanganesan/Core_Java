package PatternPrograms;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int rows= sc.nextInt();
		for (int i=1;i<=rows;i++)
		{
             for(int j=1;j<=i;j++)
             {
            	 System.out.print(i);
             }
             System.out.println();
	    }
   }
}

Ans:-
Enter Number of rows
4
1
22
333
4444
