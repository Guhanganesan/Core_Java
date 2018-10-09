package BasicOOPS;

public class Guhan extends Ganesan{
 
	public void getValues()//should give definiton
	{
		System.out.println(name+" "+mob);
	}
	
	public void teach()//should give definiton
	{
		System.out.println("He is teaching");
	}
	public void write()
	{
		System.out.println("He is writing");
	}
	public static void main(String[] args) {
		
		Guhan gh = new Guhan();
		      gh.getValues();
		      gh.teach();
		      gh.write();
		      //gh.run(); cannot access private method
		      gh.go();
		      
		   
		
		//Ganesan ga = new Ganesan(); //Cannot create object in child class	
                
	}

}



Result:-

Guhan 986986
He is teaching
He is writing
Going to theatre
