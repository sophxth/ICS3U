/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 25, 2024
 * Description: demo for variable and output
 */
package a_output;

import java.util.Random;
import java.util.Scanner;

public class PracticeOutput 
{
	public static void main(String[] args) 
	{
		//different kinds of variables
		//DataTypr NameOfVariaable = InitialValue;
		//variable names start with lower case letter and each subsequent word is upper case, no space
		//primitive types
		int age = 16; //numbers without decimal 
		double hoursWork = 4.5; //numbers with decimal
		double wage = 16.5; 
		char gender = 'f'; //use single quotes: single characters, can be alpha numeric, symbol
		boolean isAlive = true; //true or false
		//object types
		String name = "Sophia Thai"; //object type, sequence of characters, use double quotes'
		Object table = "wood"; //
		Scanner myInput = new Scanner (System.in); //object type allow program to collect input from user
		Random rand = new Random (); //object type, create random values of different types
		//constants
		final double HST_RATE = 0.13;
		
		// when using object type variables you can reference
		// methods that do stuff with it using the '.'
		int length = name.length();
		
		//printing information on the screen
	System.out.print("Welcome "); //prints info inside the brackets and keeps cursor at the end of the line
		System.out.println(name); //print info inside of brackets and moves cursor to new lines
		
		System.out.println("You Worked " + hoursWork + " for $" + wage + "/h");
		System.out.println("That is $" + hoursWork*wage);
		
		System.out.println("Combining concatenate (+) with adding (+) involves using brackets:" +3+3);
		
		//using control characters
		//use '\' before a special character to create effects
		System.out.println("Control characters use the \\");
		System.out.println("Print on new \nlines"); //new lines
		System.out.println("Prints \tusing \ttabs"); //tabs
		System.out.println("Prints \"quote\""); 
		
	}//end main

}// end class
