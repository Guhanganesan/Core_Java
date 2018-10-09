import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,45,56,67};
		int[] ex = new int[arr.length+1];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Replace Element");
		int replace = input.nextInt();
		System.out.println("Enter Position:");
		int position = input.nextInt();
		int j=0;
		for(int i=0; i<=3;)
		{
			
			if(arr[position]!=replace)
			{
				 arr[position]=replace;
				 j++;i++;
				 break;
			}
			/*if(arr[i]==position)
			{
				arr[i]=arr[j];
			}
			*/
			
		}
		for(int k=0; k<=arr.length-1;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
