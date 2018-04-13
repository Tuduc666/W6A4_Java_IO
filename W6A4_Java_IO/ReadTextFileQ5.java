/*
 *       5. Create several more files in Notepad containing three integers separated by some whitespace. 
 *       Save them in your home directory as "nums2.txt", "nums3.txt", "nums4.txt", etc.
         Then write a program that asks the user which file to open. Then it should open that file, 
         and read the three integers from the file. It should then display (on the screen) the total of the integers.
 */

package W6A4_Java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFileQ5 {

	public static void main(String[] args) {
		

		try {
			// prompt user
			System.out.println("Which file to open... num2, num3, or num4?");
			Scanner sc = new Scanner(System.in);
			String path = "C:\\Users\\Students\\Desktop\\" + sc.nextLine() + ".txt";	
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			sc = new Scanner(br);
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
