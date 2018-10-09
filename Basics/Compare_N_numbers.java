package BasicProgram;

import java.util.Scanner;
public class Compare_N_numbers {

	public static void main(String[] args) {
	  
		//Compare 5 numbers to check greatest number
		
		Scanner sc = new Scanner(System.in);
		int max=0;
		for(int i=0; i<5;i++)
		{
			System.out.println("Enter "+(i+1)+" st Number");
			int input = sc.nextInt();
			if(max<input)
			{
				max=input;
			}
			
		}
		System.out.println("max is: "+max);
	}

}
