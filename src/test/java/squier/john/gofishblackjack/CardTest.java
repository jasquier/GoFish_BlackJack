package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import squier.john.gofishblackjack.Card;
import squier.john.gofishblackjack.CardRank;
import squier.john.gofishblackjack.CardSuit;

/**
 * @author John A. Squier
 * This class tests the squier.john.gofishblackjack.Card class in this package
 */
public class CardTest
{
    Card twoOfHearts;
    Card fiveOfDiamonds;

    @Before
    public void setup()
    {
        twoOfHearts = new Card(CardRank.TWO, CardSuit.HEART);
        fiveOfDiamonds = new Card(CardRank.FIVE, CardSuit.DIAMOND);
    }

    @Test
    public void getRankTest()
    {
        CardRank expected = CardRank.TWO;
        CardRank actual = twoOfHearts.getRank();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSuitTest()
    {
        CardSuit expected = CardSuit.HEART;
        CardSuit actual = twoOfHearts.getSuit();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTwoOfHeartsTest()
    {
        String expected = "TWO OF HEARTS";
        String actual = twoOfHearts.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringFiveOfDiamondsTest()
    {
        String expected = "FIVE OF DIAMONDS";
        String actual = fiveOfDiamonds.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTo_ThisLessThanOtherTest()
    {
        int expected = -1;
        int actual = twoOfHearts.compareTo(fiveOfDiamonds);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTo_ThisGreaterThanOtherTest()
    {
        int expected = 1;
        int actual = fiveOfDiamonds.compareTo(twoOfHearts);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTo_ThisEqualsOtherTest()
    {
        int expected = 0;
        int actual = twoOfHearts.compareTo(twoOfHearts);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cardsEqualTest()
    {
        Assert.assertTrue(twoOfHearts.equals(
                new Card(CardRank.TWO, CardSuit.HEART)));
    }

    @Test
    public void cardsNotEqualTest()
    {
        Assert.assertFalse(fiveOfDiamonds.equals(twoOfHearts));
    }
}
