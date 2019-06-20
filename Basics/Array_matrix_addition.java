import java.util.Scanner;

public class Main {

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
					System.out.print(" "+s[i][j]);
				}
				System.out.println();
			}
			
			
		}

	}

/*
Result:-
Enter Matrix1:
1
2
3
4
Enter Matrix2:
1
2
3
4
Sum of matrix is:
 2 4
 6 8

*/
