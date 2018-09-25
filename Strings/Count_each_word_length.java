package String;

public class Split {

	public static void main(String[] args) {
		
		String name ="He is my Friend";
		      
		String[] x = name.split(" ");

		//System.out.println(x[0]);
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]+" length is :"+ x[i].length());
		}
		
		/*
		for(String index:x)
		{
			System.out.println(index.length());
		}
		*/
		
    }
}


Result:-

He length is :2
is length is :2
my length is :2
Friend length is :6
