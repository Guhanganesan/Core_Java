package Polymorpism;

public class Test1 {
	int a=10;
	//Method Overloading
	void fees()
	{
		System.out.println(a+20);
	}
	void fees(int xerox)
	{
		System.out.println(a+xerox);
	}
	void fees(int xerox, float books)
	{
		System.out.println(a+xerox+books);
	}

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		      obj.fees();
		      obj.fees(20);
              obj.fees(20,20.5f);
	}

}

Result:-
30
30
50.5
