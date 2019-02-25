package cse360assign2;
/**
 * The Calculator class will compute mathematical operators applied
 * to given operands. This class will also be able to report a
 * history of previously executed operations.
 * 
 * @author quinn
 * @version 1.0
 * @since 2/23/2019
 */

public class Calculator {
	/**
	 * The total computed by the calculator
	 */
	private int total;
	
	/**
	 * String containing the history of operations performed.
	 */
	private String operationHistory;
	
	/**
	 * Constructor for a calculator object.
	 * Initialize the total to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		operationHistory = "0";
	}
	
	/**
	 * Retrieve the current total of the calculator object.
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method will add a given value to the total. It will also update
	 * the operations string.
	 * @param value The value to be added to the current total.
	 */
	public void add (int value) {
		total = total + value;
		operationHistory = operationHistory + " + " + value;
	}
	
	/**
	 * This method will subtract a given value from the total. It will also
	 * update the operations string.
	 * @param value The value to be subtracted from the current total.
	 */
	public void subtract (int value) {
		total = total - value;
		operationHistory = operationHistory + " - " + value;
	}
	
	/**
	 * This method will multiply a value by the total. It will also update
	 * the operations string.
	 * @param value The value to be multiplied by the total.
	 */
	public void multiply (int value) {
		total = total * value;
		operationHistory = operationHistory + " * " + value;
	}
	
	/**
	 * This method will be divide the total by the given value. It will also
	 * update the operations string.
	 * @param value The value that will divide the current total.
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		operationHistory = operationHistory + " / " + value;
	}
	
	/**
	 * This method will report all operations performed on total in the form of a
	 * string.
	 * @return A string that contains all of the operations performed on total.
	 */
	public String getHistory () {
		return operationHistory;
	}
}