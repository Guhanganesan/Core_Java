package Exception;

public class Exception {
	
	public void calcSalary(int salary)
	{
		try {
				if(salary<=0)
				{
					throw new ArithmeticException("Should not use zero or -ve values");
				}	
				else if(salary>0)
				{
					System.out.println("Your salary is:"+salary);
				}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		Exception ex = new Exception();
		
                  ex.calcSalary(0);
       }

}

Result:-

java.lang.ArithmeticException: Should not use zero or -ve values

