/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Mar 18, 2024
 * Description: Demonstration various loop structures
 */

package loops;

import java.util.*;

public class PracticeLoops
{

	public static void main(String[] args) throws InterruptedException
	{
		//Set up 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();

		//      //FOR - used when you know how many times to repeat
		//      for (create counter; boolean condition; change value of counter)
		//      {
		//          //this is where you put the code to repeat
		//      }//end for

		//counts from 1 - 10, (i = i+1)
		for(int i = 1; i<=10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		//counts from 1 - 20
		for(int i = 1; i<=20; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		//counts every other number between 1-20
		//option 1: i=i+2 is the same thing as saying i+=2
		for(int i = 1; i<=20; i+=2)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		//counts every other number between 1-20
		//option 2 - use if statement inside the loop
		for(int i = 1; i<=20; i++)
		{
			if(i%2==1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		//counts every other number between 1-20
		//option 3
		for(int i = 0; i<10; i++)
		{
			System.out.print((i*2 + 1) + " ");
		}
		System.out.println();

		//count down from 20 to 1
		//i-- is the same thing as i = i-1
		for(int i = 20; i>=1; i--)
		{
			System.out.print(i + " ");
			Thread.sleep(1000);//pauses program for 1 second before continuing
		}
		System.out.println();

		//WHILE - used when you don't know how many times to repeat
		// these might not execute at all since the condition is 
		// checked before it goes in the loop
		//      while(boolean condition)
		//      {
		//          //repeat this code when condition is true
		//      }//end while

		//repeat until a user types Y or y
		String userResponse = "";
		while(!userResponse.equalsIgnoreCase("Y"))
		{
			System.out.println("Please type \"y\" or \"Y\" to continue");
			userResponse = myInput.nextLine();
		}//end while

		//repeat until I roll a 2
		int die1 = rand.nextInt(6) + 1;
		System.out.println("You rolled a " + die1);
		while(die1!=2)
		{
			System.out.println("Press enter to roll again");
			myInput.nextLine();
			die1 = rand.nextInt(6) + 1;
			System.out.println("You rolled a " + die1);
		}//end while (!2)

		//DO WHILE - used when we don't know how many times to repeat
		//  it has to execute the code at least once
		//      do
		//      {
		//          //do this stuff
		//      }while(boolean condition); //put semi colon at end

		//count number of rolls until I get a 3
		
		int numOfRolls = 0;
		do
		{
			die1 = rand.nextInt(6) + 1;
			System.out.println("You rolled a " + die1);
			numOfRolls++; //adds one to the count
		}while(die1!=3);//end while (!3)
		System.out.println("It took " + numOfRolls + " rolls to get a 3");

		//TRY CATCH: use try catch blocks with loops to force correct input types
		//      try
		//      {
		//          //try this code (what code can cause the error)
		//      }
		//      catch(error code)
		//      {
		//          //do this when an error is caught
		//          //there can be more than one catch statement
		//      }

		//loop until the number entered is divisible by 10
		int userValue = 0;
		do
		{
			try 
			{
				System.out.println("Please enter a number divisible by 10");
				userValue = myInput.nextInt();
				myInput.nextLine(); //collects the enter at end of line
			} 
			catch (Exception e) 
			{
				myInput.nextLine(); //collects the enter at end of line
				System.out.println("I'm sorry, I don't understand");
			}

		}
		while(userValue%10 != 0);

	}//end main
	
}//end class