package squier.john.gofishblackjack;

/**
 * Created by johnsquier on 1/29/17.
 */
public class GoFishTurnInput
{
    private int playerToQuestion;
    private CardRank rankToSeeIfPlayerHas;

    // needs input checking
    public GoFishTurnInput(int player, String rankToQuestion)
    {
        playerToQuestion = player;
        rankToSeeIfPlayerHas = CardRank.valueOf(rankToQuestion);
    }

    @Override
    public String toString()
    {
        return "\"Hey player " + playerToQuestion +
                ", got any " + rankToSeeIfPlayerHas.toString() + "'s?\"\n";
    }

    public int getPlayerToQuestion() {
        return playerToQuestion;
    }

    public CardRank getRankToSeeIfPlayerHas() {
        return rankToSeeIfPlayerHas;
    }
}
