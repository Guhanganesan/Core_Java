package Array;
public class SplitOddEvenPosition {

	public static void main(String[] args) {
		
		  int[] arr = {1,2,3,4,5,6,7,8,9,10};
		  //System.out.println(arr.length); 
		  int acount=0;int bcount=1;
          for(int i=0;i<arr.length;i++)
          {              	
        	if(i<arr.length/2)//0,1,2,3,4,
        	{
        		System.out.println(arr[acount]);
        		acount=acount+2;
        	}
        	if(i>=arr.length/2)//5,6,7,8,9
        	{
        		System.out.println(arr[bcount]);
        		bcount=bcount+2;
        	}
          }          
	}
}

Result:-
1
3
5
7
9
2
4
6
8
10
