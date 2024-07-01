/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: May 9, 2024
 * Description: Array class for intergerArratTestScript
 */

package tasks;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Array {
	/* Method Name: printArrayToFile 
	 * Description: Prints an integer array to a file, separating elements with commas.
	 * Parameters: PrintWriter myOutput - the writer to which the array is printed
	 *             int[] array - the array to be printed
	 * Returns: void
	 */
	public static void printArrayToFile(PrintWriter myOutput, int[] array) {
		myOutput.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			myOutput.print(", " + array[i]);
		}// end for
		myOutput.println();
	}//end printArrayToFile

	/* Method Name: printArrayToFile 
	 * Description: Prints a string array to a file, separating elements with commas.
	 * Parameters: PrintWriter myOutput - the writer to which the array is printed
	 *             String[] array - the array to be printed
	 * Returns: void
	 */
	public static void printArrayToFile(PrintWriter myOutput, String[] array) {
		myOutput.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			myOutput.print(", " + array[i]);
		}// end for
		myOutput.println();
	}//end printArrayToFile

	/* Method Name: createUserDefinedIntArray 
	 * Description: Creates an integer array of a given size with elements input by the user.
	 * Parameters: int size - the size of the array to be created
	 * Returns: int[] - the created array
	 */
	public static int[] createUserDefinedIntArray(int size) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			try {
				System.out.print("Enter element " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			} //end try
			catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.nextLine(); // Consume the invalid input
				i--; // Retry the current index
			}//end catch
		}//end for

		return array;
	}//end createUserDefinedIntArray

	/* Method Name: createEmptyIntArray 
	 * Description: Creates an empty integer array of a given size.
	 * Parameters: int size - the size of the array to be created
	 * Returns: int[] - the created array
	 */
	public static int[] createEmptyIntArray(int size) {
		return new int[size];
	}// end createEmptyIntArray

	public static int[] createRandomIntArray(int size, int min, int max) {
		int[] array = new int[size];
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt((max - min) + 1) + min;
		}//end for
		return array;
	}//end createRandomIntArray

	/* Method Name: findMax 
	 * Description: Finds the index of the maximum element in an integer array.
	 * Parameters: int[] numbersArray - the array to be searched
	 * Returns: int - the index of the maximum element
	 */
	public static int findMax(int[] numbersArray) {
		int position = 0;

		for (int i = 1; i < numbersArray.length; i++) {
			if (numbersArray[i] > numbersArray[position]) {
				position = i;
			}//end if
		}//end for
		return position;
	}//end findMax

	/* Method Name: findMin 
	 * Description: Finds the index of the minimum element in an integer array.
	 * Parameters: int[] numbersArray - the array to be searched
	 * Returns: int - the index of the minimum element
	 */
	public static int findMin(int[] numbersArray) {
		int position = 0;

		for (int i = 1; i < numbersArray.length; i++) {
			if (numbersArray[i] < numbersArray[position]) {
				position = i;
			}//end if
		}// end for
		return position;
	}// end findMin

	/* Method Name: swapElements 
	 * Description: Swaps two elements in an integer array.
	 * Parameters: int[] numbersArray - the array in which elements will be swapped
	 *             int i - the index of the first element
	 *             int j - the index of the second element
	 * Returns: void
	 */
	public static void swapElements(int[] numbersArray, int i, int j) {
		int temp = numbersArray[i];
		numbersArray[i] = numbersArray[j];
		numbersArray[j] = temp;
	}//end swapElements

	/* Method Name: findElement 
	 * Description: Finds the index of a target element in an integer array.
	 * Parameters: int target - the element to be found
	 *             int[] numbersArray - the array to be searched
	 * Returns: int - the index of the target element, or -1 if not found
	 */
	public static int findElement(int target, int[] numbersArray) {
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] == target) {
				return i;
			}//end if
		}// end for
		return -1;
	}//end findElement

	/* Method Name: countElements 
	 * Description: Counts the occurrences of a target element in an integer array.
	 * Parameters: int target - the element to be counted
	 *             int[] numbersArray - the array to be searched
	 * Returns: int - the number of occurrences of the target element
	 */
	public static int countElements(int target, int[] numbersArray) {
		int count = 0;
		for (int num : numbersArray) {
			if (num == target) {
				count++;
			}// end if
		}// end for
		return count;
	}// end countElements

