package squier.john.gofishblackjack;

import java.util.ArrayList;

/**
 * @author John A. Squier
 * This class allows the playing of a game of go fish with 2 to 10 players
 */
public class GoFishGame extends CardGame
{
    private int numberOfPlayers;
    private int[] numberOfPointsForPlayer;
    private DeckOfCards theDeck;
    private HandOfCards[] players;

    private GoFishIO io = new GoFishConsoleIO();

    public GoFishGame(int desiredNumberOfPlayers)
    {
        setNumberOfPlayers(desiredNumberOfPlayers);

        numberOfPointsForPlayer = new int[numberOfPlayers];
        for ( int i = 0; i < numberOfPointsForPlayer.length; i++ )
        {
            numberOfPointsForPlayer[i] = 0;
        }

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
        // cards are dealt before this method starts
        //
        // after cards are dealt check everyone's hand for 4 of a kind and if so then stash them and add a pt
        // player0 goes first, ask for who and what card
        // check that person for that card
        // if that person has card/s of that rank
        //      give them to player0
        // else GO FISH
        // other players turns proceed in the same manner
        // if cpu player picks player zero they must ask us for a card
        // we can LIE IF WE WANT TO
        // @@@ add ai to decide if we are lying, can it predict our cards?
        // cpu player turns proceed until it's our turn again (we are player0)
        // how the heck does go fish work? do we try to get all four of a card and then lay them down?



        int turnOfPlayer = 0;
        GoFishTurnInput guess;

        io.displayWelcomeInformation();

        // loop should start here
        // while ( deck is not empty AND players still have cards )

        // we are player 0
        handleFourOfAKindInHands();

        io.displayAllHands(players);

        if ( turnOfPlayer == 0 )
        {
            // our turn
            guess = io.getTurnInput(numberOfPlayers);
        }
        else
        {
            // ai turn
            guess = generateAIGuess();
        }

        io.displayAGuess(guess);

        System.out.println("YOU SAY " + input.toString());

        // check that player for that card
        if ( checkPlayerForCard(input) ) // player has card of that rank
        {
            System.out.println("player " + input.getPlayerToQuestion() + " has "
                    + input.getRankToSeeIfPlayerHas().toString() + "s");
        }
        else // player has no cards of that rank
        {
            // GO FISH!
        }


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

    private void dealAGoFishGame()
    {
        theDeck.shuffleDeck();

        for ( int i = 0; i < numberOfPlayers; i++ )
        {
            players[i].addAll(theDeck.dealCards(5));
        }

        return;
    }

    private void handleFourOfAKindInHands()
    {
        // check everyone's hands for 4 of a kind and delete the cards if so and add a pt
        for ( int i = 0; i < CardRank.values().length; i++)
        {
            for ( int j = 0; j < numberOfPlayers; j++ )
            {
                if ( players[j].containsFourCardsOfOneRank(CardRank.values()[i]) )
                {
                    players[j].removeAllCardsOfRank(CardRank.values()[i]);
                    numberOfPointsForPlayer[j]++;
                }
            }
        }
    }

    private boolean checkPlayerForCard(GoFishTurnInput input)
    {
        if ( players[input.getPlayerToQuestion() - 1].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.CLUB))
                || players[input.getPlayerToQuestion() - 1].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.DIAMOND))
                || players[input.getPlayerToQuestion() - 1].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.HEART))
                || players[input.getPlayerToQuestion() - 1].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.SPADE))
                )
        {
            return true;
        }

        return false;
    }

    private GoFishTurnInput generateAIGuess()
    {
        // gotta generate a player to pick btw 0 and numPlayers and a rank btw 0 and 12
        int playerToQuestion = Math.random()
        return null;
    }

    public static void main(String[] args) {
        GoFishGame goFishGame = new GoFishGame(5);

        goFishGame.start();

/*        for ( int i = 0; i < goFishGame.players.length; i++ )
        {
            System.out.println("PLAYER " + i + " HAND:");
            System.out.println(goFishGame.players[i].toString());
            System.out.println();
        }

        System.out.println("AND THE DECK");
        System.out.println(goFishGame.theDeck.size());
        System.out.println(goFishGame.theDeck.toString());*/
    }


}
