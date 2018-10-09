package Conditional;

public class Methods1 {
	
	static int a=10, b=20;
	public static int add()
	{
		return a+b;
	}

	public static void main(String[] args) {
	
		//reeturn value --> Change void to int(return datatype)
		//Use new variable to store the returned value
		
		int result =add();
		System.out.println(result);

	}

}


Result:-

30


