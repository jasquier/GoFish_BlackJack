package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/29/17.
 */
public class HandOfCardsTest
{
    HandOfCards handOfCards;

    @Before
    public void setup()
    {
        handOfCards = new HandOfCards();

        // add a few cards
        handOfCards.add(new Card(CardRank.TWO, CardSuit.CLUB));
        handOfCards.add(new Card(CardRank.THREE, CardSuit.DIAMOND));
        handOfCards.add(new Card(CardRank.FIVE, CardSuit.SPADE));
    }

    @Test
    public void removeCardTest()
    {
        // exercise
        handOfCards.removeCard(new Card(CardRank.THREE, CardSuit.DIAMOND));

        String expected = "2 OF CLUBS\n"
                        + "5 OF SPADES\n";
        String actual = handOfCards.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsCardTrueTest()
    {
        // exercise
        boolean actual = handOfCards.containsCard(new Card(CardRank.TWO,
                                                            CardSuit.CLUB));
        Assert.assertTrue(actual);
    }

    @Test
    public void containsCardFalseTest()
    {
        // exercise
        boolean actual = handOfCards.containsCard(new Card(CardRank.ACE,
                                                            CardSuit.SPADE));
        Assert.assertFalse(actual);
    }

    @Test
    public void toStringTest()
    {
        String expected = "2 OF CLUBS\n"
                        + "3 OF DIAMONDS\n"
                        + "5 OF SPADES\n";
        String actual = handOfCards.toString();
        Assert.assertEquals(expected, actual);
    }
}
