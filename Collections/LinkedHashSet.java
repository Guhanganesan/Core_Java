
package LinkedList;
import java.util.LinkedHashSet;
public class LinkedHasSet {
	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<>();
		
        set.add("Guhan");
        set.add("Anbu");
        set.add("Suresh");
        System.out.println(set);
        
        //Try to add same element
        
        set.add("Anbu");
        System.out.println(set);//[Guhan, Anbu, Suresh] (Can not add dupliacte values)
        
        //System.out.println(set[0]);//It is an un-ordered, cant print using index
        
        //  Remove Elements
        set.remove("Suresh");
        System.out.println(set);//[Guhan, Anbu]
        
        // To convert array
        Object[] arr = set.toArray();
        System.out.println(arr[0]); // Guhan
         
       }
}





