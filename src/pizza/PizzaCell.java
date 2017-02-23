package pizza;
/**
 * @author Team QuoBono
 * HashCode 2017: Pizza problem
 * Object representing the pizza slice. 
 **/
public class PizzaCell {

	int beginingRow = -1;
	int endingRow = -1;
	int beginingColumn = -1;
	int endingColumn = -1;
	
	
	public PizzaCell(int beginingRow, int endingRow, int beginingColumn, int endingColumn, char topping) {
		super();
		this.beginingRow = beginingRow;
		this.endingRow = endingRow;
		this.beginingColumn = beginingColumn;
		this.endingColumn = endingColumn;
	}

	
}
