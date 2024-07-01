/*  Name: Sophia Thai
 *  Course: ICS 3U
 *  Teacher: Mrs. McCaffery
 *  Date: Mar 4, 2024
 *  Description: Demo  of decision operations - boolean operators making choices of which code to execute 
 */
package decisions;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class PracticeDecisions
{

	public static void main(String[] args)
	{
		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();
		int die1 = rand.nextInt(6) + 1;
		int die2 = rand.nextInt(6) + 1;

		//boolean and logic operator 
		// == check if items on both sides are equal
		// < less than
		// > greater than
		// <= less than or equal to
		// >= greater than or equal to
		// != not equal to

		// ! NOT
		// && AND
		// || OR
		// 
		//Logic operators
		//NEED a complete boolean statements on each side
		//of 


		//decision statements (variety)
		//if( boolean condition )
		//{
		//		//put code here to execute when true
		//}
		//else
		//{
		//

		//print dice value on the screen
		System.out.println(die1 + " " + die2);
		if(die1==3 && die2==3)
		{
			System.out.println("You got double threes");
		}
		else if(die1==3 || die2==3) //got one three only
		{
			System.out.println("You got a three");
		}
		else //(die1 !=3 && die2 !=3)
		{
			System.out.println("You didn't roll a three");
		}

		//comparisons using strings 
		//for strings use the .equals()
		//i.e. name.equals("Mrs. McCaffery)
		//i.e. name.equalsIgnoreCase("Mrs. McCaffery")

		//Ask for and collect person's favourite colour
		String favColour = "";
		System.out.print("What is your favourite colour: ");
		favColour = myInput.nextLine();

		//finds out if their favourite colour is red
		if(favColour.equalsIgnoreCase ("red"))
		{
			System.out.println("You like red");
		}
		else
		{
			System.out.println("Red is not your favourite colour");
		}
		//some other cool operations for strings
		//		favColour = favColour.toLowerCase();
		//		favColour.contains("red'");
		//		favColour.charAt(1);
		//		favColour.indexOf("r");
		//		favColour.length();
		//		favColour.substring(1, 5); // this one would throw an error if the colour is not long enough
		//		favColour.isBlank();
		//		favColour.isEmpty();

		//more with logic operators
		if(die1 ==1 ||die1 ==3 ||die1 ==5)
		{
			System.out.println("Die 1 is odd");
		}

		//more efficient way
		if(die2%2 ==1)
		{
			System.out.println("Die 2 is odd");
		}

		//switch statements
		//use when you want one or more things to happen
		//in sequence, can be framed like an if statement
		// - can combine cases
		//only use when you are comparing with ==
		// - use breaks to exit the statement
		// - default will execute unless you break
		System.out.println(); 
		switch (die1)
		{
			case 1: case 3: case 5:
			{
				//do stuff here if die1 == 1
				System.out.println("Die 1 is odd");
				break;
			}// end case
//			case 3: 
//			{
//				//do stuff here if die1 == 3
//				System.out.println("Die 1 is odd");
//				break;
//			}
//			case 5: 
//			{
//				//do stuff here if die1 == 5 
//				System.out.println("Die 1 is odd");
//				break;
//			}
			default:
			{
				System.out.println("Die 1 is even");
			}// end default
		}//end switch


	}//end main

}//end class
