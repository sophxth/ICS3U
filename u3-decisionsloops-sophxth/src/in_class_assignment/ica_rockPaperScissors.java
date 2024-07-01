
/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: March 20, 2024
 * Description: In class assignment #1
 *		 Build a rock paper scissors game that player go against the computer
 */
package in_class_assignment;


import java.util.*;

public class ica_rockPaperScissors 
{

	public static void main(String[] args) 
	{

		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();
		int playerThrow = -1;
		int computerThrow = -1;

		// Prompt the user until valid input is provided
		//using loop while to determine the value input is an non-following-command or not in order to 
		while (playerThrow == -1) //initial value
		{
			try 
			{
				// Ask the user for their throw choice (using number to represent the object)
				System.out.print("Enter your throw (1 = Rock, 2 = Paper, 3 = Scissors): ");

				// Check if the input is an integer
				if (myInput.hasNextInt()) 
				{
					playerThrow = myInput.nextInt();

					// Validate the input range
					if (playerThrow < 1 || playerThrow > 3) 
					{
						System.out.println("Invalid throw. Please enter a number between 1 and 3.");
						playerThrow = -1; // Reset playerThrow to prompt the user again
					}//end if
				}// end if 
				else 
				{
					System.out.println("Invalid input. Please enter a whole number.");
					myInput.next(); // Consume the invalid input to avoid infinite loop
				}//end else
			} // end try
			catch (InputMismatchException e) 
			{
				System.out.println("Invalid input. Please enter a whole number between 1 and 3.");
				myInput.next(); // Consume the invalid input to avoid infinite loop
			}// end catch
		}//end while


		// Display the player's throw
		//determine what is the value that player input in 
		switch (playerThrow) 
		{
		case 1:
			System.out.println("Player throws Rock");
			break;//reaches a break keyword, it breaks out of the switch block.
			//This will stop the execution of more code and case testing inside the block.
			//When a match is found, and the job is done, it's time for a break. There is no need for more testing.
		case 2:
			System.out.println("Player throws Paper");
			break;//same as above
		case 3:
			System.out.println("Player throws Scissors");
			break;//same as above
		default:
			System.out.println("Invalid throw");
		}//end switch
		// Generate a random number for the computer's throw
		computerThrow = rand.nextInt(3) + 1;
		System.out.println("Computer throws " + getThrowName(computerThrow));
		// Determine the winner
		determineWinner(playerThrow, computerThrow);
	}// end main

	// Method to get the name of the throw based on the number
	// to determine the player's and computer's name of which throw
	//I use it from the W3School "Java Throws Keyword" as after I tested it showed error, 
	//so I try to use the public static to store the value and reflect it correctly
	/* Method name: getThrowName
	 * Description: Using the switch case to determine the input value - 1=? 2=? 3=?
	 * Parameter: using the string of get the information store in the throwNumber as 
	 * 			  1= Rock 2= Paper 3=Scissor and others = Invalid Throw
	 * Returns: The result will spit out depends on the input value of the player and the random choice of input from the computer
	 * 			This states the value of each input through number from 1-3 (whole number only)
	 */
	public static String getThrowName(int throwNumber) 
	{
		switch (throwNumber) 
		{
		case 1:
			return "Rock";
		case 2:
			return "Paper";
		case 3:
			return "Scissors";
		default:
			return "Invalid throw";
		}//end switch
	}// end string
	//I use it from the W3School "Java Throws Keyword" as after I tested it showed error, 
	//so I try to use the public static to determine the Winner.
	// Method: To determine the winner
	/* Method name: determineWinnter
	 * Description: Using if else statement to determine the output value through the command order
	 * Parameter: using the value of the input in the playerThrow and computerThrow, 
	 * Returns: The result of the game after the player input the choice and the computer choice.
	 * 			This work as a decision that the computer have to put out by the commands
	 */
	public static void determineWinner(int playerThrow, int computerThrow) 
	{
		if (playerThrow == computerThrow) //if the play both type the same number => tie
		{
			System.out.println("It's a draw!");
		} //end if
		else if ((playerThrow == 1 && computerThrow == 3) ||//if player throw 1 and computer throw 3 => player wins
				(playerThrow == 2 && computerThrow == 1) ||//if player throw 2 and computer throw 1 => player wins
				(playerThrow == 3 && computerThrow == 2)) //if player throw 3 and computer throws 2 => player wins
		{
			System.out.println("Player wins!");//prints out the result
		} //end else if
		else // if all the result differ from all above => the computer wins
		{
			System.out.println("Computer wins!");//print our the result
		}//end else
	}//end determineWinner
}//end class
