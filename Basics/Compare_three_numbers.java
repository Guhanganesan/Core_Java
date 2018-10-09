package BasicProgram;
public class Compare_three_numbers {
	public static void main(String[]args)
	{   int a=10,b=20,c=30;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");	
			}
			else if(c>a)
			{
				System.out.println("C is greater");
			}
			else
			{
				System.out.println("C and A are equal");
			}
		}
		else if(b>a)
		{
			if(b>c)
			{
				System.out.println("B is greater");
			}
			else if(c>b)
			{
				System.out.println("C is greater");
			}
			else
			{
				System.out.println("B and C are equal");
			}
			
		}
		else 
		{
			if(a==b && a==c)
			{
				System.out.println("A  B  and C are equal");
			}
			else
			{				
				System.out.println("A and B are equal");
			}
		}
 } 
}

