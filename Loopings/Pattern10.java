public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int rows= sc.nextInt();
		for (int i=rows;i>=1;i--)
		{
             for(int j=i;j>=1;j--)
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
4321
321
21
1
