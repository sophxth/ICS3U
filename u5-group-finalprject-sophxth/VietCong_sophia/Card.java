/* Name: Sophia Thai
 * Course: ICS3U
 * Teacher: Mrs. McCaffery
 * Date: June 12, 2024
 * Description: Card class for VietCong Game (Control the card to the player)
 */
package VietCong_sophia;
import java.util.*;
public class Card {
    /* Method name: value
     * Description: This field stores the value of the card (e.g., "3", "4", "Jack").
     * Parameter: None
     * Returns: String - the value of the card.
     */
    private String value;

    /* Method name: suit
     * Description: This field stores the suit of the card (e.g., "♠", "♣", "♦", "♥").
     * Parameter: None
     * Returns: String - the suit of the card.
     */
    private String suit;

    /* Method name: Card
     * Description: Constructor for the Card class that initializes the card with a value and suit.
     * Parameter: value - a String representing the value of the card (e.g., "3", "4", "Jack").
     *            suit - a String representing the suit of the card (e.g., "♠", "♣", "♦", "♥").
     * Returns: None
     */
    public Card(String value, String suit){
        this.value = value;
        this.suit = suit;
    }// end Card


    /* Method name: getValue
     * Description: This method returns the value of the card.
     * Parameter: None
     * Returns: String - the value of the card.
     */
    public String getValue(){
        return value;
    }// end getValue 

     /* Method name: getSuit
     * Description: This method returns the suit of the card.
     * Parameter: None
     * Returns: String - the suit of the card.
     */
    public String getSuit() {
        return suit;
    }// end getSuit

    /* Method name: toString
     * Description: This method returns a string representation of the card, combining its value and suit.
     * Parameter: None
     * Returns: String - the string representation of the card.
     */
    @Override
    public String toString() {
        return value + suit;
    }// end toString

}// end class
