package BasicOOPS;

public abstract class Ganesan {
	
	public String name="Guhan";
	protected int mob=986986;

	///private abstract void getValues(); cannot make private
	
	protected abstract void getValues();//In-completed method
	
	public abstract void teach();//In completed method
	
	private void run()// can create private method
	{
		System.out.println("Runnning");
	}
	
	protected void go()
	{
		System.out.println("Going to theatre");
	}
	
	public static void main(String[] args) {
		
	  // Ganesan obj = new Ganesan();//Cannot create object
	   
	}

}

