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
	static char[][] pizza;
	
	public static void main(String args[]) {
		
		//create the pizza
		String small = "files/small.in";
		String medium = "files/medium.in";
		String big = "files/big.in";
		
		build_pizza(small);
		System.out.println(pizza_filler(currentX, currentY));
		
		
	}
	
	
	/**
	 * Pizza-filler.
	 * @return sliceAmmount
	 * */
	public static int pizza_filler(int x; int y){

		int sliceAmmount = 0;
		int currentTomato;
		int currentMushroom;
		
		if (x >= 0 && x < r && y >= 0 && y < c){
			;
			
		}
		currentRow = 0;
		currentColumn = 0;
		
		/*Check the topping in order to create a slice */
		while(currentTomato < max && currentMushroom < max){
			for(int i = 0 ; i<currentRow;i++){
				if(pizza[currentRow][currentColumn] == "M"){
					currentMushroom++;
				}
				else if (pizza[currentRow][currentColumn] == "T"){
					currentTomato++;
				}
		}
		
			
		}
		
		
		return sliceAmmount;
	}
	
	
	/**
	 * Build the pizza from given file.
	 * */
	public static void build_pizza(String file){
		/*Scan from file*/
		Scanner in;
		//variable used to go through the first 4 readings of the file (representing the numbers)
		int i = 0;
		try {
			in = new Scanner(new File(file));

			//store the values that the row, column, least number of items and, heighest number of items
			//on the pizza
			while (in.hasNextInt()) { 
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

			pizza = new char[r][c];
			/*Create pizza*/
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
}
