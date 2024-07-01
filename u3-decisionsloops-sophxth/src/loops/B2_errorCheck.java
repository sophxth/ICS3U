/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Apr 3, 2024
 * Description: Error Check: use a try catch block to ensure the user enters a number (and not a String)
 */
package loops;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

public class B2_errorCheck 
{

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);

		while (true) //if the user input is correct= restate the user's input
		{
			try 
			{
				System.out.print("Please enter a number: ");
				int number = Integer.parseInt(scanner.nextLine());
				// Do something with the number
				System.out.println("You entered: " + number);
				break; // Exit the loop if input is successfully converted to an integer
			} // end try
			catch (NumberFormatException e) 
			{
				System.out.println("Error: Please enter a valid number.");
			}// end catch 
		}//end while

	}//end main

}//end class
