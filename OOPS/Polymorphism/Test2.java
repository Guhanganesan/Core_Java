package Polymorpism;

public class Test2 extends Test1{
	int a=30;
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
		
		Test1 obj;
		obj = new Test2();
		
	      obj.fees();
	      obj.fees(2);
          obj.fees(22,20.5f);
        Test1 obj1 = new Test1();
        obj1.fees();
	}

}
Result:-
50
32
72.5
30
