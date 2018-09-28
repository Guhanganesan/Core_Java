package Array;
public class SplitOddEvenPosition {

	public static void main(String[] args) {
		
		  int[] arr = {1,2,3,4,5,6,7,8,9,10};
          int acount=0;int bcount=1;
          for(int i=0;i<arr.length;i++)
          {              	
        	if(i<arr.length/2)
        	{
        		System.out.println(acount+2);
        		acount=acount+2;
        	}
        	if(i>=arr.length/2)
        	{
        		System.out.println(bcount);
        		bcount=bcount+2;
        	}
          }          
	}
}

Result:-
2
4
6
8
10
1
3
5
7
9
