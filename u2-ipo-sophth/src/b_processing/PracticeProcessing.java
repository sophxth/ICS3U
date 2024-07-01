/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 26, 2024
 * Description: Demo input
 */

package b_processing;
//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class PracticeProcessing 
{
	public static void main(String[] args) 
	{
		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();
		
		//Basic math operation
		System.out.println("Adding: \"+\"");
		System.out.println("Subtracting: \"-\"");
		System.out.println("Multiplying: \"*\"");
		System.out.println("Dividing: \"/\"");
		System.out.println("Modulus (remainder after division): \"%\"");
		
		//calculation with operators
		System.out.println("10+18 = " + (10+18));// need round brackets to force it to calculate the value
		System.out.println("10-18 = " + (10-18));//
		System.out.println("10*18 = " + 10*18);//
		System.out.println("10/18 = " + 10/18);//integer division print 0 since it truncates the decimals (chop off decimals)
		System.out.println("10%18 = " + 18%10);
		
		//calculations with decimals
		System.out.println("10.0/18.0 = " + 10.0/18.0);//if both are double it will prints both with decimals
		System.out.println("10.0/18 = " + 10.0/18);
		System.out.println("10/18/0 = " + 10/18.0);
		System.out.println("10/18+4 = " + (10/18+4.0));//disconnected from the division part => where the double is matter
		System.out.println("10/18+4 = " + (4.0+10/18));
		System.out.println("10/18+4 = " + (10/18.0+4));
		System.out.println("Type casting ... 10/18 = " + ((double)10.0/(double)18.0));//
		int n1 = 10;
		int n2 = 18;
		System.out.println("10.0/18.0 = " + (n1/n2));
		System.out.println("10.0/18.0 = " + ((double)n1/n2));
		System.out.println("10.0/18.0 = " + (n1*1.0/n2));
		double n3 = 10;
		double n4 = 18;
		double result = n3/n4;
		System.out.println("10.0/18.0 = " + result);
		
		//Library calls
		double max = Math.max(n3, n4);
		System.out.println(max);
		max = Math.max(n4,  n3);
		System.out.println(max); 
		double rounded = Math.round(result);
		System.out.println(result);
		System.out.println(rounded);
		double rounded2DP = Math.round((result*100))/100.0;
		System.out.println(rounded2DP);
		System.out.println(Math.round((0.1*100))/100.0);// rounded to 2 decimal places but only shows one
		System.out.println(String.format("%.2f", 0.1));//shows rounded to 2 decimal places when the number only have one
													   //just changes how it is printed, not the value its self
		
		//Random numbers 
		//Note: the 10 is how many numbers there are
		//      the 1 is where those numbers start
		//Math class
		//create a random number between 1 to 10
		int random1 = (int) (Math.random()*10) +1;
		System.out.println(random1);
		//using the random class
		int random2 = rand.nextInt(10) +1;
		System.out.println(random2);
		
	}//end main

}//end class
