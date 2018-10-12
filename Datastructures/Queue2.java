package List1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		
		Queue q1 = new PriorityQueue();
		//Creates a PriorityQueue with the default initial capacity (11) that 
		//orders its elements according to their natural ordering.
		
		System.out.println("Add Elements");
		q1.add("Guhan");
		q1.add("Anbu");
		q1.add("Raja");
		q1.add("Kannan");
		System.out.println(q1); //[Anbu, Guhan, Raja, Kannan]
		
		System.out.println("Remove elements");
		q1.remove("Raja");
		System.out.println(q1);//[Anbu, Guhan, Kannan]
		
		System.out.println("Get head of element");
		
		Object head = q1.element();
		System.out.println(head);
		
		Object p = q1.peek();
		System.out.println(p);
		
		System.out.println("Convert to Array");
		Object[] arr =  q1.toArray();
		System.out.println(arr[0]);
		//OR
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Check content available or not");
		boolean check=q1.contains("Guhan");
		System.out.println(check);
		
		System.out.println("Prinnt all elements");
		Iterator itr = q1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("Pol method");
		Object pol = q1.poll();
		System.out.println(pol);
		System.out.println(q1);

	}

}


Result:-

Add Elements
[Anbu, Guhan, Raja, Kannan]
Remove elements
[Anbu, Guhan, Kannan]
Get head of element
Anbu
Anbu
Convert to Array
Anbu
Anbu
Guhan
Kannan
Check content available or not
true
Prinnt all elements
Anbu
Guhan
Kannan
Pol method
Anbu
[Guhan, Kannan]
