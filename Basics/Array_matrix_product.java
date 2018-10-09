package Array;

import java.util.Scanner;

public class Matrix_multiplication {

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
					for(int k=0; k<s.length;k++)
					{
						s[i][j]=s[i][j]+a[i][k]*b[k][j];
					}
					
				}
				
			}
			System.out.println("Product of matrix is:");

			for(int i=0; i<s.length;i++)
			{
				for(int j=0; j<s.length;j++)
				{
					System.out.println(s[i][j]);
				}
			}
			
			
		}

	}

Result:-
Enter Matrix1:
2
3
4
1
Enter Matrix2:
1
2
3
4
Product of matrix is:
11
16
7
12
