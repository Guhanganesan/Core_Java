package List1;
import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		    /*
			    Map implementations:
				java.util.HashMap
				java.util.Hashtable
				java.util.EnumMap
				java.util.IdentityHashMap
				java.util.LinkedHashMap
				java.util.Properties
				java.util.TreeMap
				java.util.WeakHashMap
			*/
		
		Map map = new HashMap();
	    System.out.println("Add Elements in map");
	    map.put("name", "Guhan");
	    map.put("age", 28);
	    map.put("mobile", 986986);
	    System.out.println(map);//{name=Guhan, mobile=986986, age=2}
	    
	    System.out.println("update map");
	    map.put("age",27);//can not insert new key if already exists
	    System.out.println(map);//{name=Guhan, mobile=986986, age=27}
	    
	    System.out.println("Insert null key");
	    map.put(null,"raja");
	    System.out.println(map);//{null=raja, name=Guhan, mobile=986986, age=27}
	    
	    System.out.println("Insert null values");
	    map.put("addr",null);
	    System.out.println(map);
	    //{null=raja, name=Guhan, mobile=986986, addr=null, age=27}
	    
	    System.out.println("Get values");
	    Object a=map.get("age");
	    System.out.println(a);//27
	    
	    System.out.println("Remove values");
	    map.remove(null);
	    System.out.println(map);
	    //{name=Guhan, mobile=986986, addr=null, age=27}
	    
	   System.out.println("Get all values");
	   Object values =  map.values();
	   System.out.println(values);//[Guhan, 986986, null, 27]
	   
	   System.out.println("Get all keys");
	   Object keys = map.keySet();
	   System.out.println(keys);//[name, mobile, addr, age]
	   
	   System.out.println("Check key is available or not");
	   boolean check = map.containsKey("mobile");
	   System.out.println(check);//true
	   
	   System.out.println("Add another map");
	   
	   Map map1 = new HashMap();
	       map1.put("street","south");
	       map1.put("door", "12/A");
	   System.out.println(map1);//{door=12/A, street=south}
       map.putAll(map1);
	   System.out.println(map);
	   //{door=12/A, street=south, name=Guhan, mobile=986986, addr=null, age=27}
	   
	   System.out.println("Print all keys");
	   Iterator itr = map.keySet().iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());  
	    
	   }
	   
	   
	   System.out.println("Print all values");
	   for(Object obj:map.values())
	   {
		  System.out.println(obj);
	   }
	   
 }
} 


Result:-

Add Elements in map
{name=Guhan, mobile=986986, age=28}
update map
{name=Guhan, mobile=986986, age=27}
Insert null key
{null=raja, name=Guhan, mobile=986986, age=27}
Insert null values
{null=raja, name=Guhan, mobile=986986, addr=null, age=27}
Get values
27
Remove values
{name=Guhan, mobile=986986, addr=null, age=27}
Get all values
[Guhan, 986986, null, 27]
Get all keys
[name, mobile, addr, age]
Check key is available or not
true
Add another map
{door=12/A, street=south}
{door=12/A, street=south, name=Guhan, mobile=986986, addr=null, age=27}
Print all keys
door
street
name
mobile
addr
age
Print all values
12/A
south
Guhan
986986
null
27
