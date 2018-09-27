package Array;
public class MaxMin {
	public static void main(String[] args) {
		
		int[] arr = {5,3,4,2,7,6};
		
		int min=arr[0];
		int max=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
        System.out.println("Minimum is: "+min+" and Maximum is: "+max);
	}
}


Result:-

Minimum is: 2 and Maximum is: 7

