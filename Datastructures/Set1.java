package List1;
import java.util.*;

public class Set1 {

	public static void main(String[] args) {
		/*
		Set Implementations:
		
		Set setA = new EnumSet();
		Set setB = new HashSet();
		Set setC = new LinkedHashSet();
		Set setD = new TreeSet();
        */
		//Create set 
		
		Set set = new HashSet();
				
		System.out.println("Add elements to set");
		set.add("Guhan");
		set.add("Anbu");
		set.add("Ramesh");
		set.add("Suresh");
		set.add("Raja");
		//Result is not index based, so we can not update any elements
		System.out.println(set);//[Raja, Suresh, Guhan, Ramesh, Anbu]
		
		System.out.println("Add duplicate elements");
		set.add("Guhan");
		System.out.println(set);//[Raja, Suresh, Guhan, Ramesh, Anbu], set removes duplicate values
		
		System.out.println("Print elements of set");
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//OR
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		
		System.out.println("Remove elements in set");
		
		set.remove("Ramesh");
		System.out.println(set);//[Raja, Suresh, Guhan, Anbu]
		
		System.out.println("Check the elements available or not");
		
		boolean check=set.contains("Suresh");
		System.out.println(check);//true
		
		System.out.println("Get size of set");
		int size = set.size();
		System.out.println(size);//4
		
		System.out.println("Add collection of elements");
		Collection c = new HashSet();//it may ArrayList,HasSet,LinkedList,TreeSet
	               c.add("Johan");
	               c.add("Kenin");
	               
	               set.addAll(c);
	   System.out.println(set);//[Raja, Suresh, Johan, Guhan, Kenin, Anbu]
	   
	   System.out.println("Remove collection of elements from set");
	               set.removeAll(c);
	               System.out.println(set);//[Raja, Suresh, Guhan, Anbu]
	   	
	   
		
	}

}


Result:-
        Add elements to set
        [Raja, Suresh, Guhan, Ramesh, Anbu]
        Add duplicate elements
        [Raja, Suresh, Guhan, Ramesh, Anbu]
        Print elements of set
        Raja
        Suresh
        Guhan
        Ramesh
        Anbu
        Raja
        Suresh
        Guhan
        Ramesh
        Anbu
        Remove elements in set
        [Raja, Suresh, Guhan, Anbu]
        Check the elements available or not
        true
        Get size of set
        4
        Add collection of elements
        [Raja, Suresh, Johan, Guhan, Kenin, Anbu]
        Remove collection of elements from set
        [Raja, Suresh, Guhan, Anbu]
