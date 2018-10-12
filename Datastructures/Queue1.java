package List1;
import java.util.*;
public class Queue1 {

	public static void main(String[] args) {
		
		/*  Queue Implementations:
		   						java.util.LinkedList
           						java.util.PriorityQueue 
		 */
		
		Queue q1 = new LinkedList();
		Queue q2 = new PriorityQueue();
		
		//Using liked list
		System.out.println("Add Elements");
		q1.add("Guhan");
		q1.add("Anbu");
		q1.add("Raja");
		q1.add("Kannan");
		System.out.println(q1); //[Guhan, Anbu, Raja, Kannan]
		
		System.out.println("Remove elements");
		q1.remove("Raja");
		System.out.println(q1);//[Guhan, Anbu, Kannan]
		
		System.out.println("Get head of element");
		
		Object head = q1.element();
		System.out.println(head);//Guhan
		
		Object p = q1.peek();
		System.out.println(p);// Guhan
		
		System.out.println("Convert to Array");
		Object[] arr =  q1.toArray();
		System.out.println(arr[0]);//Guhan
		//OR
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Check content available or not");
		boolean check=q1.contains("Guhan");
		System.out.println(check);//true
		
		System.out.println("Prinnt all elements");
		Iterator itr = q1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("Pol method");
		Object pol = q1.poll();//Removes and returns head og queue
		System.out.println(pol);//Guhan
		System.out.println(q1);//[Anbu, Kannan]
		
		//you can use addAll(), equals, size(), silimar to other
		
	}

}


Result:-
Add Elements
[Guhan, Anbu, Raja, Kannan]
Remove elements
[Guhan, Anbu, Kannan]
Get head of element
Guhan
Guhan
Convert to Array
Guhan
Guhan
Anbu
Kannan
Check content available or not
true
Prinnt all elements
Guhan
Anbu
Kannan
Pol method
Guhan
[Anbu, Kannan]
