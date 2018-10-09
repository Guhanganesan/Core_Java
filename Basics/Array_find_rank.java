package Array;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		// Enter two students mark and find rank
		
		int[][] arr =new int[2][3]; //2 std, 3 subjects
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		for(int i=0; i<2;i++)
		{
			for(int j=0; j<3;j++)
			{
				int input=sc.nextInt();
				arr[i][j]=input;
			}
		}
		int sum1=0; int sum2=0;
		for(int i=0; i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==0)//for first row
				{
                  		        System.out.println(arr[i][j]);
                    		        sum1=sum1+arr[i][j];
				}
				if(i==1)//for second row
				{
					 System.out.println(arr[i][j]);
                   			 sum2=sum2+arr[i][j];
				}
			}
		}
		
		System.out.println("Sum1: "+sum1+" Sum2: "+sum2);
		
		if(sum1>sum2)
		{
			System.out.println("Student 1 is first rank");
		}
		else if(sum2>sum1)
		{
			System.out.println("Student 2 is first rank");
		}
		else
		{
			System.out.println("both are equal rank");
		}

	}

}



Result:-

Enter marks: 
12
13
14
16
14
15
12
13
14
16
14
15
Sum1: 39 Sum2: 45
Student 2 is first rank
