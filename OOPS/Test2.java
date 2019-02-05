package Test1;

class Test2 {

	int a,b,c;
	Test2(int x,int y,int z)
	{
		// check with same a,b,c instead of x,y,z
		a=x;
		b=y;
		c=z;
	}	
	void get()
	{
		//System.out.println(a+" "+b+" "+c);
		this.a=23;
		System.out.println(a);
	}
	
	void test()
	{
		this.get();
	}
	
	public static void main(String[] args) {
		
		Test2 obj1 = new Test2(10,20,30);
              obj1.get();
  	}

}


Result:-
23
