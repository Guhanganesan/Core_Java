package BasicProgram;
public class Seperate_digits_from_number {

	public static void main(String[] args) {
		
		int num=54321;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			System.out.println(rem);
			num=num/10;
		}

	}

}
