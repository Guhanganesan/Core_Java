import java.util.Scanner;
class Test2
{
   public static void main(String[] args)
   {
     Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Number");
	 int num =obj.nextInt();
	 boolean check=false;
	 for(int i=2; i<num; i++)
	 {
		 //To reduce comparison
		 if(num%i==0 && i<=num/2)
		 {
			 System.out.println(i);
			 check=true;
			 break;
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
