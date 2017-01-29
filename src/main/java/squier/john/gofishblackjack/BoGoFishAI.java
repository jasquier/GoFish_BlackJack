package squier.john.gofishblackjack;

/**
 * Created by johnsquier on 1/29/17.
 */
public class BoGoFishAI implements GoFishAI
{
    private int numberOfPlayersInGame;

    public BoGoFishAI(int numberOfPlayersInGame)
    {
        setNumberOfPlayersInGame(numberOfPlayersInGame);
    }

    public void setNumberOfPlayersInGame(int numberOfPlayersInGame)
    {
        this.numberOfPlayersInGame = numberOfPlayersInGame;
    }

    public GoFishTurnInput generateInput()
    {
        int playerToQuestion = (int)(Math.random() * numberOfPlayersInGame);
        int rankToSearchFor = (int)(Math.random() * CardRank.values().length);
        String thatRankAsAString = CardRank.values()[rankToSearchFor].toString();

        return new GoFishTurnInput(playerToQuestion, thatRankAsAString);
    }
}
