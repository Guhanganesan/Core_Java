class MyClass
{
   public static void main(String[] args)
   {
	   String a=args[0];
	   String b=args[1];
	   int m = Integer.parseInt(a);
	   int n = Integer.parseInt(b);
	   System.out.println(m+n);
   }
   
}


Check in cmd:
javac MyClass.java
java MyClass 10 20

Result:
30
