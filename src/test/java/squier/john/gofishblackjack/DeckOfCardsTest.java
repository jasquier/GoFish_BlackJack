package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
        DeckOfCards expected = new DeckOfCards();

        deckOfCards.shuffleDeck();

        Assert.assertFalse(expected.equals(deckOfCards));
    }

    @Test
    public void testDecksEqualTrueTest()
    {
        boolean expected = deckOfCards.equals(new DeckOfCards());

        Assert.assertTrue(expected);
    }

    @Test
    public void testDecksEqualFalseTest()
    {
        DeckOfCards temp = new DeckOfCards();
        temp.removeCard(new Card(CardRank.TWO, CardSuit.CLUB));

        boolean expected = deckOfCards.equals(temp);

        Assert.assertFalse(expected);
    }

    @Test
    public void dealFirstFiveCardsFromUnshuffledDeckAndCheckDeckTest()
    {
        DeckOfCards expected = new DeckOfCards();
        expected.removeCard(new Card(CardRank.TWO, CardSuit.CLUB));
        expected.removeCard(new Card(CardRank.THREE, CardSuit.CLUB));
        expected.removeCard(new Card(CardRank.FOUR, CardSuit.CLUB));
        expected.removeCard(new Card(CardRank.FIVE, CardSuit.CLUB));
        expected.removeCard(new Card(CardRank.SIX, CardSuit.CLUB));

        deckOfCards.dealCards(5);

        Assert.assertTrue(expected.equals(deckOfCards));
    }

    @Test
    public void dealFirstFiveCardsFromUshuffledDeckAndCheckDealtCardsTest()
    {

    }

    @Test
    public void removeCardTest()
    {
        DeckOfCards expected = new DeckOfCards();
        expected.remove(0);

        deckOfCards.removeCard(new Card(CardRank.TWO, CardSuit.CLUB));

        Assert.assertTrue(expected.equals(deckOfCards));
    }

    @Test
    public void removeCardWhenCardNotInDeckTest()
    {
        deckOfCards.remove(0);

        Assert.assertFalse(deckOfCards.removeCard(new Card(CardRank.TWO, CardSuit.CLUB)));
    }

    @Test
    public void deckToStringTest()
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

        String actual = deckOfCards.toString();

        Assert.assertEquals(expected, actual);
    }
}
