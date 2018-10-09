package Basics;

import java.util.Scanner;

public class Compare_three {

	public static void main(String[] args) {
						
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Fisrt Number");
				int a = input.nextInt();
				System.out.println("Enter Second Number");
				int b = input.nextInt();
				System.out.println("Enter Second Number");
				int c = input.nextInt();
				
				if(a>b)
				{
					if(a>c)
					{
						System.out.println("A");
					}
					else if(c>a)
					{
						System.out.println("C");
						
					}
					else
					{
					 System.out.println("A==C");
					 
					}
				}
				else if(b>a)
				{
					System.out.println("B");
				}
				else
				{
					System.out.println("B==A");
				}
			}
	}

RESULT:

Enter Fisrt Number
2
Enter Second Number
4
Enter Second Number
1
B

