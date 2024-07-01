/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: April 27, 2024
 * Description: a clicker game that each user has 5 seconds to enter as many click as they can by the enter button :)
 */
package inClassAssignment_methods_arrays;

import java.util.*;

public class quickClicker
{
	//W3schools sources: https://www.w3schools.com/java/java_hashmap.asp
	static HashMap<String, Integer> topRecords = new HashMap<>(); // HashMap to store top records

	public static void main(String[] args) throws InterruptedException
	{
		Scanner myInput = new Scanner(System.in);

		boolean playAgain = true;
		while (playAgain) //Loop to replay the game 
		{
			showWelcome(); //display the method welcome message
			System.out.println("Welcome to Quick Clicker. Who can press enter the fastest?");
			int numPlayers = 0;
			boolean validInput = false;

			while (!validInput) //loop to make sure the right form of the user input for the number of players
			{
				try 
				{
					System.out.println("How many players are there?");
					numPlayers = myInput.nextInt();
					validInput = true;
				}//end try 
				catch (InputMismatchException | NumberFormatException e) 
				{
					System.out.println("Invalid input. Please enter a whole number.");
					myInput.next(); // Clear the invalid input
				}//end catch

			}//end while
			myInput.nextLine(); // Consume newline character

			String[] playerNames = new String[numPlayers];

			// Collect player names
			for (int i = 0; i < numPlayers; i++) 
			{
				System.out.print("Player " + (i + 1) + " name: ");
				playerNames[i] = myInput.nextLine();
			}//end for

			int[] playerClicks = new int[numPlayers];


			// Start the game for each player
			for (int i = 0; i < numPlayers; i++)
			{
				System.out.println(playerNames[i] + " starts, press enter to begin and keep pressing enter until the timer stops.");
				System.out.println("Get ready...");
				countdownTimer(3); // Count down timer for 3 seconds
				System.out.println("Go!");
				waitForEnter();

				playerClicks[i] = countClicks();

				fancyText("That's great, " + playerNames[i] + " clicked enter " + playerClicks[i] + " times.", 20, 1000);
			}//end for 


			// Determine the winner
			int maxClicks = playerClicks[0];
			int winnerIndex = 0;
			boolean tie = false;
			for (int i = 1; i < numPlayers; i++) 
			{
				if (playerClicks[i] > maxClicks) 
				{
					maxClicks = playerClicks[i];
					winnerIndex = i;
					tie = false;
				} // end if
				else if (playerClicks[i] == maxClicks) 
				{
					tie = true;
				}//end else if
			}//end for

			if (tie) 
			{
				System.out.println("It's a tie!");
			} //end if
			else 
			{
				System.out.println(playerNames[winnerIndex] + " wins!");
				updateTopRecords(playerNames[winnerIndex], maxClicks);// Update top records
				//				if (!topRecords.containsKey(playerNames[winnerIndex]) || topRecords.get(playerNames[winnerIndex]) < maxClicks) 
				//				{
				//					topRecords.put(playerNames[winnerIndex], maxClicks);
				//					System.out.println("Congratulations! You've set a new top record!");
				//				}
				//			}

			}//end else

			boolean validResponse = false;
			while (!validResponse) 
			{
				System.out.print("Please enter 'yes', 'no', or 'top' to check top records: ");
				String playAgainResponse = myInput.nextLine().toLowerCase();
				if (playAgainResponse.equals("yes")) 
				{
					playAgain = true;
					validResponse = true;
				} //if
				else if (playAgainResponse.equals("no")) 
				{
					playAgain = false;
					validResponse = true;
				} //end else if
				else if (playAgainResponse.equals("top")) // Check top 5 records
				{
					displayTopRecords();
				}//else if
				else 
				{
					System.out.println("Invalid input. Please enter 'yes', 'no', or 'top' to check top records.");
				}// end else
			} //end while 
		}//end loop while

		System.out.println("Thank you for playing the Clicker Smashdown<3");
		myInput.close();
	}//end main


