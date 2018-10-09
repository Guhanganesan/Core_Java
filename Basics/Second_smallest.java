package Array;
public class SecondLargest {
	public static void main(String args[])
	{
	int arr[] = {22,45,20,34,56,78,64,12,30};
	int first=arr[0];  int second=arr[0];
	for (int i = 0; i < arr.length; i++) 
	{
		if (arr[i]<first)
		{   second=first;
			first=arr[i];
			/*   i=0;    22>0  => s = 0  => f=22
			 *   i=1;    45>22 => s = 22 => f=45
			 *   i=2;    20>45 wrong 20>22 wrong
			 *   i=3;    34>45 wrong 34>22 True second=34
			 *   i=4;    56>34 s => 34  f => 56 and so on..*/
		} 
		else if(arr[i]<second)
		{
			second=arr[i];
		}
	}
	 System.out.println("Second smallest number is: "+second);
   } 
   
   }
   
   Result:-
   
   Second smallest number is: 20





