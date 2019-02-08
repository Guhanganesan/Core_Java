package MyFiles;
import java.io.*;

public class AppendFile {

	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("Check this text");

		br.close();
		fr.close();

	}

}
