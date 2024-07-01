/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 27, 2024
 * Description: Write a program that uses random numbers to create 4 marks between 1 - 100. 
 * 				Display them, then use these numbers to calculate the average.
 */
package b_processing;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class C3_randomNum 
{

	public static void main(String[] args) 
	{
		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();

		//Random numbers 
		//Note: the 100 is how many numbers there are
		//      the 1 is where those numbers start
		//Math class
		//create a random number between 100 to 1
		int mark1 = rand.nextInt(100) + 1;
		int mark2 = rand.nextInt(100) + 1;
		int mark3 = rand.nextInt(100) + 1;
		int mark4 = rand.nextInt(100) + 1;

		// Display the marks from the above random numbers
		System.out.println("Mark 1: " + mark1);
		System.out.println("Mark 2: " + mark2);
		System.out.println("Mark 3: " + mark3);
		System.out.println("Mark 4: " + mark4);

		// Calculate the average of the 4 numbers
		double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

		// Display the average of the 4 marks out
		System.out.println("Average mark: " + average + "%");


	}//end class

}//end main 
