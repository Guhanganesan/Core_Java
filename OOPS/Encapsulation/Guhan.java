package BasicOOPS;

public class Guhan extends Ganesan{
 
	public void write()
	{
		System.out.println("He is writing");
	}
	
	public static void main(String[] args) {
		
		Guhan gh = new Guhan();
		
		Ganesan ga = new Ganesan();
		
		       gh.teach();// He is teaching
		System.out.println(gh.mobile);//978953
		System.out.println(gh.name);//Ganesan
		// Cannot access private method or private properties
		
                //ga.write(); Cannot call child class method
		        
		 gh.write(); // He is writing
		        
                
	}

}
