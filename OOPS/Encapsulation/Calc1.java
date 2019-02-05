package MyEncapsulation;

public class Calc1 extends Test1{

	public static void main(String[] args) {
		Test1 obj = new Test1();
		//System.out.println(obj.age); //can't access
		System.out.println(obj.name);
		System.out.println(obj.email);
		 
		obj.add();
		//obj.sub(); //can't call
		obj.mul();


	}

}


Result:-
Test
guhan@gmail.com
Addition
Multiplication
