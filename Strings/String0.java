

    
    String a ="Guhan";//pool
		
		String b = new String("Anu"); // not pool
		       
		       b=a;  //we can swap the values
		        
		System.out.println(b==a); //true
    
    
    String a ="Guhan";//pool
		String b = new String("Guhan");//not pool
		
		System.out.println(a==b);// false, not in pool memory
		
		String n = b.intern(); //pool
		       
		System.out.println(a==n); // both are in pool    ans:true
	
  
  
		
    
    
    
