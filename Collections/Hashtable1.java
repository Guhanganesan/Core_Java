package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		
		Hashtable marks = new Hashtable();
		
	    // Enter marks of diiferent subject
		
		marks.put("Tamil",75.5);
		marks.put("English",64 );
		marks.put("Maths",88.85);
		marks.put("Science", 76);
		
		System.out.println(marks);//{Maths=88.85, Science=76, English=64, Tamil=75.5}
		
		//Get by key
		
		System.out.println(marks.get("Maths")); //88.85
		
		//Replace values
	    marks.replace("Maths",78);
	    System.out.println(marks);//{Maths=78, Science=76, English=64, Tamil=75.5}
	    
	    // Display the values
	    
	    Enumeration e = marks.elements();
	    System.out.println(e.nextElement());
	    
	    //Print all elements
	    
	    while(e.hasMoreElements())
	    {
	    	System.out.println(e.nextElement());
	    }
	    
	    
	    
		
  }

}
