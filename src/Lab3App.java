// The import statement allows program to use the cardgames.jar file
import cardgames.*;

/**
 * <p>Title: </p>
 * 
 * <p>Description: </p>
 * 
 * @author your names here
 */

public class Lab3App {

	public static void main(String[] args)
	{
		Display theCards = new Deck();
		Card theDeck = new Deck();
		Card card1;
		theDeck.shuffleDeck();
		card1 = theWindow.dealCard();
		theWindow.showCard(card1);
		System.out.println(card1.toString());	
	}
}
