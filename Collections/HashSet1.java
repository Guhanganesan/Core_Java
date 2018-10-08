package HashTable;

import java.util.HashSet;

public class HasSet1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		        hs.add("Guhan");
		        hs.add("Anbu");
		        hs.add("Ram");
		        
		System.out.println(hs);//[Guhan, Anbu, Ram]
		
		System.out.println("The size of set: "+hs.size());
		
		System.out.println("Trying to add same value");
		        hs.add("Anbu");
	    System.out.println(hs);//[Guhan, Anbu, Ram] cant add duplicate 

	    System.out.println("Remove element");
	            hs.remove("Ram");
	    System.out.println(hs);//[Guhan, Anbu]
	    
	    System.out.println("Check element available or not");
	    
	    System.out.println(hs.contains("Ram")); //false
	    
	 }

}


Result:-

[Guhan, Anbu, Ram]
The size of set: 3
Trying to add same value
[Guhan, Anbu, Ram]
Remove element
[Guhan, Anbu]
Check element available or not
false
