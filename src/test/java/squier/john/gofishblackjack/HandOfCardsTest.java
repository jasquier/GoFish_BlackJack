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
}
