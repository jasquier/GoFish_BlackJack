package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/28/17.
 */
public class CardRankTest
{
    CardRank two, three, four, five, six, seven, eight,
                nine, ten, jack, queen, king, ace;

    @Before
    public void setup()
    {
        two = CardRank.TWO;
        three = CardRank.THREE;
        four = CardRank.FOUR;
        five = CardRank.FIVE;
        six = CardRank.SIX;
        seven = CardRank.SEVEN;
        eight = CardRank.EIGHT;
        nine = CardRank.NINE;
        ten = CardRank.TEN;
        jack = CardRank.JACK;
        queen = CardRank.QUEEN;
        king = CardRank.KING;
        ace = CardRank.ACE;
    }

    @Test
    public void twoToStringTest()
    {
        String expected = "2";
        String actual = two.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeToStringTest() {

        String expected = "3";
        String actual = three.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourToStringTest() {
        String expected = "4";
        String actual = four.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveToStringTest() {
        String expected = "5";
        String actual = five.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sixToStringTest() {
        String expected = "6";
        String actual = six.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sevenToStringTest() {
        String expected = "7";
        String actual = seven.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eightToStringTest() {
        String expected = "8";
        String actual = eight.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nineToStringTest() {
        String expected = "9";
        String actual = nine.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tenToStringTest() {
        String expected = "10";
        String actual = ten.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void jackToStringTest() {
        String expected = "JACK";
        String actual = jack.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void queenToStringTest() {
        String expected = "QUEEN";
        String actual = queen.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kingToStringTest() {
        String expected = "KING";
        String actual = king.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void aceToStringTest() {
        String expected = "ACE";
        String actual = ace.toString();
        Assert.assertEquals(expected, actual);
    }
}
