/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: March 6, 2024
 * Description: Ask for 4 integers. Output the four numbers in descending order (largest to smallest)
 */

package decisions;
//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

public class C2_descendingOrder {

	public static void main(String[] args) {
		//initialize variables
		Scanner myInput = new Scanner(System.in); 
		Random rand = new Random();
		int num1 = -1;
		int num2 = -1;
		int num3 = -1;
		int num4 = -1;

		//Ask user for the input value
		System.out.println("Please input the first number: ");
		num1 = myInput.nextInt();
		System.out.println("Please input the second number: ");
		num2 = myInput.nextInt();
		System.out.println("Please input the third number: ");
		num3 = myInput.nextInt();
		System.out.println("Please input the fourth number: ");
		num4 = myInput.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4) // giving command to list out the number in order 
		{
			System.out.print(num1 + ",");
		}//end if
		
		else if (num2 > num1 && num2 > num3 && num2 > num4)
		{
			System.out.print(num2 + ",");
		} //end else if
		else if (num3 > num1 && num3 > num2 && num3 > num4)
		{
			System.out.print(num3 + ",");
		} //end else if
		else if (num4 > num1 && num4 > num2 && num4 > num3)
		{
			System.out.print(num4 + ",");
		} //end else if
	}//end main

}//end class
