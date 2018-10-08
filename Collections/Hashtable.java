package HashTable;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
	
		Hashtable h = new Hashtable();
		          h.put(1,"Guhan");
		          h.put(2, "Anbu");
		          h.put(3, "Raja");
                  h.put(4, "Vimal");
                  System.out.println(h); //{4=Vimal, 3=Raja, 2=Anbu, 1=Guhan}
                  
                  // Copy the data
       Hashtable h1 = new Hashtable();
                 h1 = (Hashtable) h.clone();
                 
                 System.out.println(h1); //{4=Vimal, 3=Raja, 2=Anbu, 1=Guhan}
                 
                 //Remove data
                 h.remove(2);
                 System.out.println(h);//{4=Vimal, 3=Raja, 1=Guhan}
                 
                 // Get data
                 String name = (String) h.get(3);
                 System.out.println(name); //Raja
	}

}
