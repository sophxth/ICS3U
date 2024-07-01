/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 25, 2024
 * Description: Fix the  statement so it prints (on 2 lines): System.out.println(‘Mrs. M,\n did I get this right?’)
 */
package a_output;

public class C2_printlnError {

	public static void main(String[] args) {
	
		String name = "Sophia";//state the name
		int favNumber = 02; //state favorite number through using int
		int square = favNumber * favNumber; //state the square of the favNumber by multiply each other
		System.out.println("If "+ name + "'s favourite number is " + favNumber + " then the square of their favourite number is " + square + ".");  
		//used println to print the require phrase by using "" to separate the non-changed term and + to link each component together  
	}//end main

}//end class
