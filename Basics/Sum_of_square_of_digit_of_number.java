package BasicProgram;
public class Sum_of_square_of_digit_of_number {
	public static void main(String[] args) {
		
		int num=54321;
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
