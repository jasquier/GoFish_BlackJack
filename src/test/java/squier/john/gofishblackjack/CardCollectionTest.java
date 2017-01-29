package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author John A. Squier
 * Test class for the super class CardCollection
 */
public class CardCollectionTest
{
    CardCollection cardCollection;

    @Before
    public void setup()
    {
        cardCollection = new CardCollection();

        cardCollection.add(new Card(CardRank.TWO, CardSuit.CLUB));
        cardCollection.add(new Card(CardRank.THREE, CardSuit.CLUB));
        cardCollection.add(new Card(CardRank.FOUR, CardSuit.CLUB));
    }

    @Test
    public void equalsTrueTest()
    {
        CardCollection expected = new CardCollection();
        expected.add(new Card(CardRank.TWO, CardSuit.CLUB));
        expected.add(new Card(CardRank.THREE, CardSuit.CLUB));
        expected.add(new Card(CardRank.FOUR, CardSuit.CLUB));

        Assert.assertTrue(expected.equals(cardCollection));
    }

    @Test
    public void equalsFalseTest()
    {
        CardCollection expected = new CardCollection();
        expected.add(new Card(CardRank.FOUR, CardSuit.HEART));

        Assert.assertFalse(expected.equals(cardCollection));
    }

    @Test
    public void containsCardTrue()
    {
        Assert.assertTrue(cardCollection.containsCard(
                            new Card(CardRank.THREE, CardSuit.CLUB)));
    }

    @Test
    public void containsCardFalseTest()
    {
        Assert.assertFalse(cardCollection.containsCard(
                            new Card(CardRank.ACE, CardSuit.SPADE)));
    }

    @Test
    public void removeCardThatIsInCollectionTest()
    {
        CardCollection expected = new CardCollection();
        expected.add(new Card(CardRank.TWO, CardSuit.CLUB));
        expected.add(new Card(CardRank.FOUR, CardSuit.CLUB));

        cardCollection.removeCard(new Card(CardRank.THREE, CardSuit.CLUB));

        Assert.assertTrue(expected.equals(cardCollection));
    }

    @Test
    public void removeCardThatIsNotInCollectionTest()
    {
        Assert.assertFalse(cardCollection.removeCard(
                    new Card(CardRank.ACE, CardSuit.SPADE)));
    }

    @Test
    public void toStringTest()
    {
        String expected = "TWO OF CLUBS\nTHREE OF CLUBS\nFOUR OF CLUBS\n";

        String actual = cardCollection.toString();

        Assert.assertEquals(expected, actual);
    }
}
