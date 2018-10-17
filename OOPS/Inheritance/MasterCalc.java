package Inheritance;

public class MasterCalc {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public double div(int a, int b)
	{
		return a/b;
	}
	public double percent(int a)
	{
		return a/100;
	}
	public double avg(int a,int b, int c) 
	{
		int res=a+b+c;
		return (res/3);
	}
	
}
