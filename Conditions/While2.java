package Conditional;

public class Using_while {

	public static void main(String[] args) {
		
		int i=0;
		while(i<5)
		{
			System.out.println(i);
			if(i==3)
			{
			 break;
			}
			i++;
		}

	}

}



Result:-
0
1
2
3
