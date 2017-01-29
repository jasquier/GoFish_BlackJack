package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/28/17.
 */
public class CardSuitTest {
    CardSuit clubs, diamonds, hearts, spades;

    @Before
    public void setup() {
        clubs = CardSuit.CLUB;
        diamonds = CardSuit.DIAMOND;
        hearts = CardSuit.HEART;
        spades = CardSuit.SPADE;
    }

    @Test
    public void clubsToStringTest()
    {
        String expected = "CLUBS";
        String actual = clubs.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diamondsToStringTest()
    {
        String expected = "DIAMONDS";
        String actual = diamonds.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void heartsToStringTest()
    {
        String expected = "HEARTS";
        String actual = hearts.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spadesToStringTest()
    {
        String expected = "SPADES";
        String actual = spades.toString();
        Assert.assertEquals(expected, actual);
    }

}
