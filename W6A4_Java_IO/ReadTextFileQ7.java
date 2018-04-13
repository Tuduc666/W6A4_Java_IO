package W6A4_Java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadTextFileQ7 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\CrazyText.txt";
		String pathM = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\CrazyTextModified.txt";
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(pathM));
			BufferedReader br = new BufferedReader(new FileReader(path));

			String line = br.readLine();
			String up;
			while(line != null) {
				up = line.replaceAll("a","A").replaceAll("e","E").replaceAll("i","I").
						  replaceAll("o","O").replaceAll("u","U");   // convert vowels to uppercase
				pw.println(up);
				line = br.readLine();
			}
		
			br.close();
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
