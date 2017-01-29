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
        handOfCards.add(new Card(CardRank.FIVE, CardSuit.HEART));
    }

    @Test
    public void transferAllCardsOfRankFiveTest()
    {
        String expectedRemainingHand = "2 OF CLUBS\n"
                                     + "3 OF DIAMONDS\n";
        String expectedTransferredCards = "5 OF SPADES\n"
                                        + "5 OF HEARTS\n";
        String[] expected = { expectedRemainingHand, expectedTransferredCards };

        String actualTransferredCards = handOfCards.transferAllCardsOfRank(CardRank.FIVE).toString();
        String actualRemainingHand = handOfCards.toString();
        String[] actual = { actualRemainingHand, actualTransferredCards };

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeCardTest()
    {
        // exercise
        handOfCards.removeCard(new Card(CardRank.THREE, CardSuit.DIAMOND));

        String expected = "2 OF CLUBS\n"
                        + "5 OF SPADES\n"
                        + "5 OF HEARTS\n";
        String actual = handOfCards.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllCardsOfRankFiveTest()
    {
        String expected = "2 OF CLUBS\n"
                        + "3 OF DIAMONDS\n";

        handOfCards.removeAllCardsOfRank(CardRank.FIVE);

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
    public void containsFourOfAKindTrueTest()
    {
        HandOfCards temp = new HandOfCards();

        temp.add(new Card(CardRank.ACE, CardSuit.CLUB));
        temp.add(new Card(CardRank.ACE, CardSuit.DIAMOND));
        temp.add(new Card(CardRank.ACE, CardSuit.HEART));
        temp.add(new Card(CardRank.ACE, CardSuit.SPADE));

        Assert.assertTrue(temp.containsFourCardsOfOneRank(CardRank.ACE));
    }

    @Test
    public void toStringTest()
    {
        String expected = "2 OF CLUBS\n"
                        + "3 OF DIAMONDS\n"
                        + "5 OF SPADES\n"
                        + "5 OF HEARTS\n";
        String actual = handOfCards.toString();
        Assert.assertEquals(expected, actual);
    }
}
