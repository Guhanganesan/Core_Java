package MyEncapsulation;

public class Test1 {
	
	public String name="Test";
	private int age=28;
	protected String email="guhan@gmail.com";
	
	public void add()
	{
		System.out.println("Addition");
	}
	private void sub()
	{
		System.out.println("Subtraction");
	}
	protected void mul()
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.email);
		 
		obj.add();
		obj.sub();
		obj.mul();

	}

}

Result:-

28
Test
guhan@gmail.com
Addition
Subtraction
Multiplication
