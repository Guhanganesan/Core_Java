package DataVariables;

public class Calculator {
	
	int a,b;
	
	Calculator(int x,int y)
	{
		this.a=x;
		this.b=y;
		
	}
	
	void add()
	{
		System.out.println(a+b);
	}
    void sub()
    {
    	System.out.println(a-b);
    }
    void mul()
    {
    	System.out.println(a*b);
    }
    void div()
    {
    	System.out.println(a/b);
    }
	public static void main(String[] args) {
	
		
		Calculator obj = new Calculator(20,10); // Get default results
		
		           obj.add();  
		           obj.sub();
		           obj.mul();
		           obj.div();
   }

}
