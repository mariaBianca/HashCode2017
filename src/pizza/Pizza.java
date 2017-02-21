package pizza;
/**
 * @author Team QuoBono
 * HashCode 2017: Pizza problem
 * Class representing the main. 
 **/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pizza {

	static int r = 0;
	static int c = 0;
	static int l = 0;
	static int h = 0;
	
	public static void main(String args[]) {
		
		/**Scan from file*/
		Scanner in;
		
		//variable used to go through the first 4 readings of the file (representing the numbers)
		int i = 0;
		
		try {
			in = new Scanner(new File("files/small.in"));

			//store the values that the row, column, least number of items and, heighest number of items
			//on the pizza
			while (in.hasNext()) { 
			    String line = in.next();
			    switch(i){
			    case 0 : 
			    	r = Integer.parseInt(line);
			    	i++;
			    	break;
			    case 1 : 
			    	c = Integer.parseInt(line);
			    	i++;
			    	break;
			    case 2 :
			    	l = Integer.parseInt(line);
			    	i++;
			    	break;
			    case 3 :
			    	h = Integer.parseInt(line);
			    	i++;
			    	break;
			    default : 
			    	break;
			    }
			    
			    //cut a slice from the pizza
			    cut_a_slice(l,h);
			}

			in.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//System.out.println("r: " + r);
		//System.out.println("c: " + c);
		//System.out.println("l: " + l);
		//System.out.println("h: " + h);
	}
	
	public static void cut_a_slice(int l, int h){
		
		PizzaSlice pizzaSlice = new PizzaSlice(h, h, h, h);
		
		
	}
}
