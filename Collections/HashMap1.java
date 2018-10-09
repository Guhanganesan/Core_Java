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
                
     }

}
