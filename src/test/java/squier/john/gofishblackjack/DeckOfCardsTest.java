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
    public void deckToStringTest()
    {
        // this test also proves that the constructor fills the deck
        //  with 52 cards
        // can this test be rewritten now that we can compare cards for equality?
        String expected = "2 OF CLUBS\n"
                        + "3 OF CLUBS\n"
                        + "4 OF CLUBS\n"
                        + "5 OF CLUBS\n"
                        + "6 OF CLUBS\n"
                        + "7 OF CLUBS\n"
                        + "8 OF CLUBS\n"
                        + "9 OF CLUBS\n"
                        + "10 OF CLUBS\n"
                        + "JACK OF CLUBS\n"
                        + "QUEEN OF CLUBS\n"
                        + "KING OF CLUBS\n"
                        + "ACE OF CLUBS\n"
                        + "2 OF DIAMONDS\n"
                        + "3 OF DIAMONDS\n"
                        + "4 OF DIAMONDS\n"
                        + "5 OF DIAMONDS\n"
                        + "6 OF DIAMONDS\n"
                        + "7 OF DIAMONDS\n"
                        + "8 OF DIAMONDS\n"
                        + "9 OF DIAMONDS\n"
                        + "10 OF DIAMONDS\n"
                        + "JACK OF DIAMONDS\n"
                        + "QUEEN OF DIAMONDS\n"
                        + "KING OF DIAMONDS\n"
                        + "ACE OF DIAMONDS\n"
                        + "2 OF HEARTS\n"
                        + "3 OF HEARTS\n"
                        + "4 OF HEARTS\n"
                        + "5 OF HEARTS\n"
                        + "6 OF HEARTS\n"
                        + "7 OF HEARTS\n"
                        + "8 OF HEARTS\n"
                        + "9 OF HEARTS\n"
                        + "10 OF HEARTS\n"
                        + "JACK OF HEARTS\n"
                        + "QUEEN OF HEARTS\n"
                        + "KING OF HEARTS\n"
                        + "ACE OF HEARTS\n"
                        + "2 OF SPADES\n"
                        + "3 OF SPADES\n"
                        + "4 OF SPADES\n"
                        + "5 OF SPADES\n"
                        + "6 OF SPADES\n"
                        + "7 OF SPADES\n"
                        + "8 OF SPADES\n"
                        + "9 OF SPADES\n"
                        + "10 OF SPADES\n"
                        + "JACK OF SPADES\n"
                        + "QUEEN OF SPADES\n"
                        + "KING OF SPADES\n"
                        + "ACE OF SPADES\n";
        String actual = deckOfCards.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shuffleDeckTest()
    {
        String expected = "2 OF CLUBS\n"
                + "3 OF CLUBS\n"
                + "4 OF CLUBS\n"
                + "5 OF CLUBS\n"
                + "6 OF CLUBS\n"
                + "7 OF CLUBS\n"
                + "8 OF CLUBS\n"
                + "9 OF CLUBS\n"
                + "10 OF CLUBS\n"
                + "JACK OF CLUBS\n"
                + "QUEEN OF CLUBS\n"
                + "KING OF CLUBS\n"
                + "ACE OF CLUBS\n"
                + "2 OF DIAMONDS\n"
                + "3 OF DIAMONDS\n"
                + "4 OF DIAMONDS\n"
                + "5 OF DIAMONDS\n"
                + "6 OF DIAMONDS\n"
                + "7 OF DIAMONDS\n"
                + "8 OF DIAMONDS\n"
                + "9 OF DIAMONDS\n"
                + "10 OF DIAMONDS\n"
                + "JACK OF DIAMONDS\n"
                + "QUEEN OF DIAMONDS\n"
                + "KING OF DIAMONDS\n"
                + "ACE OF DIAMONDS\n"
                + "2 OF HEARTS\n"
                + "3 OF HEARTS\n"
                + "4 OF HEARTS\n"
                + "5 OF HEARTS\n"
                + "6 OF HEARTS\n"
                + "7 OF HEARTS\n"
                + "8 OF HEARTS\n"
                + "9 OF HEARTS\n"
                + "10 OF HEARTS\n"
                + "JACK OF HEARTS\n"
                + "QUEEN OF HEARTS\n"
                + "KING OF HEARTS\n"
                + "ACE OF HEARTS\n"
                + "2 OF SPADES\n"
                + "3 OF SPADES\n"
                + "4 OF SPADES\n"
                + "5 OF SPADES\n"
                + "6 OF SPADES\n"
                + "7 OF SPADES\n"
                + "8 OF SPADES\n"
                + "9 OF SPADES\n"
                + "10 OF SPADES\n"
                + "JACK OF SPADES\n"
                + "QUEEN OF SPADES\n"
                + "KING OF SPADES\n"
                + "ACE OF SPADES\n";

        deckOfCards.shuffleDeck();
        String actual = deckOfCards.toString();
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void removeCardFromDeckTest()
    {
        deckOfCards.removeCardFromDeck(new Card(CardRank.TWO, CardSuit.CLUB));

        String expected = "3 OF CLUBS\n"
                + "4 OF CLUBS\n"
                + "5 OF CLUBS\n"
                + "6 OF CLUBS\n"
                + "7 OF CLUBS\n"
                + "8 OF CLUBS\n"
                + "9 OF CLUBS\n"
                + "10 OF CLUBS\n"
                + "JACK OF CLUBS\n"
                + "QUEEN OF CLUBS\n"
                + "KING OF CLUBS\n"
                + "ACE OF CLUBS\n"
                + "2 OF DIAMONDS\n"
                + "3 OF DIAMONDS\n"
                + "4 OF DIAMONDS\n"
                + "5 OF DIAMONDS\n"
                + "6 OF DIAMONDS\n"
                + "7 OF DIAMONDS\n"
                + "8 OF DIAMONDS\n"
                + "9 OF DIAMONDS\n"
                + "10 OF DIAMONDS\n"
                + "JACK OF DIAMONDS\n"
                + "QUEEN OF DIAMONDS\n"
                + "KING OF DIAMONDS\n"
                + "ACE OF DIAMONDS\n"
                + "2 OF HEARTS\n"
                + "3 OF HEARTS\n"
                + "4 OF HEARTS\n"
                + "5 OF HEARTS\n"
                + "6 OF HEARTS\n"
                + "7 OF HEARTS\n"
                + "8 OF HEARTS\n"
                + "9 OF HEARTS\n"
                + "10 OF HEARTS\n"
                + "JACK OF HEARTS\n"
                + "QUEEN OF HEARTS\n"
                + "KING OF HEARTS\n"
                + "ACE OF HEARTS\n"
                + "2 OF SPADES\n"
                + "3 OF SPADES\n"
                + "4 OF SPADES\n"
                + "5 OF SPADES\n"
                + "6 OF SPADES\n"
                + "7 OF SPADES\n"
                + "8 OF SPADES\n"
                + "9 OF SPADES\n"
                + "10 OF SPADES\n"
                + "JACK OF SPADES\n"
                + "QUEEN OF SPADES\n"
                + "KING OF SPADES\n"
                + "ACE OF SPADES\n";

        String actual = deckOfCards.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealFirstFiveCardsFromUnshuffledDeckTest()
    {
        deckOfCards.dealCards(5);

        String expected = "7 OF CLUBS\n"
                + "8 OF CLUBS\n"
                + "9 OF CLUBS\n"
                + "10 OF CLUBS\n"
                + "JACK OF CLUBS\n"
                + "QUEEN OF CLUBS\n"
                + "KING OF CLUBS\n"
                + "ACE OF CLUBS\n"
                + "2 OF DIAMONDS\n"
                + "3 OF DIAMONDS\n"
                + "4 OF DIAMONDS\n"
                + "5 OF DIAMONDS\n"
                + "6 OF DIAMONDS\n"
                + "7 OF DIAMONDS\n"
                + "8 OF DIAMONDS\n"
                + "9 OF DIAMONDS\n"
                + "10 OF DIAMONDS\n"
                + "JACK OF DIAMONDS\n"
                + "QUEEN OF DIAMONDS\n"
                + "KING OF DIAMONDS\n"
                + "ACE OF DIAMONDS\n"
                + "2 OF HEARTS\n"
                + "3 OF HEARTS\n"
                + "4 OF HEARTS\n"
                + "5 OF HEARTS\n"
                + "6 OF HEARTS\n"
                + "7 OF HEARTS\n"
                + "8 OF HEARTS\n"
                + "9 OF HEARTS\n"
                + "10 OF HEARTS\n"
                + "JACK OF HEARTS\n"
                + "QUEEN OF HEARTS\n"
                + "KING OF HEARTS\n"
                + "ACE OF HEARTS\n"
                + "2 OF SPADES\n"
                + "3 OF SPADES\n"
                + "4 OF SPADES\n"
                + "5 OF SPADES\n"
                + "6 OF SPADES\n"
                + "7 OF SPADES\n"
                + "8 OF SPADES\n"
                + "9 OF SPADES\n"
                + "10 OF SPADES\n"
                + "JACK OF SPADES\n"
                + "QUEEN OF SPADES\n"
                + "KING OF SPADES\n"
                + "ACE OF SPADES\n";
        String actual = deckOfCards.toString();
        Assert.assertEquals(expected, actual);
    }
}
