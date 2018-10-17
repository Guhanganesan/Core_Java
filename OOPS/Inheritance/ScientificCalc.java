package Inheritance;

//Multilevel Inheritance

public class ScientificCalc extends BasicCalc{
	
	public void mymethod()
	{
		System.out.println("Welcome to Scientific Calculator");
	}

	public static void main(String[] args) {
		
		ScientificCalc sci = new ScientificCalc();
		sci.mymethod();
		
		int    output1 =  sci.add(20,10);
        double output2 =  sci.mul(20, 10);
        int    output3 =  sci.sub(20, 10);
        double output4 =  sci.div(20, 10);
        double output5 =  sci.sum(10,20,30);
        double output6 =  sci.avg(10, 20, 30);
        
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
        System.out.println(output6);

	}

}

Result:-
Welcome to Scientific Calculator
30
200.0
10
2.0
60.0
20.0
