package MyForLoop;

public class SumOfDigitOfNumbers {

	public static void main(String[] args) {
		int num=123456;
		int rem=0;
		int sum=0;
		for(int i=1; i<=6; i++)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
