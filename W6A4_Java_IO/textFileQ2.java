package W6A4_Java_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class textFileQ2 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Students\\Desktop\\textFileQ2.txt";
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(path));
			

			pw.println("+------------------------------------------------------------------+");
			pw.println("|                                                   ########       |");
			pw.println("|                                                   ########       |");
			pw.println("|                                                   ########       |");
			pw.println("|                                                   ########       |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                               Bill Gates                         |");
			pw.println("|                               123 Riverside Dr.                  |");
			pw.println("|                               New York, NY 10072                 |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("|                                                                  |");
			pw.println("+------------------------------------------------------------------+");
			
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
