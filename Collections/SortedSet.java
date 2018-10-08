package HashTable;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		
		SortedSet set = new TreeSet();
		
		          set.add("guhan");
		          set.add("ram");
		          set.add("anbu");
		          set.add("madan");
		          set.add("nanda");
		          set.add("bala");
    System.out.println("To get sorted set values");   
	System.out.println(set);//[anbu, bala, guhan, madan, nanda, ram]
		          
	System.out.println("Print values using iterator");
	
	Iterator it = set.iterator();
	while(it.hasNext())
	{
	 System.out.println(it.next());	
	}
	
	System.out.println("Get sub set ");
	
    System.out.println(set.subSet("bala","nanda"));//[bala, guhan, madan]
    
    System.out.println("Tail set: "+set.tailSet("guhan"));
    //Tail set: [guhan, madan, nanda, ram]
    
    System.out.println("Head set: "+ set.headSet("guhan"));
    //Head set: [anbu, bala]
    
    //print the first element
    System.out.println(set.first());
    //print the last element
    System.out.println(set.last());
    
    
	}

}


Result:-

To get sorted set values
[anbu, bala, guhan, madan, nanda, ram]
Print values using iterator
anbu
bala
guhan
madan
nanda
ram
Get sub set 
[bala, guhan, madan]
Tail set: [guhan, madan, nanda, ram]
Head set: [anbu, bala]
anbu
ram
