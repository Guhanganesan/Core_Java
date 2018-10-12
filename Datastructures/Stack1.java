package List1;
import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack stk = new Stack();
		
		//Push or add  at top
		System.out.println("Add Elements");
		stk.add("Guhan");
		stk.push("Anbu");
		stk.push("Kannan");
		stk.add("Vimal");
		
		System.out.println(stk);//[Guhan, Anbu, Kannan, Vimal]
		 
	    //Pop
    
		System.out.println("Remove elements");
		stk.pop();//Removes at the top
		System.out.println(stk);//[Guhan, Anbu, Kannan]
		
		System.out.println("Get elements using position");
		Object a = stk.elementAt(2);
		System.out.println(a);//Kannan
		
		Object b=stk.get(2);
		System.out.println(b);//Kannan
		
		System.out.println("Peek element at top");
		Object c=stk.peek();
		System.out.println(c);//Kannan
		
		System.out.println("Search the elements");
		int search1 = stk.search("Anbu");
		boolean search2 = stk.contains("Suresh");
		System.out.println("Available at: "+search1);//2
    	System.out.println(search2);//false

		System.out.println("Find the capacity of stack");
		int capacity = stk.capacity();
		System.out.println(capacity);//10
		
		System.out.println("Add one stack to another");
		Stack new_stk = new Stack();
		new_stk.push("Suresh");
		new_stk.push("Ramesh");
		System.out.println(new_stk);//[Suresh, Ramesh]
		
		stk.addAll(new_stk);
		System.out.println(stk);//[Guhan, Anbu, Kannan, Suresh, Ramesh]
		
		System.out.println("Remove the stack elements");
		stk.remove(2);
		System.out.println(stk);//[Guhan, Anbu, Suresh, Ramesh]
		
		System.out.println("Print the stack elements using while loop");
		Iterator itr = stk.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Print the stack elements using for loop");
		for(Object obj:stk)
		{
			System.out.println(obj);
		}
		
		
		
	}

}


Result:-

Add Elements
[Guhan, Anbu, Kannan, Vimal]
Remove elements
[Guhan, Anbu, Kannan]
Get elements using position
Kannan
Kannan
Peek element at top
Kannan
Search the elements
Available at: 2
false
Find the capacity of stack
10
Add one stack to another
[Suresh, Ramesh]
[Guhan, Anbu, Kannan, Suresh, Ramesh]
Remove the stack elements
[Guhan, Anbu, Suresh, Ramesh]
Print the stack elements using while loop
Guhan
Anbu
Suresh
Ramesh
Print the stack elements using for loop
Guhan
Anbu
Suresh
Ramesh

