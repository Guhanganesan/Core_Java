package BasicProgram;
public class Count_number_of_odd_numbers {
	public static void main(String[] args) {
		int num=987654321;
		int rem=0;
		int count=1;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println("Number of odd number is: "+count);
	}
}
