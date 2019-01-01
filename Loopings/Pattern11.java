import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int rows= sc.nextInt();
		for (int i=1;i<=rows;i++)
		{
             for(int j=rows;j>=i;j--)
             {
            	 System.out.print(j);
             }
             System.out.println();
	    }
   }
}

Result:-
Enter Number of rows
5
54321
5432
543
54
5
