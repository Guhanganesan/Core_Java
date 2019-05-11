import java.util.Scanner;
class PrimeNumber
{
   public static void main(String[] args)
   {
     Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Number");
	 int num =obj.nextInt();
	 boolean check=false;
	 for(int i=2; i<num; i++)
	 {
		 if(num%i==0)
		 {
			 check=true;
		 }
    }
	if(check==true)
	{
		System.out.println("Not Prime Number");
	}
	else
	{
		System.out.println("Prime Number");
	}
   }
}
