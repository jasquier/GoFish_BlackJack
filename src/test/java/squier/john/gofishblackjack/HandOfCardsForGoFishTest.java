package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * This class tests the HandOfCardsForGoFish class.
 */
public class HandOfCardsForGoFishTest
{
    HandOfCardsForGoFish handOfCardsForGoFish;

    @Before
    public void setup()
    {
        handOfCardsForGoFish = new HandOfCardsForGoFish();
        handOfCardsForGoFish.add(new Card(CardRank.TWO, CardSuit.CLUB));
        handOfCardsForGoFish.add(new Card(CardRank.ACE, CardSuit.DIAMOND));
        handOfCardsForGoFish.add(new Card(CardRank.FIVE, CardSuit.SPADE));
        handOfCardsForGoFish.add(new Card(CardRank.FIVE, CardSuit.HEART));
        handOfCardsForGoFish.add(new Card(CardRank.QUEEN, CardSuit.DIAMOND));
    }

    @Test
    public void removeAllCardsOfRankFiveTest()
    {
        HandOfCardsForGoFish expected = new HandOfCardsForGoFish();
        expected.add(new Card(CardRank.TWO, CardSuit.CLUB));
        expected.add(new Card(CardRank.ACE, CardSuit.DIAMOND));
        expected.add(new Card(CardRank.QUEEN, CardSuit.DIAMOND));

        handOfCardsForGoFish.removeAllCardsOfRank(CardRank.FIVE);

        Assert.assertTrue(expected.equals(handOfCardsForGoFish));
    }

    @Test
    public void transferAllCardsOfRankFiveTest()
    {
        HandOfCardsForGoFish expectedReturn = new HandOfCardsForGoFish();
        expectedReturn.add(new Card(CardRank.FIVE, CardSuit.SPADE));
        expectedReturn.add(new Card(CardRank.FIVE, CardSuit.HEART));

        HandOfCardsForGoFish expectedLeftOver = new HandOfCardsForGoFish();
        expectedLeftOver.add(new Card(CardRank.TWO, CardSuit.CLUB));
        expectedLeftOver.add(new Card(CardRank.ACE, CardSuit.DIAMOND));
        expectedLeftOver.add(new Card(CardRank.QUEEN, CardSuit.DIAMOND));

        HandOfCardsForGoFish[] expected = new HandOfCardsForGoFish[2];
        expected[0] = expectedReturn;
        expected[1] = expectedLeftOver;

        HandOfCardsForGoFish actualReturn =
                handOfCardsForGoFish.transferAllCardsOfRank(CardRank.FIVE);
        HandOfCardsForGoFish actualLeftOver = handOfCardsForGoFish;

        HandOfCardsForGoFish[] actual = new HandOfCardsForGoFish[2];
        actual[0] = actualReturn;
        actual[1] = actualLeftOver;

        Assert.assertTrue(expected[0].equals(actual[0])
                                    && expected[1].equals(actual[1]) );
    }

    @Test
    public void containsFourCardsOfTheSameRankTrueTest()
    {
        handOfCardsForGoFish.add(new Card(CardRank.FIVE,
                                        CardSuit.CLUB));
        handOfCardsForGoFish.add(new Card(CardRank.FIVE,
                                        CardSuit.DIAMOND));

        Assert.assertTrue(handOfCardsForGoFish.containsFourCardsOfSameRank(CardRank.FIVE));
    }

    @Test
    public void containsFourCardsOfTheSameRankFalseTest()
    {
        Assert.assertFalse(handOfCardsForGoFish.containsFourCardsOfSameRank(CardRank.FIVE));
    }
}
