package String;
public class OddEven {

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,6,5,0,3,8,7};
				
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%2==1)
				{
					System.out.println(arr[j]);
				}
			}
			
			for(int k=0;k<arr.length;k++)
			{
				if(arr[k]%2==0)
				{
					System.out.println(arr[k]);
				}
			}
		}

}


Result:-
1
5
3
7
2
4
6
0
8
