package String;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string to sort each words");
		
		String input = sc.nextLine();
		      
		String[] x = input.split(" ");
        
		String temp;
				
		for(int i=0; i<x.length; i++)
		{
			for(int j=0;j<x.length;j++)
			{
				int result = x[i].compareTo(x[j]);
				if(result>0)
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		
		for (int k=x.length-1;k>=0; k--)
		{
			System.out.println(x[k]);
		}
		
    }
}


Result:-

Please enter a string to sort each words
he is my dear friend anbu
anbu
dear
friend
he
is
my

