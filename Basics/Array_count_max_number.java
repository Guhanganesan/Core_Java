package Array;

public class Array2 {

	public static void main(String[] args) {
 
 // Count max of array and how many times repeated the maximum value

		int[] arr = {3,5,2,6,5,6,2,1,6,3,0};
		
	    int max=0;int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				count=1;
			}
			else if(max==arr[i])
			{
				count++;
			}
		}
        System.out.println("Max is: "+max+ " Count is:"+count);
	}

}

Result:-
Max is: 6 Count is:3
