package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * This class tests the DeckOfCards class in this package.
 */
public class DeckOfCardsTest
{
    DeckOfCards deckOfCards;

    @Before
    public void setup()
    {
        deckOfCards = new DeckOfCards();
    }

    @Test
    public void shuffleDeckTest()
    {
        String expected = "TWO OF CLUBS\n"
                + "THREE OF CLUBS\n"
                + "FOUR OF CLUBS\n"
                + "FIVE OF CLUBS\n"
                + "SIX OF CLUBS\n"
                + "SEVEN OF CLUBS\n"
                + "EIGHT OF CLUBS\n"
                + "NINE OF CLUBS\n"
                + "TEN OF CLUBS\n"
                + "JACK OF CLUBS\n"
                + "QUEEN OF CLUBS\n"
                + "KING OF CLUBS\n"
                + "ACE OF CLUBS\n"
                + "TWO OF DIAMONDS\n"
                + "THREE OF DIAMONDS\n"
                + "FOUR OF DIAMONDS\n"
                + "FIVE OF DIAMONDS\n"
                + "SIX OF DIAMONDS\n"
                + "SEVEN OF DIAMONDS\n"
                + "EIGHT OF DIAMONDS\n"
                + "NINE OF DIAMONDS\n"
                + "TEN OF DIAMONDS\n"
                + "JACK OF DIAMONDS\n"
                + "QUEEN OF DIAMONDS\n"
                + "KING OF DIAMONDS\n"
                + "ACE OF DIAMONDS\n"
                + "TWO OF HEARTS\n"
                + "THREE OF HEARTS\n"
                + "FOUR OF HEARTS\n"
                + "FIVE OF HEARTS\n"
                + "SIX OF HEARTS\n"
                + "SEVEN OF HEARTS\n"
                + "EIGHT OF HEARTS\n"
                + "NINE OF HEARTS\n"
                + "TEN OF HEARTS\n"
                + "JACK OF HEARTS\n"
                + "QUEEN OF HEARTS\n"
                + "KING OF HEARTS\n"
                + "ACE OF HEARTS\n"
                + "TWO OF SPADES\n"
                + "THREE OF SPADES\n"
                + "FOUR OF SPADES\n"
                + "FIVE OF SPADES\n"
                + "SIX OF SPADES\n"
                + "SEVEN OF SPADES\n"
                + "EIGHT OF SPADES\n"
                + "NINE OF SPADES\n"
                + "TEN OF SPADES\n"
                + "JACK OF SPADES\n"
                + "QUEEN OF SPADES\n"
                + "KING OF SPADES\n"
                + "ACE OF SPADES\n";

        deckOfCards.shuffleDeck();
        String actual = deckOfCards.toString();
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void dealFirstFiveCardsFromUnshuffledDeckTest()
    {
        deckOfCards.dealCards(5);

        String expected = "SEVEN OF CLUBS\n"
                + "EIGHT OF CLUBS\n"
                + "NINE OF CLUBS\n"
                + "TEN OF CLUBS\n"
                + "JACK OF CLUBS\n"
                + "QUEEN OF CLUBS\n"
                + "KING OF CLUBS\n"
                + "ACE OF CLUBS\n"
                + "TWO OF DIAMONDS\n"
                + "THREE OF DIAMONDS\n"
                + "FOUR OF DIAMONDS\n"
                + "FIVE OF DIAMONDS\n"
                + "SIX OF DIAMONDS\n"
                + "SEVEN OF DIAMONDS\n"
                + "EIGHT OF DIAMONDS\n"
                + "NINE OF DIAMONDS\n"
                + "TEN OF DIAMONDS\n"
                + "JACK OF DIAMONDS\n"
                + "QUEEN OF DIAMONDS\n"
                + "KING OF DIAMONDS\n"
                + "ACE OF DIAMONDS\n"
                + "TWO OF HEARTS\n"
                + "THREE OF HEARTS\n"
                + "FOUR OF HEARTS\n"
                + "FIVE OF HEARTS\n"
                + "SIX OF HEARTS\n"
                + "SEVEN OF HEARTS\n"
                + "EIGHT OF HEARTS\n"
                + "NINE OF HEARTS\n"
                + "TEN OF HEARTS\n"
                + "JACK OF HEARTS\n"
                + "QUEEN OF HEARTS\n"
                + "KING OF HEARTS\n"
                + "ACE OF HEARTS\n"
                + "TWO OF SPADES\n"
                + "THREE OF SPADES\n"
                + "FOUR OF SPADES\n"
                + "FIVE OF SPADES\n"
                + "SIX OF SPADES\n"
                + "SEVEN OF SPADES\n"
                + "EIGHT OF SPADES\n"
                + "NINE OF SPADES\n"
                + "TEN OF SPADES\n"
                + "JACK OF SPADES\n"
                + "QUEEN OF SPADES\n"
                + "KING OF SPADES\n"
                + "ACE OF SPADES\n";
        String actual = deckOfCards.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCardTest()
    {
        deckOfCards.removeCard(new Card(CardRank.TWO, CardSuit.CLUB));

        String expected = "THREE OF CLUBS\n"
                + "FOUR OF CLUBS\n"
                + "FIVE OF CLUBS\n"
                + "SIX OF CLUBS\n"
                + "SEVEN OF CLUBS\n"
                + "EIGHT OF CLUBS\n"
                + "NINE OF CLUBS\n"
                + "TEN OF CLUBS\n"
                + "JACK OF CLUBS\n"
                + "QUEEN OF CLUBS\n"
                + "KING OF CLUBS\n"
                + "ACE OF CLUBS\n"
                + "TWO OF DIAMONDS\n"
                + "THREE OF DIAMONDS\n"
                + "FOUR OF DIAMONDS\n"
                + "FIVE OF DIAMONDS\n"
                + "SIX OF DIAMONDS\n"
                + "SEVEN OF DIAMONDS\n"
                + "EIGHT OF DIAMONDS\n"
                + "NINE OF DIAMONDS\n"
                + "TEN OF DIAMONDS\n"
                + "JACK OF DIAMONDS\n"
                + "QUEEN OF DIAMONDS\n"
                + "KING OF DIAMONDS\n"
                + "ACE OF DIAMONDS\n"
                + "TWO OF HEARTS\n"
                + "THREE OF HEARTS\n"
                + "FOUR OF HEARTS\n"
                + "FIVE OF HEARTS\n"
                + "SIX OF HEARTS\n"
                + "SEVEN OF HEARTS\n"
                + "EIGHT OF HEARTS\n"
                + "NINE OF HEARTS\n"
                + "TEN OF HEARTS\n"
                + "JACK OF HEARTS\n"
                + "QUEEN OF HEARTS\n"
                + "KING OF HEARTS\n"
                + "ACE OF HEARTS\n"
                + "TWO OF SPADES\n"
                + "THREE OF SPADES\n"
                + "FOUR OF SPADES\n"
                + "FIVE OF SPADES\n"
                + "SIX OF SPADES\n"
                + "SEVEN OF SPADES\n"
                + "EIGHT OF SPADES\n"
                + "NINE OF SPADES\n"
                + "TEN OF SPADES\n"
                + "JACK OF SPADES\n"
                + "QUEEN OF SPADES\n"
                + "KING OF SPADES\n"
                + "ACE OF SPADES\n";

        String actual = deckOfCards.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deckToStringTest()
    {
        // this test also proves that the constructor fills the deck
        //  with FIVETWO cards
        // can this test be rewritten now that we can compare cards for equality?
        String expected = "TWO OF CLUBS\n"
                + "THREE OF CLUBS\n"
                + "FOUR OF CLUBS\n"
                + "FIVE OF CLUBS\n"
                + "SIX OF CLUBS\n"
                + "SEVEN OF CLUBS\n"
                + "EIGHT OF CLUBS\n"
                + "NINE OF CLUBS\n"
                + "TEN OF CLUBS\n"
                + "JACK OF CLUBS\n"
                + "QUEEN OF CLUBS\n"
                + "KING OF CLUBS\n"
                + "ACE OF CLUBS\n"
                + "TWO OF DIAMONDS\n"
                + "THREE OF DIAMONDS\n"
                + "FOUR OF DIAMONDS\n"
                + "FIVE OF DIAMONDS\n"
                + "SIX OF DIAMONDS\n"
                + "SEVEN OF DIAMONDS\n"
                + "EIGHT OF DIAMONDS\n"
                + "NINE OF DIAMONDS\n"
                + "TEN OF DIAMONDS\n"
                + "JACK OF DIAMONDS\n"
                + "QUEEN OF DIAMONDS\n"
                + "KING OF DIAMONDS\n"
                + "ACE OF DIAMONDS\n"
                + "TWO OF HEARTS\n"
                + "THREE OF HEARTS\n"
                + "FOUR OF HEARTS\n"
                + "FIVE OF HEARTS\n"
                + "SIX OF HEARTS\n"
                + "SEVEN OF HEARTS\n"
                + "EIGHT OF HEARTS\n"
                + "NINE OF HEARTS\n"
                + "TEN OF HEARTS\n"
                + "JACK OF HEARTS\n"
                + "QUEEN OF HEARTS\n"
                + "KING OF HEARTS\n"
                + "ACE OF HEARTS\n"
                + "TWO OF SPADES\n"
                + "THREE OF SPADES\n"
                + "FOUR OF SPADES\n"
                + "FIVE OF SPADES\n"
                + "SIX OF SPADES\n"
                + "SEVEN OF SPADES\n"
                + "EIGHT OF SPADES\n"
                + "NINE OF SPADES\n"
                + "TEN OF SPADES\n"
                + "JACK OF SPADES\n"
                + "QUEEN OF SPADES\n"
                + "KING OF SPADES\n"
                + "ACE OF SPADES\n";
        String actual = deckOfCards.toString();
        Assert.assertEquals(expected, actual);
    }
}
