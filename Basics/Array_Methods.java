public class Test{
	static int sum;
	static void sum(int[] args)
	{
		for(int i=0; i<args.length; i++)
		{
		sum=sum+args[i];
		}
		System.out.println("Array sum is: "+ sum);
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		//length
		System.out.println(arr.length);
		//for loop
	    for(int i=0; i<arr.length; i++)
	    {
	    	//System.out.println(i);
	    }
	    //foreach
	    for(int i: arr)
	    {
	    	//System.out.println(i);
	    }
	   
	    //update elements
	    arr[0]=0;
	    arr[1]=10;
	    arr[2]=20;
	    arr[3]=30;
	    arr[4]=40;
	    arr[5]=50;
	    for(int a:arr)
	    {
	    	//System.out.println(a);
	    }
	    
	   //Get Elements
	   System.out.println(Array.get(arr, 2));
	   
	  //Set & get 
	   Array.set(arr, 0, 500);
	   System.out.println(arr[0]);
	   System.out.println(Array.getDouble(arr, 0));
	   //Find length
	   System.out.println(Array.getLength(arr));
	   
	   //Anonymous Array
	   Test.sum(new int[] {5,4,3,2,1});
	   
	     
	   
	}
}

Answer:
6
20
500
500.0
6
Array sum is: 15
