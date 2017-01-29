package squier.john.gofishblackjack;

/**
 * Created by johnsquier on 1/29/17.
 */
abstract public class GoFishIO
{
    abstract void displayWelcomeInformation();

    abstract void displayAllHands(HandOfCards[] players);

    abstract void displayAGuess(GoFishTurnInput guess);

    abstract GoFishTurnInput getTurnInput(int numberOfPlayers);
}
