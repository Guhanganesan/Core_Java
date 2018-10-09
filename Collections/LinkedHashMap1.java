package Mapping;
import java.util.*;
public class LinkedHashMap1 {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> data = new LinkedHashMap<Integer,String>();
		
		data.put(null,"Guhan");
		System.out.println(data);
		data.put(null,"Anbu");
		System.out.println(data);
		
		data.put(1,null);
		data.put(2,null);
		
		System.out.println(data);//It has one null key and more than one null values
		
	}

}


Result:-

{null=Guhan}
{null=Anbu}
{null=Anbu, 1=null, 2=null}
