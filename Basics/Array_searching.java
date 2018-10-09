import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,45,56,67};
		int[] ex = new int[arr.length+1];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Replace Element");
		int getValue = input.nextInt();
		
		int j=0; String m = null;
		for(int i=0; i<=3; i++)
		{
			
			if(arr[i]==getValue)
			{
				 System.out.println("Searched Element"+arr[i]);
				 System.out.println("And its Position"+i);
			}
	}
		
		
}

}
