package BasicProgram;
public class Fibonacci_series {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		int next=0;
		int count=0;
				while(count<=8) {
				       System.out.print(first+" ");
				       next=first+second;
				       first=second;
				       second=next;
				       count++;

	      }
	}
}
