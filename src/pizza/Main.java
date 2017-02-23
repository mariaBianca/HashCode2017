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
		System.out.println(pizza_filler());
		
		
	}
	
	
	/**
	 * Pizza-filler.
	 * @return sliceAmmount
	 * */
	public static int pizza_filler(){

		
		int currentMushroom = 0;
		int currentTomato = 0;
		int countSlice=0;
		int max = h/2;
		int iMax = 2;
		
		int rubbish = 0;
		/*Check the topping in order to create a slice */
		System.out.println("-----------------------");
		
		for (int i = 0; i < c; i++){
			for (int j = 0 ; j < r; j++){
				System.out.print(pizza[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		while(max < c){

		while(iMax <=r){
			//Check each rectangular of (0, h/2) 
			for (int i = 0; i < iMax; i++){
				for (int j = 0; j < max; j++){
					if (pizza[i][j] == 'M'){
						currentMushroom++;
						System.out.println("Mushroom!!");
					}
					else if(pizza[i][j] == 'T'){
						currentTomato++;
						rubbish++;
						System.out.println("Tomato!!" + rubbish);
					}
				}
			}
			if(currentMushroom >= l && currentTomato >= l){
				countSlice++;
				//System.out.println(currentTomato);
				//System.out.println(currentMushroom);
				currentMushroom = 0;
				currentTomato = 0;
			}else{
				//System.out.println(currentTomato);
				//System.out.println(currentMushroom);
				//System.out.println(l);
				currentMushroom = 0;
				currentTomato = 0;
			}
			iMax+=2;
		}
			
		max = max+max;
		iMax = 2;
		}
		

		
		
		
		
		
		
		
		

//		while(currentRow <= r){
//			
//			while(count <= max){
//				if(pizza[count][currentRow]=='M'){
//					currentMushroom++;
//				}else{
//					currentTomato++;
//				}
//			}
//			currentRow++;
//				}
//			
		
		
		
		return countSlice;
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
			    	
			    	for (int j =0; j < r+1; j++){
			    		pizza[n][j] = tmp.charAt(j);			    		
			    		System.out.print(pizza[n][j]);
			    	}
			    	System.out.println();
			    }
			
			in.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
