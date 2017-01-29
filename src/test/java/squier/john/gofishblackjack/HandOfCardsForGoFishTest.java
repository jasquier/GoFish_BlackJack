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
    public void transferAllCardsOfRankFiveTest()
    {

    }
}
