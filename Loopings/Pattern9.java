public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int rows= sc.nextInt();
		for (int i=rows;i>=1;i--)
		{
             for(int j=1;j<=i;j++)
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
12345
1234
123
12
1
