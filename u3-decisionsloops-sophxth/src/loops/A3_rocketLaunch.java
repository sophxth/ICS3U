/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: March 25, 2024
 * Description: Use loops to create a 2 min rocket launch countdown where the first two numbers are always printed 
 * 				and then every number divisible by 10 until you get to <=20, then print every second until the time is up. 
 * 				“Blast Off!”
 */

package loops;

import java.util.Random;
import java.util.Scanner;

public class A3_rocketLaunch {

	public static void main(String[] args) throws InterruptedException
	{
		//Set up 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();

		//count down from 20 to 1
		//i-- is the same thing as i = i-1
		System.out.println("Please press enter to start the countdown.");
		try
		{
			System.in.read();
		}  // end try
		catch(Exception e)
		{

		}//end catch
		
		//loop decision 
		for (int i = 120; i > 0; i--) 
		{
			if ((i > 118 || i % 10 == 0) && i > 20) //if number gets smaller than 118, only display the number than can fully divide by 10

			{
				System.out.println(i + " ");
			} //end if
			else if (i <= 20)//in another statement if the number is geting smaller or equal to 20, it will count like normal

			{
				System.out.println(i);
			}// end else if
			
			Thread.sleep(1000);//count down by second
			
		}
		
		//print out the statement after count down occur
		System.out.println("Blast Off!");

		//		for(int i = 120; i>=10; i--) 
		//		{
		//			System.out.print(i + " ");
		//			Thread.sleep(1000);// pause program for 1 second before continuing
		//		}
		//		System.out.println();
		//		
		//		
		//		for(int i = 20; i>=1; i--)
		//		{
		//			System.out.print(i + " ");
		//			Thread.sleep(1000);//pauses program for 1 second before continuing
		//		}
		//		System.out.println();

	}// end main

}//end class
