package Basics;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
      Scanner obj = new Scanner(System.in);
     
      System.out.println("Enter number");
      
      int number = obj.nextInt();
      
      for (int i=0 ; i<number; i++)
  
      {    
	      if (i%2==1)
	      {
	    	  System.out.println(i);
	      }
	      
     
      }

	}
}
