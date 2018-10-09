package Basics;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
      Scanner obj = new Scanner(System.in);
     
      System.out.println("Enter number");
      
      int a=obj.nextInt();
      for (int i=0; i<=10; i++)
      {
      
      if (i%2==0)
      {
    	  System.out.println(" ");
      }
      
      else 
      {
    	  System.out.println("odd");
      }
     
}

}
	
}