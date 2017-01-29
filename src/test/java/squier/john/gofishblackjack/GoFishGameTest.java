package squier.john.gofishblackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/29/17.
 */
public class GoFishGameTest
{
    GoFishGame goFishGame;

    @Before
    public void setup()
    {
        goFishGame = new GoFishGame(5);
    }

    @Test
    public void checkHandAndDeckSizesWhenThereAreFivePlayers()
    {
        int expectedHandSize = 7;
        int expectedDeckSize = 17;
        int[] expected = { expectedHandSize, expectedDeckSize };

        int actualHandSize = goFishGame.getPlayers()[0].size();
        int actualDeckSize = goFishGame.getTheDeck().size();
        int[] actual = { actualHandSize, actualDeckSize };

        Assert.assertArrayEquals(expected, actual);
    }
}
