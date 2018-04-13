/*
 *         6.  Create two files and name them: puzzle.txt and puzzle2.txt
Inside puzzle.txt, write the following text:
MWTaahyiebt_e,c__hnyaoontuc;'e_rste_r_aynr_oert_e_gasoduoipdnp_got_shoeandtl__yty_oot_uhrree__apTdrH_oItgRhrDia_sml__eowtnotere.kr_ss_.
Inside puzzle2.txt, write the following text:
WTTohhriikssi__niigss,___ttbhhueet___wryrioogunh'gtr__emm_eessshssoaawggieen__gff_rrtoohmme___sswaarmmoppnllgee_22o..nttexxstt

Open a file specified by the user. This file will contain a bunch of characters. You should read in each character from the file, 
one character at a time. Display every third character on the screen. Throw the other characters away.
There is a sample input file called puzzle.txt, containing a little message you can use to test your program.

 */

package W6A4_Java_IO;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadTextFileQ6 {

	public static void main(String[] args) {
		

		try {
			// prompt user
			System.out.println("Which file to open... puzzle or puzzle2?");
			Scanner sc = new Scanner(System.in);
			String path = "C:\\Users\\Students\\Desktop\\" + sc.nextLine() + ".txt";	
			
			FileInputStream fis = null;
			fis = new FileInputStream(path);
			int temp;
			int i=1;  // display char when i=3, and reset i to 1
			while((temp = fis.read()) != -1) {   // read byte by byte
				if (i==3) {
					System.out.print((char) temp);
					i=1;
				} else { i++; }
			}
			if (fis != null)
				fis.close();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
