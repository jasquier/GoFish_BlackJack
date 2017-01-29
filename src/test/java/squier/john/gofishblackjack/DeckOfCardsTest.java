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
        DeckOfCards expected = new DeckOfCards();

        deckOfCards.shuffle();

        Assert.assertFalse(expected.equals(deckOfCards));
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
}
