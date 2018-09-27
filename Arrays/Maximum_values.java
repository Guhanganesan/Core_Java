package Array;
public class Maximum {

	public static void main(String[] args) {

		 //Find minimum value in array
		
          int[] arr = {5,3,4,10,6,2,9,7};
          
          int max=0;
          for(int i=0;i<arr.length;i++)
          {
        	  if(max<arr[i])
        	  {
        		  max=arr[i];
        	  }
          }
          System.out.println("Maximum values is: "+max);
	}

}


Result:-

Maximum values is: 10

