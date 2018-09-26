package String;
import java.util.Scanner;
public class VowelsByOrder{
	public static void main(String[] args) {
		String input= "i am going to eat an idly";
		String[] x = input.split(" ");
		String temp="";		
		String[] str = new String[5];//for fixed memory
		int count=0;
			for(int i=0; i<x.length; i++)
			{
				temp=x[i];
			char c=temp.charAt(0);
				if((c=='a')|| (c=='e')|| (c=='i')|| (c=='o')|| (c=='u'))
				{
				  str[count]=temp;// it stores vowels words but not alphabetical
				  count++;
				}
		
			}
			
			for(int k=0; k<str.length;k++)
			{
				for(int l=k+1;l<str.length;l++)
				{
					int result=str[k].compareTo(str[l]);
					
					if(result>0)// +ve for true values
					{
						temp=str[k];
						str[k]=str[l];
						str[l]=temp;
					}
				}	
				System.out.println(str[k]);
			}
			
		}
		
		
    }


Result:-

am
an
eat
i
idly
