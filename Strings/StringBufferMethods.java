import java.util.*;
public class StringBuffer {
	

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Welcome Java");
		System.out.println(s.capacity());
		/*The capacity is the amount of storageavailable for newly inserted characters, 
		 * beyond which an allocationwill occur.*/
		
	   System.out.println(s.length());//12
	   
	   s.append("World");
	   System.out.println(s);//Welcome JavaWorld
	   
	   s.insert(3,"Hello");
	   System.out.println(s);//WelHellocome JavaWorld
	   
	   //s.reverse();
	   //System.out.println(s);
	   
	   s.delete(0, 3);
	   System.out.println(s);//Hellocome JavaWorld
	   
	   s.deleteCharAt(0);
	   System.out.println(s);

	   s.replace(0, 5, "Hello");
	   System.out.println(s);//Helloome JavaWorld
	   
	   s.replace(0, 8, "Hello");
	   System.out.println(s);//Hello JavaWorld
	   
	   char c=s.charAt(2);
	   System.out.println(c);//l
	   
	  
	   
	   char[] chr = new char[15];
	   
	   s.getChars(2, 8, chr, 0);//0->destination begin
	   for(char i:chr)
	   {
		   System.out.println(i);
	   }
	   
	   int a=s.indexOf("Java");
	   System.out.println(a);//6
	   
	   s.setCharAt(6, 'j');
	   System.out.println(s); 
	   
	   s.setLength(8);
       System.out.println(s);//Hello ja
       
       s.delete(6, 8);
       System.out.println(s);
      
       s.deleteCharAt(4);
       System.out.println(s);//Hell
       
       String s1=s.substring(1, 3);
       System.out.println(s1);//el
       
       CharSequence chr1 =s.subSequence(0, 4);
       
       System.out.println(chr1);//Hell
	}
}
