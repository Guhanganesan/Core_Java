package BasicProgram;

public class Sum_of_N_numbers {

	public static void main(String[] args) {
		int[] arr = {12,23,10,22,56,60};
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}
