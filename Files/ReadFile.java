package MyFiles;
import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws IOException {
				
		String fileName = "test.txt";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
		    System.out.println(line);
		}
   }

}
