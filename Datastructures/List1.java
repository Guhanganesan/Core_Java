package List1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
 

public class List1 {

	public static void main(String[] args) {
		 
/* The Java List interface, java.util.List, represents an ordered sequence of objects.
*  The elements contained in a Java List can be inserted, accessed, iterated and 
*  removed according to the order in which they appear internally in the Java List. 
*  The ordering of the elements is why this data structure is called a List.
*  
*  List Implementations:
*               java.util.ArrayList
                java.util.LinkedList
                java.util.Vector
                java.util.Stack
*  Creation of List Instance:
*  				List listA = new ArrayList();
				List listB = new LinkedList();
				List listC = new Vector();
				List listD = new Stack();
*  
*  REf: http://tutorials.jenkov.com/java-collections/list.html
*/
  
		List list = new ArrayList();
		
		System.out.println("------- Insert Null Values --------");
		
		Object a = null;
		Object b ="Guhan";
		list.add(a); // we can insert null values
		list.add(b);
		System.out.println(list); //[null, Guhan]
		
		System.out.println("---- Add Elements -----");
		list.add("Anbu");
		list.add("Suresh");
		System.out.println(list);//[null, Guhan, Anbu, Suresh]
		
		System.out.println("----- update elements -----");
		list.set(0, "Rajesh");
		System.out.println(list);//[Rajesh, Guhan, Anbu, Suresh
		list.set(2, "Mohan");
		System.out.println(list);//[Rajesh, Guhan, Mohan, Suresh]
		
		System.out.println("--- Remove Elements ------------");
		list.remove("Mohan");
		System.out.println(list);//[Rajesh, Guhan, Suresh]
		
		System.out.println("--- Find the size of elements-----");
		int size = list.size();
		System.out.println(size);//3
		
		System.out.println("-- Find element exist or not---");
		boolean check= list.contains("Guhan");
		System.out.println(check);//true
		
		System.out.println("----- Add collection of elements----");
		Collection<String> c = new ArrayList();
		                   c.add("Vimal");
		                   c.add("Suba");
		                   c.add("mugund");
		                   System.out.println(c);//[Vimal, Suba, mugund]
		list.addAll(c);
		System.out.println(list);//[Rajesh, Guhan, Suresh, Vimal, Suba, mugund]
		
		System.out.println("---- Get Elements from List----");
		System.out.println(list.get(2));//Suresh
		
		System.out.println("----- Check Equals of object ----");
	    boolean check1 = list.equals(c);
	    System.out.println(check1);//false
	    Object m="Guhan";
	    Object n="Guhan";
	    System.out.println(m.equals(n));//true
	    
	   
	    System.out.println("------ Print the elements ------");
	    
	    Iterator<Object> itr = list.iterator();
	                        // obj.method(); list->obj, its method-->iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println("--- Print the elements using for loop -----");
	    for(Object obj:list)
	    {
	    	System.out.println(obj);
	    }
	    
	}

}

Result:-

------- Insert Null Values --------
[null, Guhan]
---- Add Elements -----
[null, Guhan, Anbu, Suresh]
----- update elements -----
[Rajesh, Guhan, Anbu, Suresh]
[Rajesh, Guhan, Mohan, Suresh]
--- Remove Elements ------------
[Rajesh, Guhan, Suresh]
--- Find the size of elements-----
3
-- Find element exist or not---
true
----- Add collection of elements----
[Vimal, Suba, mugund]
[Rajesh, Guhan, Suresh, Vimal, Suba, mugund]
---- Get Elements from List----
Suresh
----- Check Equals of object ----
false
true
------ Print the elements ------
Rajesh
Guhan
Suresh
Vimal
Suba
mugund
--- Print the elements using for loop -----
Rajesh
Guhan
Suresh
Vimal
Suba
mugund
