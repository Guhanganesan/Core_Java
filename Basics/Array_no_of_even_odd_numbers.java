package Array;

public class Count_odd_even {

	public static void main(String[] args) {
		
		int[] arr= {2,4,5,1,4,6,3,7,8,2,9,0};
		
		int even_count=0; int odd_count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				even_count++;
			}
			if(arr[i]%2==1)
			{
				odd_count++;
			}
		}
		System.out.println("No of even: "+even_count);
		System.out.println("No of odd: "+odd_count);
	}

}


Result:-

No of even: 7
No of odd: 5
