package Test1;

public class Test3 {
	
	int a,x;
	Test3()
	{
		this.a=10;
	}
	
	Test3(int x)
	{
		this();
		this.x=x;
		System.out.println(a+x);
	}

	public static void main(String[] args) {
		
		Test3 obj = new Test3(20);
		     
 
	}

}

Result:-
30
