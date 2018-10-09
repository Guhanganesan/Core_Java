package BasicProgram;

public class Operators1 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("-------Basic Operators---------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("------ Increment or Decrement-----");
		
		System.out.println(a++);//post increment
		System.out.println(++a);//pre increment
		
		
		System.out.println("-------- Comparison ----------");
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		System.out.println("----- Logical Operators-----");
		
		if(a>b && a==b)//AND
		{
			System.out.println(a+b);
		}
		else
		{
			System.out.println(a-b);
		}
		
		
		if(a<b || a==b) //OR
		{
			System.out.println(a+b);
		}
		else
		{
			System.out.println(a-b);
		}
		

	}

}



Result:-

  -------Basic Operators---------
  30
  -10
  200
  0
  10
  ------ Increment or Decrement-----
  10
  12
  -------- Comparison ----------
  false
  true
  false
  true
  true
  false
  ----- Logical Operators-----
  -8
  32

