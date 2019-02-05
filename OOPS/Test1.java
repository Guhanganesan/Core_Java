package Test1;

public class Test1 {
	int a,b,c;
	void set(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	void get()
	{
		System.out.println(a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
              obj.set(10, 20, 30);
              obj.get();
  	}

}

Result:-
10 20 30
