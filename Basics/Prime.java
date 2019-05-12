//Range of prime numbers
import java.util.Scanner;
class Test
{
    public static void main(String[] args)
	{
	 
	 for(int k=50; k<=100; k++)
	 {
		 boolean check=false;
		 for(int start=2; start<k/2; start++)
		 {
			 if(k%start==0)
			 {
				 check=true;
			 }
		 }
		 if(check==false)
		 {
			 System.out.println(k);
		 } 
     }
	 
	 
	 
   }    
}
