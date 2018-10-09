package Array1;

import java.util.Scanner;

public class Array0 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		/*
		System.out.println("Enter number");
		int input = sc.nextInt();
		a[0] =input;
		System.out.println("Enter number");
		input = sc.nextInt();
		a[1] =input;
		System.out.println("Enter number");
		input = sc.nextInt();
		a[2] =input;
		System.out.println("Enter number");
		input = sc.nextInt();
		a[3] =input;
		System.out.println("Enter number");
		input = sc.nextInt();
		a[4] =input;
		*/
		
	    
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter number");
			int input = sc.nextInt();
			a[i] =input;
		}
		/*
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		*/
		
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}


Result:-
Enter number
10
Enter number
20
Enter number
30
Enter number
40
Enter number
50
10
20
30
40
50
