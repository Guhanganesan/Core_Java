package MyPackage;

public class Test4CommandLineArgs {

	public static void main(String[] args) {
		
		String x = args[0];
		String y = args[1];
		System.out.println(x+y);
		/* Run -> run cofigurations-> arguments
		 * -> program arguments (here pass values)
		 */
      
		//System.out.println((int)x + (int)y); //cannot
		
		int m = Integer.parseInt(x);
		int n = Integer.parseInt(y);
		System.out.println(m+n);

       
	}

}
