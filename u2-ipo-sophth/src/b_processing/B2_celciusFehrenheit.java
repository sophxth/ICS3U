/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 27, 2024
 * Description: Write a program that creates one random integer between -40 and +40 to represent degrees in Celsius. 
 * 				Convert this number to degrees Fahrenheit and display the results rounded to the nearest tenth 9/5 * C + 32 = F
 */
package b_processing;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class B2_celciusFehrenheit {

	public static void main(String[] args) {
		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();

		//Random numbers 
		//Note: the 40 is how many numbers there are
		//      the -40 is where those numbers start
		//Math class
		//create a random number between 40 to -40
		int randomCel = rand.nextInt(40)-40; 
		
		// Convert Celsius to Fahrenheit
		double temptFah = ((9.0/5.0)*randomCel) + 32;
		
		// Round to the nearest tenth
		double roundedTemperature = Math.round(temptFah * 10.0) / 10.0;
		
		// Display the results
		System.out.println("Degree in Celcius is: " + randomCel);
		System.out.println("Degree in Fahrenheit is: " + roundedTemperature); 
	}//end class

}// end main
