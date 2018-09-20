public class FirstMethod {
	
	
	String name;
	int a;
	String new_memory;
	FirstMethod(String m)
	{
		
		this.name="Java";
		this.a=100;
		System.out.println("HI");
		System.out.println(m);
		this.new_memory=m;
	}
	
	void details()
	{
		
		System.out.println(this.name);
		System.out.println(this.new_memory);

	}
	
    public static void main(String[] args) {
	
		
     FirstMethod obj = new FirstMethod("Payilagam");
                 
                 obj.details();
		
		
		
	}
}

