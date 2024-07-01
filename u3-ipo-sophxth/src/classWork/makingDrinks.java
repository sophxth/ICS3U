/* Name: Sophia Thai
 * Course: ICS 3U
 * Teacher: Mrs. McCaffery
 * Date: March 7, 2024
 * Description: Program that calculates how much powdered mix and water need to
 * 	be added to a container to make juice.
 */
package classWork;

import java.util.*;

public class makingDrinks
{
	public static void main( String[] args )
	{
		//setup
		Scanner myInput = new Scanner(System.in);
		
		//recipe values
		int powderedMixRecipe = 0;
		int waterRecipe = 0;
		int totalSizeOfRecipe = 0;
		//containerValues
		double powderedMixPart = 0;
		double waterPart = 0;
		int containerSize = 0;
		
		//intro
		System.out.println("Powdered Drink Mixer");
		
		//Ask for and collect 
		// 1) size of container in mL
		//	2)	ratio numbers: powdered mix 
		//	3) ratio numbers: water
		System.out.print("How much liquid fits in your drink container? (mL) ");
		containerSize = myInput.nextInt();
		System.out.println("Looking at one of the recipes on the package please enter the amount of ...");
		System.out.print("\t... powdered mix (mL): ");
		powderedMixRecipe = myInput.nextInt();
		System.out.print("\t... water (mL): ");
		waterRecipe = myInput.nextInt();
		
		//calculate how much one recipe makes and then use
		//ratio calculations to find out how much to put in your container.
		totalSizeOfRecipe = powderedMixRecipe + waterRecipe;
		powderedMixPart = powderedMixRecipe * containerSize*1.0/ totalSizeOfRecipe;
		waterPart = waterRecipe * containerSize * 1.0 / totalSizeOfRecipe;
		
		//Prints how much of each you need to add to container to fill it
		System.out.println("Thank you!\n");
		System.out.println("You will need about " + String.format("%.2f", powderedMixPart) + "mL powdered drink mix and " + String.format("%.2f",waterPart) + "mL water");
		
	}//end main

}//end class
