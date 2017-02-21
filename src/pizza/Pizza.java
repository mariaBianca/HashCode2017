package pizza;
/**
 * @author Team QuoBono
 * HashCode 2017: Pizza problem
 **/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pizza {
	
	
	public static void main(String args[]) {
		
		/**Scan from file*/
		Scanner in;
		try {
			in = new Scanner(new File("files/small.in"));

			while (in.hasNext()) { 
			    String line = in.nextLine();
			    System.out.println(line);
			}

			in.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
