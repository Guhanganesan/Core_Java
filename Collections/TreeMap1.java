package Mapping;
import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {
	
       TreeMap<Integer,String> data = new TreeMap<Integer,String>();
       
       data.put(1, "Guhan");
       data.put(4, "Anbu");
       data.put(3,"kesav");
       data.put(2,null);
       System.out.println(data);//{1=Guhan, 2=null, 3=kesav, 4=Anbu}
              
       //Result will be sorted
       //Should not allow null key
       //we can use null values
       
       
	}

}
