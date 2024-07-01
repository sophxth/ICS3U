/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: , 2024
 * Description: Ask the user for values a, b, and c for the quadratic y = ax2+bx+c. 
 * 				Find and display the roots of the quadratic. 
 * 				(Will need to check the discriminant to see if there are one, two or zero roots)
 */
package decisions;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*; 

public class B2_mathQuadratic {

	public static void main(String[] args) {
		//initialize variables
		Scanner myInput = new Scanner(System.in); 
		Random rand = new Random();
		int valueA = -1;
		int valueB = -1;
		int valueC = -1;

		//Greeting
		System.out.println("Calculating for f(x)= ax^2 + bx + c");

		//User input value
		System.out.println("Please input the value of a: ");
		valueA = myInput.nextInt ();
		System.out.println("PLease input the value of b: ");
		valueB = myInput.nextInt ();
		System.out.println("Please input the value of c: ");
		valueC = myInput.nextInt ();

		//Calculate the discriminant 
		double discriminant = (valueB*2 - 4*valueA*valueC);

		//test the calculation
		//System.out.println(discriminant);

		if (discriminant>0)
		{
			//calculating the root 1 and root 2 when the discriminant is larger than 0
			double root1 = (Math.round(-valueB + Math.sqrt(discriminant)) / (2*valueA));
			double root2 = (Math.round(-valueB - Math.sqrt(discriminant)) / (2*valueA));
			//print the calculated value of root 1 and root 2
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);

		}// end if
		else if (discriminant==0)
		{
			//calculate the root if the function only have 1 root
			double root = (Math.round(-valueB / (2*valueA)));
			//print out the value of the single root
			System.out.println("Root: " + root);

		}// end else if
		else
		{
			//print no real roots statement as the result does not suit to any command above :)
			System.out.println("No real roots");
		}//end else

	}//end main

}//end class
