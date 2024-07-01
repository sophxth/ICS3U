/* Name: Sophia Thai
 * Course: ICS 3U
 * Teacher: Mrs. McCaffery
 * Date: March 7, 2024
 * Description: The "hello world" program that asks for the user's 
 * 		name and age then prints greetings on the screen
 */
package classWork;

import java.util.*;

public class stumpTheChump
{
	public static void main(String [] args)
	{
		//initializes Scanner
		Scanner myInput = new Scanner(System.in);
				
		//Asks for the user's name, then prints a greeting
		String name = collectName(myInput);
		System.out.println("Hello " + name);
		
		//Asks for the user's age, then prints a complement
		int age = collectAge(myInput);
		if (age>=30)
		{
			System.out.println("Really? You don't look a day past 29!");
		
		}
		else if (age<30 && age==18)
		{
			System.out.println("Really? You look great for " + age + "!");
		}
		else if (age<18 && age>=7)
		{
			System.out.println("Already? You are so mature for your age!");
		}
		else  //age<7
		{
			System.out.println("When did you get so big??");
		}
		
		myInput.close();
		
	} //end main method

	/* Method Name: collectAge
	 * Description: asks for then returns the user's age
	 * Parameters: n/a
	 * Returns: int userAge
	 */
	public static int collectAge(Scanner myInput)
	{
		//asks for the user's name and collects it
		System.out.println("How old are you.");
		int userAge = myInput.nextInt();

		//returns the name entered
		return userAge;

	}//end collectAge method

	/* Method Name: collectName
	 * Description: asks for then returns the user's name
	 * Parameters: n/a
	 * Returns: String userName
	 */
	public static String collectName(Scanner myInput)
	{
		//asks for the user's name and collects it
		System.out.print("Please enter your name.");
		String userName = myInput.nextLine();

		//returns the name entered
		return userName;

	}//end collectName method
	
} // end class Greetings
