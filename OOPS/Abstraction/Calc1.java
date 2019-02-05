package MyAbstract;

public class Calc1 extends Master{
	
	void add() {
		System.out.println(20+10);
		}

	
	void sub() {
		System.out.println(20-10);	
	}

	
	void mul() {
		System.out.println(20*10);
		}


	public static void main(String[] args) {
		
		//Master obj = new Master();// Can't Instantiate
        Calc1 obj = new Calc1();
              obj.add();
              obj.sub();
              obj.mul();
              obj.test();

	}

	
}

Result:-

30
10
200
Hi
