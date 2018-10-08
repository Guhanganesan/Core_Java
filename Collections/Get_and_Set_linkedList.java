package LinkedList;

import java.util.LinkedList;

public class GetAndSetElements {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Guhan");
		list.add("Anbu");
		list.add("Ramesh");
		list.add("Suresh");
		
		Object element = list.get(1);
		System.out.println(element); //Anbu
		
		//Update element
		
		list.set(2, (String)element);
		
		System.out.println(list); //[Guhan, Anbu, Anbu, Suresh]
		
		list.set(1,"Veda");
		
		System.out.println(list); //[Guhan, Veda, Anbu, Suresh] 
		
		}

}
