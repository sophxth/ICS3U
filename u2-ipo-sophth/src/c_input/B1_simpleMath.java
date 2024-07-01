/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Mar 3, 2024
 * Description: Ask the user to answer 3 simple math problems. 
 * 				Get their answer and output an appropriate response. 
 * 				Use random numbers to ask different questions each time.
 */

package c_input;


//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class B1_simpleMath 
{

	public static void main(String[] args) 
	{

		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();

		// Loop to ask three math problems
		for (int i = 0; i < 3; i++) //This for loop iterates three times, each iteration representing one math problem.
		{
			// Generate random numbers
			// Random number between 1 and 10
			int num1 = rand.nextInt(10) + 1; 
			int num2 = rand.nextInt(10) + 1;

			// Randomly choose operation
			int operation = rand.nextInt(3); // 0 for addition, 1 for subtraction, 2 for multiplication

			// Display the math problem
			switch (operation) //Based on the operation, it prints the math problem accordingly.
			{
			case 0:
				System.out.print("What is " + num1 + " + " + num2 + "? ");
				break;
			case 1:
				System.out.print("What is " + num1 + " - " + num2 + "? ");
				break;
			case 2:
				System.out.print("What is " + num1 + " * " + num2 + "? ");
				break;
			}//end switch command

			// Get user's answer
			//scanner.nextLine() reads the user's input as a string, which is then parsed into an integer using myInput.nextInt()
			int userAnswer = myInput.nextInt();

			// Calculate the correct answer
			int correctAnswer = 0;
			switch (operation) 
			{
			case 0:
				correctAnswer = num1 + num2;
				break;
			case 1:
				correctAnswer = num1 - num2;
				break;
			case 2:
				correctAnswer = num1 * num2;
				break;
			}// end case

			// Output appropriate response
			if (userAnswer == correctAnswer) 
			{
				System.out.println("Correct!");
			}// end if
			else 
			{
				System.out.println("Incorrect. The correct answer is " + correctAnswer);
			}// end else
		}// end for command
	
	}// end main
	
}//end class

