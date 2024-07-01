/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: April 5, 2024
 * Description: Using loops, print n terms in the French game “Pamplemousse” 
 * 	(every number divisible by 3 or containing a 3 as a digit is replaced by the word ‘pamplemousse’
 */
package loops;

public class C1_pamplemousse 
{

	public static void main(String[] args) 
	{
		int n = 20; // Change n to the desired number of terms
		for (int i = 1; i <= n; i++)//set out the number range 
		{
			if (i % 3 == 0 || String.valueOf(i).contains("3")) 
			{
				System.out.println("pamplemousse");
			} //end if
			else 
			{
				System.out.println(i);
			}//end else
		}//end for

	}//end main
}//end class