/* Method Name: copyArray 
	 * Description: Creates a copy of an integer array.
	 * Parameters: int[] numbersArray - the array to be copied
	 * Returns: int[] - the copy of the array
	 */
	public static int[] copyArray(int[] numbersArray) {
		return Arrays.copyOf(numbersArray, numbersArray.length);
	}// end copyArray

	/* Method Name: checkIfCopy 
	 * Description: Checks if two integer arrays are identical copies.
	 * Parameters: int[] arrayCopy - the first array to be compared
	 *             int[] numbersArray - the second array to be compared
	 * Returns: boolean - true if the arrays are identical copies, false otherwise
	 */
	public static boolean checkIfCopy (int[] arrayCopy, int[] numbersArray) {
		int count = 0;

		if (arrayCopy == numbersArray) 
		{
			return false;
		}// end if
		else
		{
			if (arrayCopy.length == numbersArray.length)
			{
				for (int i = 0; i < arrayCopy.length; i++)
				{
					if (arrayCopy[i] == numbersArray[i]) {
						count++;
						if (count == arrayCopy.length) {
							return true;
						}// end if
					}// end if
				}// end for
			}// end if
		}// end else
		
		return false;
	}// end checkIfCopy

	/* Method Name: checkIfIdentical 
	 * Description: Checks if two integer arrays are identical (referencing the same memory location).
	 * Parameters: int[] numbersArray - the first array to be compared
	 *             int[] numbersArray2 - the second array to be compared
	 * Returns: boolean - true if the arrays are identical, false otherwise
	 */
	public static boolean checkIfIdentical(int[] numbersArray, int[] numbersArray2) {
		return (numbersArray == numbersArray2);
	}// end checkIfIdentical

	/* Method Name: replaceElement 
	 * Description: Replaces an element in an integer array at a specified position.
	 * Parameters: int[] array - the array in which the element will be replaced
	 *             int value - the new value to be inserted
	 *             int position - the index of the element to be replaced
	 * Returns: void
	 */
	public static void replaceElement(int[] array, int value, int position) 
	{
		array[position] = value;
	}// end replaceElement

	/* Method Name: replaceElements 
	 * Description: Replaces all occurrences of a target element with a replacement value in an integer array.
	 * Parameters: int[] array - the array in which elements will be replaced
	 *             int target - the element to be replaced
	 *             int replacement - the new value to replace the target
	 * Returns: void
	 */
	public static void replaceElements(int[] array, int target, int replacement) {
		for (int i = 0	; i < array.length; i++) 
		{
			if (array[i] == target) 
			{
				array[i] = replacement;
			}// end if
		}// end for
	}// end replaceElements

	/* Method Name: insertElement 
	 * Description: Inserts an element into an integer array at a specified index.
	 * Parameters: int[] array - the array in which the element will be inserted
	 *             int element - the element to be inserted
	 *             int index - the position where the element will be inserted
	 * Returns: int[] - the new array with the inserted element
	 */
	public static int[] insertElement(int[] array, int element, int index) {

		int[] newArray = new int[array.length + 1];
		newArray[index] = element;
		
		for (int i = 0; i < newArray.length; i++) {
			if (i < index) {
				newArray[i] = array[i];
			}// end if
			else if (i > index) {
				newArray[i] = array[i-1];
			}// end else if
		}// end for

		return newArray;
	}// end insertElement

	/* Method Name: deleteElement 
	 * Description: Deletes an element from an integer array at a specified index.
	 * Parameters: int[] array - the array from which the element will be deleted
	 *             int index - the position of the element to be deleted
	 * Returns: int[] - the new array with the deleted element
	 */
	public static int[] deleteElement(int[] array, int index) {
		int[] newArray = new int[array.length - 1];
		System.arraycopy(array, 0, newArray, 0, index);
		System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
		return newArray;
	}// end deleteElement

	/* Method Name: sortHighToLow 
	 * Description: Sorts an integer array in descending order.
	 * Parameters: int[] array - the array to be sorted
	 * Returns: int[] - the sorted array
	 */
	public static int[] sortHighToLow(int[] array) {
		int[] sortedArray = array.clone();
		Arrays.sort(sortedArray);
		for (int i = 0; i < sortedArray.length / 2; i++) 
		{
			int temp = sortedArray[i];
			sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
			sortedArray[sortedArray.length - 1 - i] = temp;
		}// end for
		return sortedArray;
	}// end sortHighToLow

	/* Method Name: sortLowToHigh 
	 * Description: Sorts an integer array in ascending order.
	 * Parameters: int[] array - the array to be sorted
	 * Returns: int[] - the sorted array
	 */
	public static int[] sortLowToHigh(int[] array) {
		int[] sortedArray = array.clone();
		Arrays.sort(sortedArray);
		return sortedArray;
	}// end sortLowToHigh

	/* Method Name: print 
	 * Description: Prints the elements of an integer array to the console.
	 * Parameters: int[] numbersArray - the array to be printed
	 * Returns: void
	 */
	public static void print(int[] numbersArray) {
		// prints stuff
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i]);

			if (numbersArray.length - 1 > i) {
				System.out.print(", ");
			}// end if
		}//end for
		System.out.println();
	}// end print
}
