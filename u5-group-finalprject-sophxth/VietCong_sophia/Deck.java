/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: June 12, 2024
 * Description: Deck class for the game (this class control the cards that handing out to the players)
 */

package VietCong_sophia;
import java.util.*;
public class Deck {
    /* Method name: SUITS
     * Description: This field is a static final array that contains the four suits of the cards.
     * Parameter: None
     * Returns: None
     */
    private static final String[] SUITS = {"♠", "♣", "♦", "♥"};

    /* Method name: VALUES
     * Description: This field is a static final array that contains the values of the cards in ascending order.
     * Parameter: None
     * Returns: None
     */
    private static final String[] VALUES = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

    /* Method name: cards
     * Description: This field is an array that holds the 52 cards of the deck.
     * Parameter: None
     * Returns: None
     */
    private Card[] cards = new Card[52]; 

    /* Field name: currentCard
     * Description: This field is an integer that tracks the index of the next card to be dealt from the deck.
     * Parameter: None
     * Returns: None
     */
    private int currentCard;

    /* Method name: Deck
     * Description: Constructor for the Deck class that initializes a deck of cards by creating
     *              a Card object for each combination of values and suits, shuffles the deck, 
     *              and sets the current card index to zero.
     * Parameter: None
     * Returns: None
     */
    public Deck() {
        int index = 0;
        for (String suit : SUITS) {
            for (String value : VALUES) {
                cards[index++] = new Card(value, suit);
            }// end for
        }// end for
        shuffle();
        currentCard = 0;
    }// end Deck

    /* Method name: shuffle
     * Description: This method shuffles the deck of cards using the Fisher-Yates shuffle algorithm.
     * Parameter: None
     * Returns: void
     */
    private void shuffle() {
       Random rand = new Random();
       for (int i = cards.length -1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
       }// end for
    }// end shuffle


    /* Method name: dealCards
     * Description: This method deals a single card from the deck. If there are cards remaining
     *              in the deck, it returns the next card and increments the current card index.
     *              If all cards have been dealt, it returns null.
     * Parameter: None
     * Returns: Card - the next card from the deck, or null if all cards have been dealt.
     */
    public Card dealCards() {
            if (currentCard < cards.length) {
                return cards[currentCard++];
            }// end if
            else {
                return null;
            }// end else
    }// end dealCards
}// end class