	/* Method name: showWelcome
	 * Description: Display the initial welcome message to the screen.
	 * Parameter: None
	 * Returns: void
	 */
	private static void showWelcome() 
	{
		//prints initial welcome to the screen
		System.out.println("###########################################################");
		System.out.println("                          WELCOME");
		System.out.println("                          TO  THE"); 
		System.out.println("                     CLICKER SMACKDOWN	");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" -Setting-       -Players-         -Score-      -Theme-	");
		System.out.println("###########################################################");
	} // end showWelcome

	// Method to wait for Enter key press
	/* Method name: waitForEnter
	 * Description: Wait for the Enter key press.
	 * Parameter: None
	 * Returns: void
	 */
	private static void waitForEnter() 
	{
		Scanner myInput = new Scanner(System.in);
		while (myInput.hasNextLine()) 
		{
			if (myInput.nextLine().isEmpty()) 
			{
				break;
			}//end if
		}//end while
	}//end waitForEnter

	// Method to count the number of Enter key presses within 5 seconds
	/* Method name: countClicks
	 * Description: Count the number of Enter key presses within 5 seconds.
	 * Parameter: None
	 * Returns: int (number of Enter key presses)
	 */
	private static int countClicks() 
	{
		long startTime = System.currentTimeMillis();
		int clicks = 0;
		Scanner myInput = new Scanner(System.in);
		while (System.currentTimeMillis() - startTime < 5000) 
		{
			if (myInput.nextLine().isEmpty()) 
			{
				clicks++;
			}//end if 
		}//end while
		return clicks;
	}//end countClicks

	// Method to display a count down timer
	/* Method name: countdownTimer
	 * Description: Display a countdown timer for the specified number of seconds.
	 * Parameter: int seconds (number of seconds for the countdown timer)
	 * Returns: void
	 */
	private static void countdownTimer(int seconds) 
	{
		for (int i = seconds; i > 0; i--) 
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(1000); // Sleep for 1 second
			}//end try
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}//end catch
		}//end for
	}// end countdownTimer
	
	
	// to update the record
	// stack over flow and youtube sources: https://stackoverflow.com/questions/70956150/sort-listmap-entrystring-integer-in-primary-and-secondary-way
	/* Method name: updateTopRecords
	 * Description: Update the top records HashMap with the latest player's performance, keeping only the top 5 records.
	 * Parameter: String playerName (the name of the player), int clicks (the number of clicks by the player)
	 * Returns: void
	 */
	private static void updateTopRecords(String playerName, int clicks) 
	{
	    topRecords.put(playerName, clicks);
	    // Sort the records by value (number of clicks)
	    List<Map.Entry<String, Integer>> sortedRecords = new ArrayList<>(topRecords.entrySet());
	    sortedRecords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

	    // Keep only the top 5 records
	    if (sortedRecords.size() > 5) 
	    {
	        topRecords = new LinkedHashMap<>(); // Reset the HashMap
	        for (int i = 0; i < 5; i++) 
	        {
	            topRecords.put(sortedRecords.get(i).getKey(), sortedRecords.get(i).getValue());
	        }// end for
	    }// end if

	    System.out.println("Top Records:");
	    int rank = 1;
	    for (Map.Entry<String, Integer> entry : topRecords.entrySet()) 
	    {
	        System.out.println(rank + ". " + entry.getKey() + ": " + entry.getValue() + " clicks");
	        rank++;
	    }// end for
	}// end updateTopRecords
	// Method to display the top records
	//youtube resources: https://www.youtube.com/watch?v=ujQxNZA9iVE
	/* Method name: displayTopRecords
	 * Description: Display the top 5 records to the console.
	 * Parameter: None
	 * Returns: void
	 */
	private static void displayTopRecords() 
	{
		System.out.println("Top Records:");
		// Sort the records by value (number of clicks)
		List<Map.Entry<String, Integer>> sortedRecords = new ArrayList<>(topRecords.entrySet());
		sortedRecords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
		int prevClicks = Integer.MAX_VALUE; // To handle ties
		int rank = 1;
		for (Map.Entry<String, Integer> entry : sortedRecords) 
		{
			if (entry.getValue() < prevClicks) 
			{
				rank++;
			}//end if
			System.out.println(rank + ". " + entry.getKey() + ": " + entry.getValue() + " clicks");
			prevClicks = entry.getValue();
		}//end for
	}// end displayTopRecords
	
	/* Method Name: fancyText
	 * Description: Prints the given message with a fancy effect.
	 * Paramters: message (message to be printed), textSpeed (Speed in milliseconds at which each caracter of message is printed), msgDelay (delay in milliseconds after printing message)
	 * Returns: Void
	 * Credit: Nicolas Falesy (Andrew Bluderick)
	 */ 
	public static void fancyText(String message, int textSpeed, int msgDelay) throws InterruptedException {
		// loops through each character and prints with a delay
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			Thread.sleep(textSpeed);
		} //ends for
		//delay after it prints
		Thread.sleep(msgDelay);
	} // ends fancyText method

}//end class
