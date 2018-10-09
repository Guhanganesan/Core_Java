package Array;
public class Maximum {

	public static void main(String[] args) {

		 //Find maximum value in array
		
          int[] arr = {5,3,4,10,6,2,10,9,7};
          
          int max=0;int temp=0;
          for(int i=0;i<arr.length;i++)
          {
        	  if(arr[i]>max)
        	  {
        		  max=arr[i];
        		  temp=i;
        	  }
          }
          System.out.println("Maximum values is: "+max);
                   
          for(int j=0;j<arr.length;j++)
          {
        	  if(max==arr[j])
        	{
        	System.out.println("Max is:"+max+" and its"
        			+ "postions is: "+j);
        	}
          }
	}
	
}

Result:-

Maximum values is: 10
Max is:10 and its postions is: 3
Max is:10 and its postions is: 6
