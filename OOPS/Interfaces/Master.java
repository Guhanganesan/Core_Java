package MyInterface;

public interface Master {
	abstract void add();
	abstract void sub();
	abstract void mul();
	default void test()
	{
		System.out.println("Test");
	}
	
	static void run()
	{
		System.out.print("Running");
	}
	
	
}
