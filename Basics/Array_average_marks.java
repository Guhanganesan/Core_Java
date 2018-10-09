import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		int  sum=0; int i=1,j=1;
		for(i=0; i<=arr.length-1; i++)
		{
		System.out.println("Enter No "+ (i+1) +" Mark");
		int getValue = input.nextInt();
		arr[i]=getValue;
		}
		int count=0;
		for(i=0; i<=arr.length-1; i++)
		{   count++;
			sum=sum +arr[i];
			
	    }
		sum=sum/count;
		System.out.println("The Average is:"+sum );
	}

}

Result:
Enter No 1 Mark
2
Enter No 2 Mark
2
Enter No 3 Mark
2
Enter No 4 Mark
2
Enter No 5 Mark
2
The Average is:2
