package W6A4_Java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFileQ4 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Students\\Desktop\\num1.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			Scanner sc = new Scanner(br);
			// read the first 3 integers and calculate their total
			int a = sc.nextInt();    
			int b = sc.nextInt();    
			int c = sc.nextInt();    
			int total = a+b+c;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("Total = " + total);
						
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
