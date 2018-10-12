package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List2 {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		System.out.println("Add elements in List 1");
		     list1.add("Guhan");
		     list1.add("Anbu");
		     list1.add("Kannan");
		     list1.add("Durai");
	         System.out.println(list1); //[Guhan, Anbu, Kannan, Durai]
	    
	   System.out.println("Add elements in list2");
	   List list2 = new ArrayList();
	        list2.add("Ramesh");
	        list2.add("Kesav");
	        System.out.println(list2);//[Ramesh, Kesav]
	       
	  System.out.println("Add list2 in list1 ");

	       list1.addAll(list2);
	       System.out.println(list1);//[Guhan, Anbu, Kannan, Durai, Ramesh, Kesav]
      
	  System.out.println("Access elements from list");
	  
	     Object a=list1.get(2);//first way
	     String b=(String) list1.get(3);//second way
	     System.out.println(a+ " "+b);//Kannan Durai
	     
      System.out.println("Find the elements in a list");
      
         int m = list1.indexOf("Kannan");
         System.out.println(m);//2
         int n = list1.lastIndexOf("Kannan");
         System.out.println(n);//2
         
         list1.add("Kannan");
         System.out.println(list1);//[Guhan, Anbu, Kannan, Durai, Ramesh, Kesav, Kannan]
         int k = list1.lastIndexOf("Kannan");
         System.out.println(k);//6
         
         
    System.out.println("Get sub list from list");
    
         Object sub = list1.subList(1, 4);
         System.out.println(sub);//[Anbu, Kannan, Durai]
         
    System.out.println("Convert list to set");
    
         Set set = new HashSet();
         set.addAll(list1);
         System.out.println(set);//[Kannan, Guhan, Ramesh, Durai, Kesav, Anbu]
   
    System.out.println("Convert list to array");
 
         Object[] arr = list1.toArray();
         System.out.println(arr[2]);//Kannan
         for(int i=0; i<arr.length;i++)
         {
        	 System.out.println(arr[i]);
         }
         
    System.out.println("Convert list to Array");
    
       List list3 = Arrays.asList(arr);
       System.out.println(list3);//[Guhan, Anbu, Kannan, Durai, Ramesh, Kesav, Kannan]
       
    }

}

Result:-
Add elements in List 1
[Guhan, Anbu, Kannan, Durai]
Add elements in list2
[Ramesh, Kesav]
Add list2 in list1 
[Guhan, Anbu, Kannan, Durai, Ramesh, Kesav]
Access elements from list
Kannan Durai
Find the elements in a list
2
2
[Guhan, Anbu, Kannan, Durai, Ramesh, Kesav, Kannan]
6
Get sub list from list
[Anbu, Kannan, Durai]
Convert list to set
[Kannan, Guhan, Ramesh, Durai, Kesav, Anbu]
Convert list to array
Kannan
Guhan
Anbu
Kannan
Durai
Ramesh
Kesav
Kannan
Convert list to Array
[Guhan, Anbu, Kannan, Durai, Ramesh, Kesav, Kannan]
