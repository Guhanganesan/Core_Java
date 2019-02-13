package MyForLoop;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num=10110;
		int rem=0;
		double sum=0;
		for(int count=0; count<6; count++)
		{
			rem=num%10;
			sum=sum+rem*(Math.pow(2,count));
			num=num/10;
		}
        System.out.println(sum);
	}

}
