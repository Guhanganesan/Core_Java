package BasicProgram;
public class Sum_of_even_position_of_number {
	public static void main(String[] args) {
		int num=54321;
		int rem=0;
		int sum=0;
		int count=0;
		while(num>0)
		{
			rem=num%10;
			if(count%2==1)
			{
			sum=sum+rem;
			}
			num=num/10;
			count++;
		}
		System.out.println(sum);
	}
}
