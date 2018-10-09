package Mapping;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> data = new HashMap<Integer,String>();
                data.put(1,"Guhan");
                data.put(2, "Anbu");
                data.put(2, "Rajesh");//duplicate key 
                data.put(3,"Ram");
                data.put(null, "Jeha");// null is allowed
                            
                System.out.println(data);//duplicate key will not allow
              
                System.out.println("--- get value by key-----");    
                System.out.println(data.get(3));
                
                System.out.println("--- Remove by key -----");
                data.remove(null);
                System.out.println(data);
                
                System.out.println("--- Replace values ---");
                data.replace(3,"Kumar");
                System.out.println(data);
                
                
                System.out.println("--- print key and values---");

                //Traversing the map
                
                Set set = data.entrySet();
                
                Iterator itr = set.iterator();
                
                while(itr.hasNext())
                {
                System.out.println(itr.next());	
                }
     }

}

Result:-

{null=Jeha, 1=Guhan, 2=Rajesh, 3=Ram}
--- get value by key-----
Ram
--- Remove by key -----
{1=Guhan, 2=Rajesh, 3=Ram}
--- Replace values ---
{1=Guhan, 2=Rajesh, 3=Kumar}
--- print key and values---
1=Guhan
2=Rajesh
3=Kumar
