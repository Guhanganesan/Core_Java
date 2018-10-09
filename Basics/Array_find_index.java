package Basics;
import java.util.Scanner;
public class FindIndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr = {23,45,56,67};
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the element");
           int getValue = input.nextInt();
           for(int i=0;i<=arr.length-1;i++)
           {  
        	   if(arr[i]==getValue)
        	   {  
        		  System.out.println("Element:"+arr[i]);
        		  System.out.println("Index:"+i);
        		  break;
        	   }
           }
	}

}
