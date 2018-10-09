package BasicProgram;
public class Palindrome_number {
	public static void main(String[] args) {
		//Palindrome (number and reversed number both are equal)
		int num=343;
		int temp=num;
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10 + rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("palindrome");
		}
		else {System.out.println("Not palindrome");}
	}
}
