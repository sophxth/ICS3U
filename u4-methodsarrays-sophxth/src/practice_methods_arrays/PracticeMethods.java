/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Mar 26, 2024
 * Description: Base program for method creation
 * 				Calculates the hypotenuse of a triangle
 */
package practice_methods_arrays;
import java.util.*; 
public class PracticeMethods 
{
	public static void main(String[] args) 
	{
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();
		double sideA = 0;
		double sideB = 0;
		double hypotenuse = 0;

		System.out.println("Calculate the length of the hypotenuse:\n");

		//collect a and b (the two side lengths of the right angled triangle)
		System.out.print("Please enter the value of a: ");
		sideA = myInput.nextDouble();
		System.out.print("Please enter the value of b: ");
		sideB = myInput.nextDouble();

		//calculate the hypotenuse
		//a^2 + b^2 = c^2
		// c = square root (a squared + b squared)
		hypotenuse = Math.sqrt((sideA * sideA) + (Math.pow(sideB, 2)));

		//print the result
		System.out.println("The hypotenuse is " + String.format("%.2f", hypotenuse) + " units");

	}//end main

}//end class

