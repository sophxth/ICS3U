/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 28, 2024
 * Description: Demo input
 */
package c_input;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class PracticeInput 
{
	public static void main(String[] args) 
	{
		//initialize variables
		Scanner myInput = new Scanner(System.in); // tool to collect info from the console
		Random rand = new Random(); //not used in this
		int age = -1;
		String fName = "";
		String lName = "";
		String favColour = "";

		//Collect user's name, age and favourite colour
		System.out.print("Please enter your first and last name: ");
		fName = myInput.next(); //collects to the first space or end of line (EOL)
		lName = myInput.nextLine(); //collects and removes the input including the EOL
		lName = lName.substring(1); //removed the space at the beginning since it wasn't collected using the "next" command
		System.out.print("Please enter your age: ");
		//age = myInput.nextInt();
		myInput.nextLine(); // collect the enter at the end of the line
		System.out.print("What is your favourite colour: ");
		favColour = myInput.nextLine();

		//print greeting
		System.out.println("Hi " + fName);
		System.out.println("You are " + age + " years old.");
		System.out.println("You like " + favColour);

		//close the scanner
		myInput.close(); //only close at the very end of the program
	}//end main

}//end class
