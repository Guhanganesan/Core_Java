package BasicProgram;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		int a=2;
		int b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
			  int num=sc.nextInt();
				
				for(a=2;a<=num;a++)
				{
					if(num%a==0 && a<=num/2)
					{
						 b=1;
					}
				 }
				if(b==0)
				{
					System.out.println("Given Number is  prime");
				}
				   
				else
				{
					System.out.println("Given Number is not prime");
				}
}  }
