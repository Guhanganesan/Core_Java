package Conditional;

public class UsingSwitch {

	public static void main(String[] args) {
		
		int number=40;
		
		switch(number)//passing the number
		{
		
		 case 10:
		 case 20:
			 System.out.println(number);
			 break;
		 case 30:
		 case 40:
			 System.out.println(number);
			 break;
		 default:
			 System.out.println(number);
			 break;
			 
		}

	}

}


Result:-
40
