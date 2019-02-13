package MyForLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=1234;
		int rem=0;
		int sum=0;
		for(int i=1; i<=4; i++)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
        System.out.println("Reveresed Number is: "+sum);
	}

}
