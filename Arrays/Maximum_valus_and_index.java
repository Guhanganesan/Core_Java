package Array;
public class Maximum {

	public static void main(String[] args) {

		 //Find maximum value in array
		
          int[] arr = {5,3,4,10,6,2,9,7};
          
          int max=0;int temp=0;
          for(int i=0;i<arr.length;i++)
          {
        	  if(arr[i]>max)
        	  {
        		  max=arr[i];
        		  temp=i;
        	  }
          }
          System.out.println("Maximum values is: "+max+" and its index is:"+temp);
	}

}

Result:-

Maximum values is: 10 and its index is:3



