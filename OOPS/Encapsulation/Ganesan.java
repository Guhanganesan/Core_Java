package BasicOOPS;

public class Ganesan {
	
	public String name="Ganesan";
    protected int mobile=978953;
    private int pin=1234;

	private void getValues()
	{
		System.out.println("Name is: "+ name);
		System.out.println("Mobile is: "+mobile);
		System.out.println("PIN is: "+pin);
	}
	
	public void teach()
	{
		System.out.println("He is teaching");
	}
	
	public static void main(String[] args) {
		
		Ganesan obj =new Ganesan();
		        obj.getValues();    
	}

}


Result:-

Name is: Ganesan
Mobile is: 978953
PIN is: 1234

