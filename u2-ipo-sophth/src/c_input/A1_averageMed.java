/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: Feb 29, 2024
 * Description: Ask user for 4 course marks. 
 * 				Display the average and median mark.
 */
package c_input;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*; //replace the two lines above

public class A1_averageMed {

	public static void main(String[] args) {
		//initialize variables
		Scanner myInput = new Scanner(System.in); // tool to collect info from the console
		Random rand = new Random(); //not used in this
		int mark1 = -1;
		int mark2 = -1;
		int mark3 = -1;
		int mark4 = -1;
		String fName = "";
		String lName = "";
		
		//Collect user's first and last name and user's 4 marks 
		System.out.println("Please enter you first and last name: ");
		fName = myInput.next(); //collects to the first space or end of line (EOL)
		lName = myInput.nextLine(); //collects and removes the input including the EOL
		lName = lName.substring(1); //removed the space at the beginning since it wasn't collected using the "next" command
		System.out.println("Please enter your first mark: ");
		mark1 = myInput.nextInt();
		System.out.println("Please enter your second mark: ");
		mark2 = myInput.nextInt();
		System.out.println("Please enter your third mark: ");
		mark3 = myInput.nextInt();
		System.out.println("Please entre your fourth mark: ");
		mark4 = myInput.nextInt();
		// Put the marks into an array
        int[] marks = {mark1, mark2, mark3, mark4};
        
        // I found this way to do the median through using if and else command and the array command to sort the number out through w3schools
        // Sort the marks array
        Arrays.sort(marks);
        
        // Calculate median
        double medianResult;
        if (marks.length % 2 == 0) 
        {
            // If even number of marks, take average of two middle values of the number
            int middleIndex1 = marks.length / 2 - 1;
            int middleIndex2 = marks.length / 2;
            medianResult = (marks[middleIndex1] + marks[middleIndex2]) / 2.0;
        } //end if
        else 
        {
            // If odd number of marks, take the middle value of the number
            int middleIndex = marks.length / 2;
            medianResult = marks[middleIndex];
        } //end else
        
		//calculate the course average
		double averageResult = ((mark1+mark2+mark3+mark4)/4); 
		
		//print the user's name, 4 input marks and the result in median and average
		System.out.println("Hi " + fName);
		System.out.println("Your first mark is " + mark1);
		System.out.println("Your second mark is " + mark2);
		System.out.println("Your third mark is " + mark3);
		System.out.println("Your fourth mark is " + mark4);
		System.out.println("Your median is " + medianResult );
		System.out.println("Your average is " + averageResult );
	}//end main

}//end 
