package ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List obj = new ArrayList();
		     obj.add(10);
		     obj.add(20);
		     obj.add(30);
		     obj.add(40);
		     obj.add(50);
	System.out.println("------- Size of the list -------");
	       int size = obj.size();
	       System.out.println(size);

	System.out.println("------- Get values -----");
	
	       Object value = obj.get(1);
	       System.out.println(value);
	
	System.out.println("-------- Remove element ---------");
	       obj.remove(2);
			for(int i=0; i<obj.size();i++)
			{
				System.out.println(obj.get(i));
			}
			
	
	System.out.println("-------- Get Sub List ---------");
		Object new_list = obj.subList(1, 4);//start 1 upto 3
		System.out.println(new_list);
	
	System.out.println("------- Using split iterator-----");

		Spliterator<Object> it = obj.spliterator();
	
		it.forEachRemaining((x)->System.out.println(x));

	}

}


Result:-

------- Size of the list -------
5
------- Get values -----
20
-------- Remove element ---------
10
20
40
50
-------- Get Sub List ---------
[20, 40, 50]
------- Using split iterator-----
10
20
40
50
