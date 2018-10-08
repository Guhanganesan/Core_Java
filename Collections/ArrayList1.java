package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		List obj = new ArrayList();
		     obj.add(10);
		     obj.add(20);
		     obj.add(30);
		     obj.add(40);
		     obj.add(50);
		     System.out.println(obj);//[10, 20, 30, 40, 50]
		     
		    System.out.println("Print all values using for loop");
		     
		     for(int i=0; i<obj.size(); i++)
		     {
		    	 System.out.println(obj.get(i));
		     }
		     
		     System.out.println("Print all values using enhanced for loop");
		     
		     for( Object values : obj)
		     {
		    	 System.out.println(values);
		     }
		     
		     System.out.println("Print using iterator class");
		     
		     Iterator<Object> it = obj.iterator();
		     
		     while(it.hasNext())
		     {
		    	 System.out.println(it.next());
		     }
	}

}


Result:-

[10, 20, 30, 40, 50]
Print all values using for loop
10
20
30
40
50
Print all values using enhanced for loop
10
20
30
40
50
Print using iterator class
10
20
30
40
50
