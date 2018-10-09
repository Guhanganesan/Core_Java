package Basics;
import java.util.Scanner;
public class Testing {
     
	static int[][] arr = new int[2][5];
	
	// row =2; column=5; 
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Getting two students mark
		
		// [0][0], [0][1],[0][2],[0][3], [0][4] first row
		// [1][0], [1][1],[1][2],[1][3], [1][4] second row
		// Both row has column-1 index value at end (i.e) 4 
		
		
		for(int i=0; i<=arr.length-1; i++) // length = how many row (2)
		{
			for(int j=0; j<=4; j++) // end of the index column-1 =4
			{
				if(i==0)
				{
					System.out.println("Enter Student A mark:");
					arr[i][j]=input.nextInt();
				}
				if(i==1)
				{
					System.out.println("Enter Student B mark:");
					arr[i][j]=input.nextInt();
				}
				
			}
			
		}
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=4; j++)
			{
				if(i==0)
				{
				System.out.println("A: " + arr[i][j]);
				}
				if(i==1)
				{
					System.out.println("B: "+arr[i][j]);
				}
			}
		}
		
		
	}
}


RESULT:

Enter Student A mark:
34
Enter Student A mark:
56
Enter Student A mark:
34
Enter Student A mark:
67
Enter Student A mark:
89
Enter Student B mark:
56
Enter Student B mark:
45
Enter Student B mark:
67
Enter Student B mark:
65
Enter Student B mark:
78
A: 34
A: 56
A: 34
A: 67
A: 89
B: 56
B: 45
B: 67
B: 65
B: 78
