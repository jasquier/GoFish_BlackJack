package squier.john.gofishblackjack;

import java.util.Scanner;

/**
 * Created by johnsquier on 1/29/17.
 */
public class GoFishConsoleIO extends GoFishIO
{
    Scanner scanner = new Scanner(System.in);ß

    public void displayWelcomeInformation()
    {
        System.out.printf("\nWELCOME TO J.A.S. GO FISH!\n\n");
    }

    public void displayAllHands(HandOfCards[] players)
    {
        System.out.println("YOUR HAND:");
        System.out.println(players[0].toString());

        // prints hands for cheating purposes
        for ( int i = 1; i < players.length; i++ )
        {
            System.out.println(players[i].toString());
            System.out.println();
        }
    }

    public void displayAGuess(GoFishTurnInput guess)
    {

    }

    public GoFishTurnInput getTurnInput(int numberOfPlayers)
    {
        System.out.printf("WHAT PLAYER DO YOU WANT TO QUESTION? (pick %d through %d): ",
                2, numberOfPlayers);

        int playerToQuestion = scanner.nextInt();

        System.out.printf("AND WHAT RANK DO YOU WANT TO SEARCH FOR? (TWO, FOUR, QUEEN, etc...): ");
        scanner.nextLine();
        String rankToQuestion = scanner.nextLine();

        return new GoFishTurnInput(playerToQuestion, rankToQuestion);
    }
}
