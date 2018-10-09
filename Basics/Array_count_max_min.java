package Array;
public class Array2 {
	public static void main(String[] args) {

		int[] arr = {3,5,2,6,5,6,2,1,6,3,1};
		
	    int max=0;int acount=0; int min=arr[0]; int bcount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				acount=1;
			}
			else if(max==arr[i])
			{
				acount++;
			}
			
			if(min>arr[i])
			{
				min=arr[i];
				bcount=1;
			}
			else if(min==arr[i])
			{
				bcount++;
			}
		}
        System.out.println("Max is: "+max+ " Count is:"+acount);
        System.out.println("Min is: "+min+ " Count is:"+bcount);
	}

}


Result:-

Max is: 6 Count is:3
Min is: 1 Count is:2

