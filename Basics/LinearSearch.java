package MyString;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter number"+(i+1));
			int num =sc.nextInt();
			arr[i]=num;
		}
		
		System.out.println("Enter number to search");
		int check=sc.nextInt();
		int i=0;
		for(i=0; i<arr.length;i++)
		{
			if(check==arr[i])
			{
				System.out.println("The number is present at "+(i+1));
			}
			
		}
		if((i+1)==arr.length)
		{
			System.out.println("The number is not present here");
		}

	}

}

Result:-
Enter number1
10
Enter number2
20
Enter number3
30
Enter number4
40
Enter number5
50
Enter number to search
30
The number is present at 3
