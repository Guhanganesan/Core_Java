package LinkedList;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> object = new LinkedList<String>();
		
		/* Linked List are linear data structures where the elements are not stored
		 * in contiguous locations and every element is a separate object with a 
		 * data part and address part. 
		 * 
		 * Ref: https://www.geeksforgeeks.org/linked-list-in-java/
		 */
		
		// Add Elements 
		
		object.add("Guhan");
		object.add("Anbu");
		object.add("Kannan");
		object.add("Durai");
		//Print Elements
		System.out.println(object);//[Guhan, Anbu, Kannan, Durai]

	}

}
