package MyPackage;

public class Test2TypeCasting {

	public static void main(String[] args) {
		
		//Typecasting 
		
		int m = (int) 344.6325623;
		System.out.println(m);
		
		double d = (double) 23;
		System.out.println(d);
		
		long l = (long)872.36;
		System.out.println(l);
		
		//String s = (String) 55; // cannot
		
		// int s = (int) "55"; // cannot cast String to int
		
		char c = 'Z';
		int ascii = (int) c;
		System.out.println(ascii);
		
		int a =97;
		char mychr = (char) a;
		System.out.println(mychr);

	}

}
