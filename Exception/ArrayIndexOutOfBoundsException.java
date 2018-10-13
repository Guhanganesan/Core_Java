package Exception;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		try {
			
			for(int i=0; i<4;i++)//should use i<arr.length
			{
				System.out.println("Enter array element");
				int m =sc.nextInt();
				arr[i]=m;
			}
			System.out.println("Array elements are: ");
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[j]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Check the array size");
		}

	}

}

Result:-

Enter array element
10
Enter array element
20
Enter array element
30
Enter array element
40
Check the array size
