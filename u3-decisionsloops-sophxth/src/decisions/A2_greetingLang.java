/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Mar 5, 2024
 * Description: Write a program to ask the user for a language using a menu (i.e. enter 1 for English, 2 for French, etc.) 
 * 				and output a greeting in the language they select.
 */
package decisions;

import java.util.*;

public class A2_greetingLang {

	public static void main(String[] args) {
		//initialize variable 
		Scanner myInput = new Scanner(System.in);
		Random rand = new Random();
		int language = -1;
		
		//ask for user language preference
		System.out.println("Please enter 1 for English, 2 for French and 3 for Vietnamese: ");
		language = myInput.nextInt();
		
		
		if (language ==1) //if input==1 => English greeting
		{
			System.out.print("Hello");
		}//end if
		else if (language ==2) //if input==2 => French greeting
		{
			System.out.println("Bonjour");
		}//end else if
		else if (language ==3) //if input==3 => Vietnamese greeting
		{
			System.out.println("Xin chào");
		}//end else if
		else //if input== other numbers from 1 and 2 => Language not supported
		{
			System.out.println("Language not supported");
		}//end else

	}//end main 

}//end class
