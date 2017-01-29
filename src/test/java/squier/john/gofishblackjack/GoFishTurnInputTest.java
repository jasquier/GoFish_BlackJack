package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/29/17.
 */
public class GoFishTurnInputTest
{
    GoFishTurnInput goFishTurnInput;

    @Before
    public void setup()
    {
        goFishTurnInput = new GoFishTurnInput(2, "THREE");
    }

    @Test
    public void toStringTest()
    {
        String expected = "Hey player 2, got any 3's?\n";
        String actual = goFishTurnInput.toString();
        Assert.assertEquals(expected, actual);
    }
}
