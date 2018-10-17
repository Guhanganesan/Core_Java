package Inheritance;

//Single level Inheritance

public class BasicCalc  extends MasterCalc{
	
	public void mymethod()
	{
		System.out.println("Welcome to Basic Calculator");
	}
	

	public static void main(String[] args) {
		
		BasicCalc basic = new BasicCalc();
	             
		         basic.mymethod();
		
		         int    output1 =  basic.add(20,10);
		         double output2 =  basic.mul(20, 10);
		         int    output3 =  basic.sub(20, 10);
		         double output4 =  basic.div(20, 10);
		         
		         System.out.println(output1);
		         System.out.println(output2);
		         System.out.println(output3);
		         System.out.println(output4);

	}

}


Result:-
Welcome to Basic Calculator
30
200.0
10
2.0
