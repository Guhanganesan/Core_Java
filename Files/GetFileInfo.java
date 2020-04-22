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
        System.out.println("5 for get all the informations");
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
        	System.out.println("For Individual Directories Files Count");
        	listInfo.getCount(dir);
        	System.out.println("For All Directories total Total Files Count");
        	System.out.println("text : "+listInfo.m[0]+" pdf : "+listInfo.m[1]+" xml : "+listInfo.m[2]+" docx : "+listInfo.m[3]);
            break;
        case 5:
        	listInfo.listPath(dir);
        	listInfo.listFiles(dir);
        	listInfo.getInfo(dir);
        	listInfo.getCount(dir);
            break;
        }
	}

}

Answer:-
	
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\Projects\documents\Anbu.xml
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\Projects\documents\myfile.txt
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\Projects\documents\Raja.docx
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\Projects\documents\Raja.pdf
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\Projects\documents\Raja.txt
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\Projects\documents\Raja.xml
Anbu.docxAnbu.pdfAnbu.txtAnbu.xmlmyfile.txtRaja.docxRaja.pdfRaja.txtRaja.xml
text : 3 pdf : 2 xml : 2 docx : 2
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\Projects\myfile.txt
Anbu.docxAnbu.pdfAnbu.txtAnbu.xmlmyfile.txt
text : 2 pdf : 1 xml : 1 docx : 1
D:\Users\guhan.ganesh\eclipse-workspace\Test\Files\web.pdf
Guhan.docxGuhan.pdfGuhan.txtGuhan.xmlhello.txtmyfile.txtpass.docxweb.pdf
text : 3 pdf : 2 xml : 1 docx : 2
For All Directories total Total Files Count
text : 8 pdf : 5 xml : 4 docx : 5

