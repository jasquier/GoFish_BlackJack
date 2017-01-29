package squier.john.gofishblackjack;

import java.util.ArrayList;

/**
 * @author John A. Squier
 * This class allows the playing of a game of go fish with 2 to 10 players
 */
public class GoFishGame extends CardGame
{
    private int numberOfPlayers;
    private DeckOfCards theDeck;
    private HandOfCards[] players;

    public GoFishGame(int desiredNumberOfPlayers)
    {
        setNumberOfPlayers(desiredNumberOfPlayers);

        theDeck = new DeckOfCards();

        players = new HandOfCards[numberOfPlayers];
        for ( int i = 0; i < players.length; i++ )
        {
            players[i] = new HandOfCards();
        }

        dealAGoFishGame();
    }

    @Override
    public void start()
    {

    }

    public DeckOfCards getTheDeck() { return theDeck; }
    public HandOfCards[] getPlayers() { return players; }

    private void setNumberOfPlayers(int desiredNumberOfPlayers)
    {
        if ( desiredNumberOfPlayers < 2 )
        {
            numberOfPlayers = 2;
        }
        else if ( desiredNumberOfPlayers > 10 )
        {
            numberOfPlayers = 10;
        }
        else
            {
            numberOfPlayers = desiredNumberOfPlayers;
        }
    }

    // shuffle first
    // deals out 7 cards to each player unless there are too many players
    //  then we need to divide the cards as evenly as possible
    private void dealAGoFishGame()
    {
        theDeck.shuffleDeck();

        if ( players.length < 7 )
        {
            for ( int i = 0; i < players.length; i++ )
            {
                players[i].addAll(theDeck.dealCards(7));
            }
        }
        else // with 8 players and 7 cards each that would be 56 cards
        {
            System.out.println("CANT HANDLE MORE THAN SEVEN PLAYERS RIGHT NOW!!!!");
            System.exit(players.length);
        }

        return;
    }

    public static void main(String[] args) {
        GoFishGame goFishGame = new GoFishGame(5);

        for ( int i = 0; i < goFishGame.players.length; i++ )
        {
            System.out.println("PLAYER " + i + " HAND:");
            System.out.println(goFishGame.players[i].toString());
            System.out.println();
        }

        System.out.println("AND THE DECK");
        System.out.println(goFishGame.theDeck.size());
        System.out.println(goFishGame.theDeck.toString());
    }
}
