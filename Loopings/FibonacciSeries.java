package MyForLoop;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int first=1;
		int second=1;
		int next=0;
		System.out.println("Fibonacci Series is:");
		for(int i=1; i<=8; i++)
		{
			System.out.print(" "+first);
			next=first+second;
			first=second;
			second=next;
		}
	

	}

}
