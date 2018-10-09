package Array;

import java.util.Scanner;

public class Array3 {
	static int[][] a = new int[2][2]; 
	static int[][] b = new int[2][2];
	static int[][] s = new int[2][2];
			
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Matrix1:");
		for(int i=0; i<a.length; i++) 
		{
			for(int j=0; j<a.length; j++) 
			{
			 
		      a[i][j]=input.nextInt();
				
			}
		}
		System.out.println("Enter Matrix2:");
		for(int i=0; i<b.length; i++) 
		{
			for(int j=0; j<b.length; j++) 
			{
			 
		      b[i][j]=input.nextInt();
				
			}
	   }
		
		for(int i=0 ; i<s.length;i++)
		{ 
			for(int j=0; j<s.length;j++)
			{
				s[i][j]=a[i][j]+b[i][j];
			}
			
		}
		System.out.println("Sum of matrix is:");

		for(int i=0; i<s.length;i++)
		{
			for(int j=0; j<s.length;j++)
			{
				System.out.println(s[i][j]);
			}
		}
		
		System.out.println("Transpose of matrix is:");
		
		for(int i=0; i<2;i++)
		{
			for(int j=0; j<2; j++)
			{
			System.out.println(s[j][i]);	
			}
		}
		
	}


}


Result:-

Enter Matrix1:
2
3
4
5
Enter Matrix2:
2
3
4
5
Sum of matrix is:
4
6
8
10
Transpose of matrix is:
4
8
6
10
