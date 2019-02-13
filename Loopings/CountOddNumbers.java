package MyForLoop;

public class CountOddNumbers {

	public static void main(String[] args) {
		int count=0;
		for(int i=0; i<=10; i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.println("Number of odd number is: "+count);

	}

}
