/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Mar 3, 2024
 * Description: Make a program for a grocery checkout. 
 * 			  	Ask the user to scan each item (name of item and cost), then print out the total grocery bill. 
 * 				Ask the user for how much cash they are paying with, output the change. 
 */
package c_input;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class C1_groceryCheckout 
{

	public static void main(String[] args) 
	{
		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();


		double totalBill = 0.0;

		System.out.println("Welcome to the grocery checkout!");

		// Loop to input items
		while (true) 
		{
			//Inside the loop, prompt the user to input each item's name and cost. 
			//Let it reads the input as a string using scanner.nextLine().
			System.out.print("Enter item name and cost (or 'done' to finish): ");
			String input = myInput.nextLine();

			if (input.equalsIgnoreCase("done")) 
			{
				break;//If the user enters "done", exit the loop using the break statement.
			}// end if

			String[] itemInfo = input.split(" "); //Split the input string into an array of strings, using a space as the delimiter. 
			// This gives us the item name and its cost. (w3school and codegym)
			if (itemInfo.length != 2) 
				//checks whether the user input is not in the expected format. 
				//If it's not, the program prints an error message and continues to the next iteration of the loop, prompting the user to input the item name and cost again.
				//w3school and chatgpt for clarification
			{
				System.out.println("Invalid input. Please enter item name and cost separated by space.");
				continue;
				//if the input is in the correct format (contains both item name and cost). 
				//If not, print an error message and continue to the next iteration of the loop.
			}// end if

			try // Some code that might cause an error (w3school)
			{
				totalBill += Double.parseDouble(itemInfo[1]);
			} // end try
			catch (NumberFormatException e) // // Code to handle the error (w3school)
			{
				System.out.println("Invalid cost. Please enter a valid number.");
			}// end catch
		}//end while

		// Output total bill
		System.out.println("Total bill: $" + totalBill);

		// Input cash amount
		System.out.print("Enter cash amount: $");
		double cashPaid = myInput.nextDouble();

		// Calculate change
		double change = cashPaid - totalBill;

		// Output change
		if (change >= 0) 
		{
			System.out.println("Change: $" + change);
		} // end if 
		else 
		{
			System.out.println("Insufficient cash provided.");
		}// end else


	}// end main


}//end class


