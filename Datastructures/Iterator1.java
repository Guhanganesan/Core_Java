package List1;

import java.util.*;
public class Iterator1 {

	public static void main(String[] args) {
		

		List list = new ArrayList();
		
		     list.add("Guhan");
		     list.add("Anbu");
		     list.add("Raja");
		     list.add("Jegan");
		     
	 System.out.println("Print array list using Iterator");
	 Iterator itr = list.iterator();
	 while(itr.hasNext())
	 {
		System.out.println(itr.next()); 
	 }
	 
	 System.out.println("Print array list using for each");
	 for(Object obj:list)
	 {
		 System.out.println(obj);
	 }
	 
	}

}


Result:-
Print array list using Iterator
Guhan
Anbu
Raja
Jegan
Print array list using for each
Guhan
Anbu
Raja
Jegan

