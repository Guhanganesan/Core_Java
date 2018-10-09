package Conditional;

public class Using_while {

	public static void main(String[] args) {
		
		int i=0;
		do
		{
			System.out.println(i);
			if(i==3)
			{
			 break;
			}
			i++;
		}
		while(i<5);
	}

}

Result:-
0
1
2
3
