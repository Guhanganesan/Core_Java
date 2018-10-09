package BasicProgram;
public class Factors_of_number {
	public static void main(String[] args) {
	 int num=24;
	 //what all are the numbers divided by 24
	 int count=1;
	 while(count<=num)
	 {
		 if(num%count==0)
		 {
			 System.out.println(count);
		 }
		 count++;
	 }
}

}
