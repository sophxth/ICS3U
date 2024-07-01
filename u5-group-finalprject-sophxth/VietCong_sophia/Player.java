/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: June 12, 2024
 * Description: Player class for the Game (this class controls the game to sort out the players hand)
 */
package VietCong_sophia;

public class Player {
    
    /* Method name: N/A
     * Description: Holds the name of the player.
     * Parameter: None.
     * Returns: No return value (field).
     */
    private String name;
    /* Method name: N/A
     * Description: Holds the cards in the player's hand.
     * Parameter: None.
     * Returns: No return value (field).
     */
    private Card[] hand = new Card[13];
    /* Method name: N/A
     * Description: Keeps track of the number of cards currently in the player's hand.
     * Parameter: None.
     * Returns: No return value (field).
     */
    private int cardCount = 0;

   /* Method name: Player
     * Description: This constructor initializes a new Player object with the specified name.
     * Parameter: String name - the name of the player.
     * Returns: No return value (constructor).
     */
    public Player(String name) {
        this.name = name;
    }// end Player

     /* Method name: getName
     * Description: This method returns the name of the player.
     * Parameter: None
     * Returns: String - the name of the player.
     */
    public String getName() {
        return name;
    }// end getName

     /* Method name: receiveCard
     * Description: This method adds a card to the player's hand if there is space available.
     * Parameter: card - the Card object to be added to the player's hand.
     * Returns: void
    */
    public void receiveCard(Card card) {
        if (cardCount < hand.length) {
            hand[cardCount++] = card;
        }// end if
    }// end receiveCard

     /* Method name: getHand
     * Description: This method returns the player's hand, which is an array of Card objects.
     * Parameter: None
     * Returns: Card[] - an array containing the cards in the player's hand.
     */
    public Card [] getHand(){
        return hand;
    }// end getHand


     /* Method name: playCard
     * Description: This method removes a card from the player's hand at the specified index
     *              and shifts the remaining cards to fill the gap. The total card count is decremented.
     * Parameter: index - an integer representing the position of the card to be played.
     * Returns: void
     */
    public void playCard(int index) {
        if (index >= 0 && index < cardCount) 
        hand[index] = null;
        for (int i = index; i < cardCount - 1; i++) {
            hand[i] = hand[i + 1];
        }// end for
        hand[--cardCount] = null;
    }// end playCard

    /* Method name: isHandEmpty
     * Description: This method checks if the player's hand is empty by comparing the card count to zero.
     * Parameter: None
     * Returns: boolean - true if the player's hand is empty, false otherwise.
     */
    public boolean isHandEmpty() {
        return cardCount == 0;
    }// end isHandEmpty

}// end class
