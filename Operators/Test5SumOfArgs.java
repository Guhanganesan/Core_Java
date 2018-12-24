package MyPackage;

public class Test5LoopingArgs {

	public static void main(String[] args) {
		
		int length=args.length;
		int sum=0;
		System.out.println(length);
		//sum of args
		for(int i=0; i<length;i++)
		{
			String s=args[i];
			int m = Integer.parseInt(s);
			sum=sum+m;
		}
		System.out.println("Sum of args: "+ sum);

	}

}
