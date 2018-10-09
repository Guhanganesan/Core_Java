public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr = {23,45,56,67};
           
           int[] ex = new int[arr.length-1];
           
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the element");
           int getValue = input.nextInt();
           
              int i=0;
        	   for(int j=0; i<=3;  i++)
        	   {
        		   if(arr[i]!=getValue && j<=2)
        		   {
        			   ex[j]=arr[i];
        			   j++;
        		   }
        		   else
        		   {
        			   System.out.println("Removed element:"+arr[i]);
        		   }
        	   }
                System.out.println("Remaing Elements");
        	   for(int k=0;k<=2;k++)
        	   {
        		   System.out.println(ex[k]);
        	   }
        	   
        	   
           }
   }

