package Mapping;
import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		
     Set<String> data = new TreeSet<String>();
     
                 data.add("Guhan");
                 data.add("Anbu");
                 data.add("Kannan");
                 data.add("Guhan");
                 //data.add(null);
                 System.out.println(data);
                 //can not use duplicate values
                 //should not allow null values
                 //[Anbu, Guhan, Kannan]
                 
                 //Directly traversing through iterator
                 
                 Iterator it = data.iterator();
                 while(it.hasNext())
                 {
                	 System.out.println(it.next());
                 }
                 
	}

}


Result:-

Anbu
Guhan
Kannan
