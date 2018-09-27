package Array;
public class Minimum {

	public static void main(String[] args) {

		 //Find minimum value in array
		
          int[] arr = {5,3,4,1,6,2,9,7};
          
          int min =arr[0];
          for(int i=0;i<arr.length;i++)
          {
        	  if(min>arr[i])
        	  {
        		  min=arr[i];
        	  }
          }
          System.out.println(min);
	}

}

Result:-

1
