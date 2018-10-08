package HashTable;

import java.util.Hashtable;

public class Hashtable2 {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put(1,"Guhan");
		h.put(2, "Anbu");
		
		// move one to another
		
		Hashtable h1 = new Hashtable();
		
		          h1.putAll(h);
		System.out.println(h1);//{2=Anbu, 1=Guhan} 

	
	}

}
