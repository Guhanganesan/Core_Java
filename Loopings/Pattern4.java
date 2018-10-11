package looping;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i=3; i>=0; i--)//3,2,1,0
		{
			for(int j=0; j<=i; j++)//{0<=3,1<=3,2<=3,3<=3},
			{				
				System.out.print(" ");
	        }
			for(int k=3; k>=i; k--)//{3>=3}, {3>=2, 2>=2,},{3>=1,2>=1,1>=1,},
			{  // {3>=0, 2>=0,},{3>=0,2>=0,1>=0,0>=0}
				System.out.print("*"); 					
			}
			System.out.println();
	  }

	}

}


Result:-

    *
   **
  ***
 ****
