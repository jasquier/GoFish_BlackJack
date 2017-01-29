package squier.john.gofishblackjack;

/**
 * Created by johnsquier on 1/29/17.
 */
abstract public class GoFishIO
{
    abstract void displayWelcomeInformation();

    abstract void displayAllHands(HandOfCards[] players,
                                  int[] numberOfPointsForPlayer);

    abstract void displayMyHand(HandOfCards[] players,
                                    int[] numberOfPointsForPlayer);

    abstract void displayAGuess(GoFishTurnInput guess, int turnOfPlayer);

    abstract void displayResponseToQuestion(String response);

    abstract String generateAIResponse(boolean doesAIHaveCard,
                                   GoFishTurnInput guess,
                                       int turnOfPlayer);

    abstract GoFishTurnInput getUserInput(int numberOfPlayers);

    abstract String getUserResponse();
}
