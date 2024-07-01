/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: June 6, 2024
 * Description: Main class for VietCong Game
 */
package VietCong_sophia;
import java.util.*;

public class VietCongMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static Player[] players = new Player[4];
    private static Deck deck = new Deck();
    private static Card lastPlayedCard = null;
    private static int passesInARow = 0;
    private static int[] botDifficulties = new int[3];

    public static void main(String[] args) {
        // Track the highest player record
        int highestScore = 0;
        String highestScorer = "";
        
         //     BEGIN TienLenGame
        while (true)
        {
            //print Welcome 
            System.out.println("###########################################################");
            System.out.println("                          Welcome");
            System.out.println("                          to  the");
            System.out.println("                    TIEN LEN CARDS GAME ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("             -1. RULE-                  -2. PLAY-");
            System.out.println("###########################################################");
            System.out.println("\nPlease enter your choice to continue: ");
            while (true)
            {
                int choice = getInteger();

                    if (choice == 1){
                        printRules();// print the rule if the user input is 1
                        break; 
                    }// end if
                    else if (choice == 2)// game start is the user input is 2
                    {
                        setupGame();
                        dealCards();
                        int startingPlayer = findStartingPlayer();
                        String winner = playGame(startingPlayer);
                        if (players[0].getName().equals(winner)) {
                            highestScore++;
                            highestScorer = players[0].getName();
                        }// end if
                        endGame();
                        break;
                    }// end else
                    else 
                    {
                        System.out.println("\nInvalid choice. Please try again");
                    }// end else
            }//end while
            while (true) {
                // Ask if the user wants to play again or see the top record
                System.out.println("\nWhat would you like to do next?");
                System.out.println("1. Play again");
                System.out.println("2. See the top record");
                System.out.println("3. Exit");
                int nextChoice = getInteger();

                if (nextChoice == 1) {
                    break; // Restart the game loop
                } // end if
                else if (nextChoice == 2) {
                    System.out.println("The highest scorer is: " + highestScorer + " with " + highestScore + " wins!");
                } // end else if
                else if (nextChoice == 3) {
                    System.out.println("Thank you for playing Tien Len! See you again!");
                    return; // Exit the game loop
                } // end else if
                else {
                    System.out.println("Invalid choice. Please try again.");
                }// end else
            }// end while for ending question
        }// end while   
    } // ends main
    
    /* Method name: getInteger
     * Description: This method prompts the user to input an integer value and handles invalid input
     *              by repeatedly asking until a valid integer is entered.
     * Parameter: None
     * Returns: int - the valid integer entered by the user.
     */
    private static int getInteger() {
        int choice;

        while (true) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                return choice;
            }// end try
             catch (InputMismatchException mismatch) {
                scanner.nextLine();
                System.out.println("\nTry again!");
                System.out.println("\nEnter your choice: ");
            }// end try
        }// end while      
    }// end getInterger

     /* Method name: printRules
     * Description: This method prints out the rules of the card game to the console and prompts the user
     *              to acknowledge understanding of the rules.
     * Parameter: None
     * Returns: void
     */
    private static void printRules() {
        System.out.println("\n  Here Are The Rules:");
        System.out.println("\nThe card values from lowest to highest are: 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace, 2.");
        System.out.println("\nThe card signs value form lowest to highest are: spades (♠), clubs (♣), diamonds (♦), and hearts (♥)");
        System.out.println("\nThe lowest card is 3 of spades, and the highest card is 2 of hearts.");
        System.out.println("\nThe player with the 3♠ starts the game.");
        System.out.println("\n  Gameplay Instructions:");
        System.out.println("\nPass if you can't beat the combination or don't want to play.");
        System.out.println("\nOnce you pass, you cannot resume playing until someone else has laid down a new combination.");
        System.out.println("\nGot It? (y/n): ");
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                break;
            }// end if
            else if (input.equalsIgnoreCase("n"))
            {
                System.out.println("TOO BAD THEN:)");
                break;
            }// end else if
            else
            {
                System.out.println("Invalid choice. Please try again.");
            }// end else
        }// end while 
       
    }// end printRules
    
     /* Method name: setupGame
     * Description: This method initializes the game by setting up the player names and welcoming the user.
     *              It prompts the user to enter their name and assigns default names to the bot players.
     * Parameter: None
     * Returns: void
     */
    private static void setupGame() {
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        players[0] = new Player(playerName); 
        for (int i = 1; i < players.length; i++) {
            players[i] = new Player("Player " + (i + 1));
        }// end for
        System.out.println("\nHey " + playerName + "!" + " Let’s buckle up for our TIEN LEN game!");
        System.out.println("\nYou are playing against 3 bots.");
        System.out.println("\nLet's start the game!");

        for (int i = 0; i < botDifficulties.length; i++) {
            System.out.println("Choose difficulty for " + players[i + 1].getName() + " (1. Easy, 2. Medium, 3. Hard): ");
            botDifficulties[i] = getDifficultyLevel();
        }//end for
    }// end setupGame

    /* Method name: getDifficultyLevel
    * Description: This method prompts the user to enter a difficulty level (1, 2, or 3). 
    *              It continuously asks for input until a valid level is entered.
    * Parameter: None
    * Returns: int - the chosen difficulty level (1 for Easy, 2 for Medium, or 3 for Hard).
    */
    private static int getDifficultyLevel() {
        while (true) {
            int level = getInteger();
            if (level >= 1 && level <= 3) {
                return level;
            } // end if
            else {
                System.out.println("Invalid choice. Please select 1 (Easy), 2 (Medium), or 3 (Hard).");
            }// end else
        }// end while
    }// end getDifficulty 

     /* Method name: findStartingPlayer
     * Description: This method finds the player who has the 3 of spades ("3♠") and returns the index of that player.
     *              If no player has the 3 of spades, it returns -1.
     * Parameter: None
     * Returns: int - the index of the player with the 3 of spades, or -1 if no player has it.
     */
    private static int findStartingPlayer() {
        for (int i = 0; i < players.length; i++) {
            Player player = players[i];
            if (player != null) {
                Card[] hand = player.getHand();
                if (hand != null) {
                    for (Card card : hand) {
                        if (card != null && card.toString().equals("3♠")) {
                            return i;
                        }//end if
                    }// end for
                }//end if
            }// end if 
        }// end for
        return -1;
    }// end findStartingPlayer

    /* Method name: dealCard
     * Description: This method deals 13 cards to each player from the deck and then indicates that the cards are being shuffled.
     * Parameter: None
     * Returns: void
     */
    private static void dealCards() {
        for (int i = 0; i < 13; i++) {
            for (Player player : players) {
                player.receiveCard(deck.dealCards());
            }// end for
        }// end for
        System.out.println("\nShuffling…");
    }// end dealCards

    /* Method name: playGame
     * Description: This method controls the flow of a card game, alternating turns between players
     *              until one of the players wins by emptying their hand.
     * Parameter: startingPlayer - an integer representing the index of the player who will start the game.
     * Returns: void
     */
    private static String playGame(int startingPlayer) {
        boolean gameEnded = false;
        int currentPlayer = startingPlayer;
        String winner = "";
    
        while (!gameEnded) {
            if (currentPlayer == 0) {
                humanTurn();
            }//end if 
            else {
                botTurn(currentPlayer);
            }// end else
    
            if (players[currentPlayer].isHandEmpty()) {
                System.out.println(players[currentPlayer].getName() + " wins the game!");
                winner = players[currentPlayer].getName();
                gameEnded = true;
            }//end if 
            else {
                currentPlayer = (currentPlayer + 1) % 4;
            }// end else
        }//end while
        return winner;
    }// end playGame

    
     /* Method name: humanTurn
     * Description: This method handles the human player's turn in the card game.
     *              It displays the player's current hand, prompts them to choose a card to play,
     *              and validates their input. If the player chooses to pass, it increments the count
     *              of consecutive passes.
     * Parameter: None
     * Returns: void
     */
    private static void humanTurn() {
        if (passesInARow == 3) {
            System.out.println("\nEveryone passed. You can choose a new combination.");
            lastPlayedCard = null;
        }// end if

        sortHand(players[0].getHand()); // Sort the player's hand before displaying

        // Print card numbers
        System.out.println("\nHere is your card lineup:");
        for (int i = 0; i < 13; i++) {
            System.out.printf("%-4d", i + 1);
        }// end for
        System.out.println();

        // Print cards
        for (Card card : players[0].getHand()) {
            String cardString = (card == null)? " " : card.toString(); // print null as empty / empty card case
            System.out.printf("%-4s", cardString);
        }// end for
        System.out.println();

        while (true) {
            System.out.print("Enter the number of the card you want to play (or 'p' to pass): ");// change to p so the user don't need to take time input
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("p")) {
                System.out.println("You passed.");
                passesInARow++;
                return;
            }// end if

            try {
                int choice = Integer.parseInt(input) - 1;

                if (choice < 0 || choice >= players[0].getHand().length || players[0].getHand()[choice] == null) {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }// end if

                Card playedCard = players[0].getHand()[choice];
                System.out.println("You chose: " + playedCard);

                if (lastPlayedCard == null || compareCards(playedCard, lastPlayedCard) > 0) {
                    lastPlayedCard = playedCard;
                    players[0].playCard(choice);
                    passesInARow = 0;
                    break;
                }// end if
                else {
                    System.out.println("Invalid choice. The card must be higher than the last played card.");
                }// end else
                }// end try
                catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'pass'.");   
                }// end catch
            }// end while :)
    }//end humanTurn
    

    /* Method name: botTurn
     * Description: This method handles the bot player's turn in the card game.
     *              It selects a card to play based on the last played card, and if no valid card is available, it passes.
     * Parameter: playerIndex - an integer representing the index of the bot player.
     * Returns: void
     */
    private static void botTurn(int playerIndex){
        Player player = players[playerIndex];
        Card playedCard = null;
        // when the players and bot passed their turns
        if (passesInARow == 3){
            lastPlayedCard = null ;
            passesInARow = 0;
        }// end if

        int difficulty = botDifficulties[playerIndex - 1];
        switch (difficulty) {
            case 1:// easy
                playedCard = easyBotPlay(player);
                break;
            case 2://medium
                playedCard = mediumBotPlay(player);
                break;
            case 3://hard
                playedCard = hardBotPlay(player);
                break;
        }// end switch


        if (playedCard != null){
            System.out.println(player.getName() + " played: " + playedCard);
            Card[] hand = player.getHand();
            int index = -1;
            for (int i = 0; i < hand.length; i++) {
                if (hand[i].equals(playedCard)) {
                    index = i;
                    break;
                }// end if
            }// end for
            if (index != -1) {
                player.playCard(index);
            }// end if
            lastPlayedCard = playedCard;
            passesInARow = 0;
        }// end if
        else {
            System.out.println(player.getName() + " passed.");
            passesInARow++;
        }// end else
    }// end botTurn

    /* Method name: easyBotPlay
    * Description: This method simulates the play of an easy-level bot. It iterates through the bot's hand
    *              and returns the first playable card that can beat the last played card. If no such card exists,
    *              it returns null.
    * Parameter: player - a Player object representing the bot whose turn it is to play.
    * Returns: Card - the card chosen by the bot to play, or null if no card can be played.
    */
    private static Card easyBotPlay(Player player){
        for (Card card : player.getHand()) {
            if (card != null && (lastPlayedCard == null || compareCards(card, lastPlayedCard) > 0)) {
                return card;
            }// end if
        }// end for
        return null;
    }// end easyBotPlay

    /* Method name: mediumBotPlay
    * Description: This method simulates the play of a medium-level bot. It iterates through the bot's hand
    *              and returns a card that is moderately higher than the last played card. If no such card exists,
    *              it returns the first playable card that can beat the last played card. If no card can be played,
    *              it returns null.
    * Parameter: player - a Player object representing the bot whose turn it is to play.
    * Returns: Card - the card chosen by the bot to play, or null if no card can be played.
    */
    private static Card mediumBotPlay(Player player) {
        for (Card card : player.getHand()) {
            if (card != null && (lastPlayedCard == null || compareCards(card, lastPlayedCard) > 0)) {
                if (compareCards(card, lastPlayedCard) > 3) { // Medium bot tries to play a moderately higher card
                    return card;
                }// end if
            }// end if
        }// end for
        return null;
    }// end mediumBotPlay

    /* Method name: hardBotPlay
    * Description: This method simulates the play of a hard-level bot. It iterates through the bot's hand
    *              and selects the highest card that can beat the last played card. If no such card exists,
    *              it returns null.
    * Parameter: player - a Player object representing the bot whose turn it is to play.
    * Returns: Card - the highest card chosen by the bot to play, or null if no card can be played.
    */
    private static Card hardBotPlay(Player player) {
        Card highestCard = null;
        for (Card card : player.getHand()) {
            if (card != null && (lastPlayedCard == null || compareCards(card, lastPlayedCard) > 0)) {
                if (highestCard == null || compareCards(card, highestCard) > 0) {
                    highestCard = card;
                }// end if
            }// end if
        }// end for
        return highestCard;
    }// end hardBotPlay



    /* Method name: compareCards
     * Description: This method compares two cards based on their value and suit.
     *              It returns a positive number if card1 is greater than card2, a negative number if card1 is less than card2, and 0 if they are equal.
     * Parameter: card1 - the first card to compare.
     *            card2 - the second card to compare.
     * Returns: int - the comparison result.
     */
    private static int compareCards(Card card1, Card card2) {
        // Handle null cards
        if (card1 == null && card2 == null) {
            return 0; // Both are null, so they are equal
        }// end if
        if (card1 == null) {
            return -1; // Null card is considered less than a non-null card
        }// end if
        if (card2 == null) {
            return 1; // Non-null card is considered greater than a null card
        }// end if

        //Array to store the cards
        String[] VALUES = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] SUITS = {"♠", "♣", "♦", "♥"};
    
        //set the initial variable
        int value1 = -1;
        int value2 = -1;
        int suit1 = -1;
        int suit2 = -1;
    
        for (int i = 0; i < VALUES.length; i++) {
            if (VALUES[i].equals(card1.getValue())) {
                value1 = i;
            }// end if
            if (VALUES[i].equals(card2.getValue())) { 
                value2 = i;
            }// end if
        }// end for 
    
        for (int i = 0; i < SUITS.length; i++) {
            if (SUITS[i].equals(card1.getSuit())) {
                suit1 = i;
            }// end if
            if (SUITS[i].equals(card2.getSuit())) {
                suit2 = i;
            }// end if
        }// end for
    
        if (value1 != value2) {
            return Integer.compare(value1, value2);
        }// end if 
        else {
            return Integer.compare(suit1, suit2);
        }// end else
    }// end compareCards

    /* Method name: sortHand
     * Description: This method sorts an array of cards in ascending order based on their value and suit.
     * Parameter: hand - the array of cards to be sorted.
     * Returns: void
     */
    private static void sortHand(Card[] hand){
        for (int i = 0; i < hand.length - 1; i++) {
            for (int j = 0; j < hand.length - 1 - i; j++) {
                if (hand[j] == null || (hand[j + 1] != null && compareCards(hand[j], hand[j + 1]) > 0)) {
                    Card temp = hand[j];
                    hand[j] = hand[j + 1];
                    hand[j + 1] = temp;
                }// end if
            }// end for
        }// end for
    }// end sortHand

    /* Method name: endGame
	 * Description: This method prints a message indicating that the game is over and thanks the players for playing.
	 * Parameter: none
	 * Returns: void
	 */
    private static void endGame() {
        System.out.println("Game over! Thank you for playing.");
    }// end endGame
  
}// end class
