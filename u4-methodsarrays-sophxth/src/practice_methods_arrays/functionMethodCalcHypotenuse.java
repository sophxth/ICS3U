/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Mar 26, 2024
 * Description: Base program for method creation
 * 				Calculates the hypotenuse of a triangle
 */
package practice_methods_arrays;
import java.util.*; 
public class functionMethodCalcHypotenuse 
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

		hypotenuse = calcHypotenuse(sideA, sideB);

		calcHypotenuse(sideA, sideB);
		//calculate the hypotenuse
		//a^2 + b^2 = c^2
		// c = square root (a squared + b squared)
		hypotenuse = Math.sqrt((sideA * sideA) + (Math.pow(sideB, 2)));

		//print the result
		System.out.println("The hypotenuse is " + String.format("%.2f", hypotenuse) + " units");

	}//end main
	
	/* Method:calcHypotenuse
	 * Description: Calculates the hypotenuse of a triangle
	 * Parameters: double sideA, double sideB - the length of the triangle
	 * Returns: the hypotenuse calculated from the two sides
	 */
	private static double calcHypotenuse(double sideA, double sideB) 
	{
		//calculate the hypotenuse
		//a^2 + b^2 = c^2
		// c = square root (a squared + b squared)
		double hypotenuse = Math.sqrt((sideA * sideA) + (Math.pow(sideB, 2)));

		return hypotenuse;
	}

}//end class

