package AprilTask;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFiles {
	
	public int[] m=new int[4];
	public void listPath(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles(); 
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()){
                listPath(file.getAbsolutePath());
            }
        }
		       
    }

	public String listFiles(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        StringBuilder sb=new StringBuilder(); 
        for (File file : fList){
            if (file.isFile()){
                //System.out.println(file.getAbsolutePath());
                sb.append(file.getName()+"\n");
            } else if (file.isDirectory()){
                listFiles(file.getAbsolutePath());
            }
        }
        String result=sb.toString();
        System.out.println(result);
        return result;
        
    }
	
	
	public void getInfo(String directoryName){
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                
				File myObj = new File(file.getAbsolutePath());
					if (myObj.exists()) {
						System.out.println("File name: " + myObj.getName());
						System.out.println("File size in bytes " + myObj.length());
						System.out.println(myObj.lastModified());
						SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
						System.out.println("Last Modified : " + sdf.format(myObj.lastModified()));
					} 
					else {
					  System.out.println("The file does not exist.");
					}
                
            } 
			else if (file.isDirectory()){
                getInfo(file.getAbsolutePath());
            }
        }
 }  
	
	
	public void getCount(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        StringBuilder sb=new StringBuilder(); 
        for (File file : fList){
            if (file.isFile()){
            	System.out.println(file.getAbsolutePath());
                sb.append(file.getName());
            } else if (file.isDirectory()){
                getCount(file.getAbsolutePath());
            }
        }
        String res=sb.toString();
        System.out.println(res);
        int[] count=new int[4];
		String[] format={"txt","pdf","xml","docx"};
		for(int i=0; i<format.length; i++)
		{
			
	        Pattern pattern = Pattern.compile(format[i]);
		    Matcher matcher = pattern.matcher(res);
		    while (matcher.find())
		    {
		        count[i]++;
		        m[i]++;
		    }
		}
		
		System.out.println("text : "+count[0]+" pdf : "+count[1]+" xml : "+count[2]+" docx : "+count[3]);
		
    }	
	

	public static void main(String[] args) {
		
		 

	}

}
