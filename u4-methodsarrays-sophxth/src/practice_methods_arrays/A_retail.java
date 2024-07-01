/* Name:  Sophia Thai
 * Course: ICS 3U  
 * Teacher: Mrs. McCaffery  
 * Date:  May 22, 2024 (i can't remember the start date;-;)
 * Description: System checkout for the retail store 
*/
package practice_methods_arrays;

import java.util.*;

public class A_retail {
    // Constant for the sales tax rate
    private static final double SALES_TAX_RATE = 0.13;
    // Arrays to store item quantities, names, and prices
    private static int[] quantities;
    private static String[] names;
    private static double[] prices;
    private static int itemCount;

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        //set the introduction for the Retail page
		introduction();
	
		// Initialize arrays
		initializeArrays();
	
		// Get items from the user
		try {
			getItems(myInput);
	
			// Display menu options
			displayMenu(myInput);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter valid input.");
		} finally {
			myInput.close();
		}
	}// end main
	
    //Introduction:)
     /* Method Name: introduction
     * Description: Prints the introduction message to the console.
     * Parameters: None
     * Returns: void
     */
    private static void introduction() {
        System.out.println("Hello Mrs. McCaffery!");
        System.out.println("WELCOMEE! to my grocery store, called 'Henry The Cat'");
        System.out.println("I promise there are no cats inside, if you have allergies, please come inside still!");
        System.out.println("Don't worry!");
        System.out.println("Womp womop! :(");
        System.out.println("We sell many things here, like peanut butter (unless you're gonnoa die ykwim)");
        System.out.println("Here, our communication is perfect! (please don't give me a 40;-;)");
        System.out.println("I hope you enjoy buying things and GIBEM E AOL YORU AMOENY");
    }// end introduction

    // Initialize arrays with a maximum capacity
    /* Method Name: initializeArrays
     * Description: Initializes the arrays for item quantities, names, and prices.
     * Parameters: None
     * Returns: void
     */
    private static void initializeArrays() {
        // Initialize arrays with a maximum capacity, you can adjust this based on your needs
        int maxCapacity = 100; // Adjust as needed
        quantities = new int[maxCapacity];
        names = new String[maxCapacity];
        prices = new double[maxCapacity];
        itemCount = 0;// initial value
    }// end initializeArrays

    /* Method Name: getItems
     * Description: Prompts the user to enter item details (quantity, name, and price) and stores them in the arrays.
     * Parameters: Scanner scanner - Scanner object for user input
     * Returns: void
     */
    private static void getItems(Scanner scanner) {
        System.out.println("Enter each item's quantity, name, and price (enter 0 for quantity to finish):");

        while (true) {
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            if (quantity == 0) break;
            //input the name of the items
            System.out.print("Name: ");
            String name = scanner.next();
            // input the number of the price
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            quantities[itemCount] = quantity;
            names[itemCount] = name;
            prices[itemCount] = price;

            itemCount++;
        }//end while
    }//end getItems

    /* Method Name: displayMenu
     * Description: Displays the menu options to the user and handles user input for different actions.
     * Parameters: Scanner scanner - Scanner object for user input
     * Returns: void
     */
    private static void displayMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nMenu Options:");
            System.out.println("1. Add item(s)");
            System.out.println("2. Remove item(s)");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            // get user input 
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            // using switch to use user imput
            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout(scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }// end switch
        }//end while
    }// end displayMenu

    /* Method Name: addItem
     * Description: Prompts the user to add an item by specifying its name and quantity. If the item already exists, increases its quantity; otherwise, adds a new item.
     * Parameters: Scanner scanner - Scanner object for user input
     * Returns: void
     */
    private static void addItem(Scanner scanner) {
        System.out.println("Enter the item's name and quantity to add:");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // Find the item in the array
        int index = findItemIndex(name);
        if (index != -1) {
            // If the item already exists, increase its quantity
            quantities[index] += quantity;
        } //end if
        else {
            // Otherwise, add a new item
            names[itemCount] = name;
            quantities[itemCount] = quantity;
            System.out.print("Price: ");
            prices[itemCount] = scanner.nextDouble();
            itemCount++;
        }// end else
    }// end addItem

     /* Method Name: findItemIndex
     * Description: Finds the index of an item in the arrays by its name.
     * Parameters: String name - The name of the item to find
     * Returns: int - The index of the item if found, otherwise -1
     */
    private static int findItemIndex(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return i;
            }// end if
        } //end for
        return -1;
    }// end findItemIndex

    /* Method Name: removeItem
     * Description: Prompts the user to remove an item by specifying its name. If the item exists, removes it from the arrays.
     * Parameters: Scanner scanner - Scanner object for user input
     * Returns: void
     */
    private static void removeItem(Scanner scanner) {
        System.out.println("Enter the item's name to remove:");
        String name = scanner.next();// set the value

        int index = findItemIndex(name);
        if (index != -1) {
            // If the item exists, remove it
            for (int i = index; i < itemCount - 1; i++) {
                names[i] = names[i + 1];
                quantities[i] = quantities[i + 1];
                prices[i] = prices[i + 1];
            }//end for 
            itemCount--;
        }// end if  
        else {
            System.out.println("Item not found in cart.");
        }// end else
    }// end removeItem

    /* Method Name: viewCart
     * Description: Displays the current contents of the cart, including item quantities, names, and subtotals. Also shows the total amount.
     * Parameters: None
     * Returns: void
     */
    private static void viewCart() {
        System.out.println("Cart:");
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            double subtotal = quantities[i] * prices[i];
            System.out.printf("%d - %s: $%.2f%n", quantities[i], names[i], subtotal);
            total += subtotal;
        }// end for
        System.out.printf("Total: $%.2f%n", total);
    }// end viewCart

    /* Method Name: checkout
     * Description: Handles the checkout process by displaying the cart contents, calculating the total with tax, and processing the payment.
     * Parameters: Scanner scanner - Scanner object for user input
     * Returns: void
     */
    private static void checkout(Scanner scanner) {
        viewCart();

        double subtotal = 0;
        for (int i = 0; i < itemCount; i++) {
            subtotal += quantities[i] * prices[i];
        }// end for

        double tax = subtotal * SALES_TAX_RATE;
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax (HST 13%%): $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);

        System.out.print("Enter the amount you are paying with: $");
        double payment = scanner.nextDouble();

        if (payment < total) {
            System.out.println("Insufficient payment. Please pay the full amount.");
            return;
        }//end if 

        double change = payment - total;
        System.out.printf("Change: $%.2f%n", change);
    }// end checkout
}//end class
