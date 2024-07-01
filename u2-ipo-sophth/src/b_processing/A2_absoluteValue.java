/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 27, 2024
 * Description: Write a program that creates a random number between -100 and +100. 
 * 				Print the original and absolute value (positive equivalent) of the number.
 */
package b_processing;
//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class A2_absoluteValue 
{

	public static void main(String[] args) 
	{
		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();

		//Random numbers 
		//Note: the 100 is how many numbers there are
		//      the -100 is where those numbers start
		//Math class
		//create a random number between 100 to -100
		int randomNum = rand.nextInt(100)-100;
		System.out.println("A random number between 100 to -100: " + randomNum);
		//print the phrase 'A random number between 100 to -100 : ' and the variable of the 'randomNum'
	
		
		//Math class
		//create a asolute value of the random number above using Math.abs();
		double absoluteVal = Math.abs(randomNum); 
		System.out.println("And the absolute value : " + absoluteVal); 
		//print the phrase 'And the absolute value: ' and the variable of the 'absoluteVal'
	

	}//end class

}//end main
