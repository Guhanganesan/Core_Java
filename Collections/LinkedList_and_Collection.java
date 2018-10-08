package LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListAddAll {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		                   list.add("Guhan");
		                   list.add("Anbu");
		                   list.add("Kannan");
	 System.out.println(list);
	 //[Guhan, Anbu, Kannan]
		                   
	 //To use addAll -> collection of elements will be added in list
		                   
	 Collection<String> collection = new ArrayList<String>();
		                   collection.add("Kanesan");
		                   collection.add("Sathtayee");
		                   collection.add("JayaSree");
	  //To add collection into list
		                   
	  // list.addAll(collection);
	 
	 //Check collection of elements are added or not in list
	  
	//  System.out.println(list);
	  
   //[Guhan, Anbu, Kannan, Kanesan, Sathtayee, JayaSree] 
	  
	  
	// Appending the collection to list at specified location
	  
	  list.addAll(1,collection);
	  
	  System.out.println(list);
	//[Guhan, Kanesan, Sathtayee, JayaSree, Anbu, Kannan]	                   
  }
}
