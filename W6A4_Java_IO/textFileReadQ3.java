package W6A4_Java_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class textFileReadQ3 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Students\\Desktop\\score.txt";
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(path));
			Scanner sc = new Scanner(System.in);
			
			System.out.println("What is your name?");
			String name = sc.nextLine();
			System.out.println("What did you get on your Math test? (0 to 100)");
			Integer grade = Integer.parseInt(sc.nextLine());
			
			pw.println(name + " got a " + grade + " in the Math test.");
			
			sc.close();
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
