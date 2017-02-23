package pizza;
/**
 * @author Team QuoBono
 * HashCode 2017: Pizza problem
 * Class representing the main. 
 **/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	static int r = 0;
	static int c = 0;
	static int l = 0;
	static int h = 0;
	static char topping;
	static char[][] pizza = new char[7][6];
	
	public static void main(String args[]) {
		
		/**Scan from file*/
		Scanner in;
		
		//variable used to go through the first 4 readings of the file (representing the numbers)
		int i = 0;
		
		try {
			in = new Scanner(new File("files/small.in"));

			//store the values that the row, column, least number of items and, heighest number of items
			//on the pizza
			while (in.hasNextInt()) { 
				int tmp = in.nextInt();
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
			}
			
			int n=0;
			while(in.hasNext()){
			    //read the matrix = create the pizza
			    
			    	//get the whole next row
			    	String tmp = in.next();
			    	
			    	for (int j =0; j < r; j++){
			    		pizza[j][n] = tmp.charAt(j);
			    		System.out.print(pizza[j][n]);
			    	}
			    	System.out.println();
			    }
			
			in.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	//cut a slice
	public static void cut_a_slice(int l, int h){
		
		PizzaCell pizzaSlice = new PizzaCell(h, h, h, h, topping);
		
		
	}
}
