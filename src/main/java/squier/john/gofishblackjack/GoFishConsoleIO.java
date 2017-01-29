package squier.john.gofishblackjack;

import java.util.Scanner;

/**
 * Created by johnsquier on 1/29/17.
 */
public class GoFishConsoleIO extends GoFishIO
{
    Scanner scanner = new Scanner(System.in);

    public void displayWelcomeInformation()
    {
        System.out.printf("\nWELCOME TO J.A.S. GO FISH!\n\n");
    }

    public void displayAllHands(HandOfCards[] players,
                                int[] numberOfPointsForPlayer)
    {
        System.out.println("YOUR HAND: " + numberOfPointsForPlayer[0] + " PTS");
        System.out.println(players[0].toString());

        // prints hands for cheating purposes
        for ( int i = 1; i < players.length; i++ )
        {
            System.out.println("PLAYER " + i + ": " + numberOfPointsForPlayer[i] + " PTS");
            System.out.println(players[i].toString());
            System.out.println();
        }
    }

    public void displayMyHand(HandOfCards[] players,
                              int[] numberOfPointsForPlayer)
    {
        System.out.println("YOUR HAND: " + numberOfPointsForPlayer[0] + " PTS");
        System.out.println(players[0].toString());

        for ( int i = 1; i < players.length; i++ )
        {
            System.out.println("PLAYER " + i + ": " + numberOfPointsForPlayer[i] + " PTS");
        }
    }

    public void displayAGuess(GoFishTurnInput guess, int turnOfPlayer)
    {
        System.out.printf("\nPlayer %d says...\n", turnOfPlayer);
        System.out.printf("%s\n", guess.toString());
    }

    public void displayResponseToQuestion(String response)
    {
        System.out.println(response);
    }

    // should probably be in a go fish ai class
    // how do i handle one five vs 2 five's?
    public String generateAIResponse(boolean doesAIHaveCard,
                                 GoFishTurnInput guess, int turnOfPlayer)
    {
        int playerToRespondTo = turnOfPlayer;
        String rank = guess.getRankToSeeIfPlayerHas().toString();
        String response;

        if ( doesAIHaveCard )
        {
            response = "Yea Player " + playerToRespondTo
                            + " i've got some " + rank + "'s\n";
        }
        else
        {
            response = "No Player " + playerToRespondTo
                        + " i've got no " + rank + "'s\n";
        }

        return response;
    }

    public GoFishTurnInput getUserInput(int numberOfPlayers)
    {
        System.out.printf("WHAT PLAYER DO YOU WANT TO QUESTION? (pick %d through %d): ",
                1, numberOfPlayers - 1);

        int playerToQuestion = scanner.nextInt();

        System.out.printf("AND WHAT RANK DO YOU WANT TO SEARCH FOR? (TWO, FOUR, QUEEN, etc...): ");
        scanner.nextLine();
        String rankToQuestion = scanner.nextLine();

        return new GoFishTurnInput(playerToQuestion, rankToQuestion);
    }

    public String getUserResponse()
    {
        return scanner.nextLine();
    }

}
