package MyCollections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class MyLinkedList {
	
  public static void main(String[] args) {
	
		//List<String> list = new LinkedList<String>();
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
	    
	    list.add("Guhan");
		list.add("Anbu");
		list.add("Ramesh");
		list.add("Suresh");
		
	    
	    Object element = list.get(1);
		System.out.println(element); //Anbu
		
		//Update element
		
		list.set(2, (String)element);
		
		System.out.println(list); //[Guhan, Anbu, Anbu, Suresh]
		
		list.set(1,"Veda");
		
		System.out.println(list); //[Guhan, Veda, Anbu, Suresh] 
		
		Collection<String> collection = new LinkedList<String>();
        collection.add("Kanesan");
        collection.add("Guhan");
        collection.add("Anbu");
        
        list.addAll(collection);
        System.out.println(list);
        
        Iterator desc =list.descendingIterator();
        while(desc.hasNext())
        {
        	System.out.println(desc.next());
        }
        
        
        String elm = list.element();
        System.out.println(elm);//retirieves first element
        
         ListIterator<String> lisitr = list.listIterator(2);//starts from 2
         while(lisitr.hasNext())
         {
        	 System.out.println(lisitr.next());
         }
        
         list.offer("Arun");//last
         System.out.println(list);
         System.out.println(list.peek());//Retrieve but doest not remove, first
         System.out.println(list.poll());//remove head first
         System.out.println(list.poll());//Dequeue
         System.out.println(list);
         
         System.out.println(list.pop());//remove and returns the first element
         
        
}

}
