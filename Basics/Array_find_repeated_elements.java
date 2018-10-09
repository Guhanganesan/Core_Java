package Array;

public class Repeated_elements {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,4,7,3,7,8,1,0,6,9};
		
		System.out.println("Repeated elements are:");
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
		
	}

}

Result:-
Repeated elements are:
4
6
7
