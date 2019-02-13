package MyForLoop;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int temp=0;
		for(int i=0; i<=10;i++)
		{
			if(i%2!=0)
			{
				temp=temp+i;
			}
		}
		System.out.println("The sum of odd number is: "+temp);

	}

}
