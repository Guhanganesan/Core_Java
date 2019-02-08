package MyFiles;
import java.io.FileWriter; 
import java.io.IOException; 

public class WriteFile {

	public static void main(String[] args) throws IOException 
	{		
		String str = "He is my dear friend"; 
  
        FileWriter obj=new FileWriter("test.txt"); 
    
        for (int i = 0; i < str.length(); i++) 
        {
        	//obj.write("hi");
        	  obj.write(str.charAt(i));
        } 
        System.out.println("Writing successful"); 
        obj.close(); 
	}
}


