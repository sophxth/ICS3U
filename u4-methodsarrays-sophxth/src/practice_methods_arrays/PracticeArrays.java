package practice_methods_arrays;

import java.util.*;

public class PracticeArrays 
{
	public static void main(String[] args)

		{

			//creating variables

			//primitive (origin) type
			int size = 8;

			//object
			Scanner myInput = new Scanner(System.in);
			Random rand = new Random();

			//array creation using 'new' command
			String [] names = new String[size];
			int [] marks = new int[size];

			//array creation for known values
			double [] coinValues = {0.01, 0.05, 0.10, 0.25, 1.00, 2.00};
			System.out.println(names[3]);
			String [] studentNames = {"Sophia", "Nicolas", "Matteo", "Jatana", "Ben", "Jatana"};
			System.out.println(studentNames[5]);			
			studentNames[5] = "johnathansljgfnsd"; // starts at 0 so it doesn['t work
			System.out.println(studentNames[5]);
	
 
			//printing information from arrays
			System.out.println(coinValues); //prints memory location
			System.out.println(coinValues[2]); //prints a specific element at the given index location

			//printing all values in the array

			for(int i = 0; i<coinValues.length; i++)
			{
				System.out.println(coinValues[i]);
			}
			System.out.println();

			//writing to an array (store information)

			names[0] = "Catherine";
			marks[0] = 100;
			for(int i = 0; i<marks.length; i++)
			{
				marks[i] = rand.nextInt(100 - 20 + 1)+20;
			}

			//use the local print method to print all the marks
//			Array.print(marks);
			System.out.println();

			//use the Array.java method to print all the marks
//			Array.print(marks);

		}//end main

	}// end class

