package AprilTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetFileInfo extends MyFiles{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		GetFileInfo listInfo = new GetFileInfo();
        final String dir ="D:\\Users\\guhan.ganesh\\eclipse-workspace\\Test\\Files";
        
        
        System.out.println("Please enter the options to get file info");
        System.out.println("1 for acceess the file directory with files");
        System.out.println("2 for access the files from all directories");
        System.out.println("3 for access the files meta data");
        System.out.println("4 for access the number of files info");
        int in =sc.nextInt();
        
        switch(in)
        {
        case 1:
        	listInfo.listPath(dir);
        	break;
        case 2:
        	String res=listInfo.listFiles(dir);
            //System.out.println(res);
            break;
        case 3:
        	listInfo.getInfo(dir);
            break;
        case 4:
        	listInfo.getCount(dir);
            break;
        }
	}

}

Ans:-
Please enter the options to get file info
1 for acceess the file directory with files
2 for access the files from all directories
3 for access the files meta data
4 for access the number of files info
4
text : 3 pdf : 2 xml : 2 docx : 2
text : 2 pdf : 1 xml : 1 docx : 1
text : 3 pdf : 2 xml : 1 docx : 2
