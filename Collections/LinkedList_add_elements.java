package LinkedList;

import java.util.LinkedList;

public class LinkedListAddElements {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		    list.add("Guhan");
		    list.add("Anbu");
		    list.add("Ramesh");
		    list.add("mahesh");
		    list.add("Dina");
		    
		    //Print list
		    System.out.println(list);//[Guhan, Anbu, Ramesh, mahesh, Dina]
		    
		    // Find size of list
		    System.out.println(list.size()); //5
		    
		    //Romove list
		    
		    list.remove(); // fisrt
		    
		    System.out.println(list); //[Anbu, Ramesh, mahesh, Dina]
		    
		    // Remove at specified location
		    
		    list.remove(2);
		    System.out.println(list);//[Anbu, Ramesh, Dina]
		    
		    //Remove by element name
		    
		    list.remove("Ramesh");
		    System.out.println(list);//[Anbu, Dina]
		    
		    // Remove first or remove last
		    
		    list.removeFirst();
		    System.out.println(list);//[Dina]
		    
		    list.removeLast();
		    System.out.println(list); //[]
		    
		    // Check elements available are not
		    
		    boolean check = list.contains("Guhan");
		    System.out.println(check); //false
		    
		    }

}
