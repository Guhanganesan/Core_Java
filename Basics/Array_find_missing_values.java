package Array;

public class Array4 {

	public static void main(String[] args) {
		//Find missing number in array
		
		/*  1. add all velues using n(n+1)/2
		 *  2. subtract each array values from sum
		 */
		
		int[] arr= {1,2,4,5,6};
		
		int sum=0;
		int length=arr.length;
		
		sum=(length+1)*(length+2)/2;
		
		System.out.println(sum);
		
		for(int i=0; i<arr.length;i++)
		{
			sum=sum-arr[i];
		}
		System.out.println(sum);

	}

}


Result:-
21
3
