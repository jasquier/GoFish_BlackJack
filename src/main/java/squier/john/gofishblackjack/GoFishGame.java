package squier.john.gofishblackjack;

/**
 * @author John A. Squier
 * This class allows the playing of a game of go fish with 2 to 10 players
 */
public class GoFishGame extends CardGame
{
    private int numberOfPlayers;
    int turnOfPlayer;
    private int[] numberOfPointsForPlayer;
    private DeckOfCards theDeck;
    private HandOfCards[] players;
    private GoFishTurnInput guess;
    private GoFishAI ai;
    private GoFishIO io;

    public GoFishGame(int desiredNumberOfPlayers)
    {
        setNumberOfPlayers(desiredNumberOfPlayers);

        turnOfPlayer = 0;

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

        ai = new BoGoFishAI(numberOfPlayers);
        io = new GoFishConsoleIO();

        dealAGoFishGame();
    }

    @Override
    public void start() {

        io.displayWelcomeInformation();

        while (theDeck.size() > 0 /*|| at least two players have cards */) {

            handleFourOfAKindInHands();

            // for cheaters - swap these two lines commented/uncommmented
            io.displayAllHands(players, numberOfPointsForPlayer);
            //io.displayMyHand(players, numberOfPointsForPlayer);

            if ( itsOurTurn() )
            {
                guess = io.getUserInput(numberOfPlayers);
            }
            else
            {
                guess = ai.generateInput();
            }

            io.displayAGuess(guess, turnOfPlayer);

            String response;
            boolean playerHasCardThatWasGuessed = checkPlayerForCard(guess);

            if ( itsOurTurn() )
            {
                // @@@ move this to ai not io
                response = io.generateAIResponse(playerHasCardThatWasGuessed, guess,
                                                turnOfPlayer);
            }
            else
            {
                if ( guess.getPlayerToQuestion() != 0 ) // ai asking ai
                {
                    response = io.generateAIResponse(playerHasCardThatWasGuessed, guess,
                                                turnOfPlayer);
                }
                else // ai asking us
                {
                    response = io.getUserResponse();
                }
            }

            io.displayResponseToQuestion(response);

            if ( playerHasCardThatWasGuessed )
            {
                // player has cards so transfer
                players[turnOfPlayer].addAll(
                        players[guess.getPlayerToQuestion()].transferAllCardsOfRank(
                                guess.getRankToSeeIfPlayerHas()));

                // ensure player has cards after transfer
                if ( players[guess.getPlayerToQuestion()].size() == 0 )
                {
                    players[guess.getPlayerToQuestion()].addAll(theDeck.dealCards(5));
                }
            }
            else
            {
                System.out.println("GO FISH!");

                // turnOfPlayer can only hold values 0 -> numberOfPlayers - 1
                turnOfPlayer = (turnOfPlayer + 1) % numberOfPlayers;
            }
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
                    players[j].addAll(theDeck.dealCards(4));
                }
            }
        }
    }

    private boolean checkPlayerForCard(GoFishTurnInput input)
    {
        if ( players[input.getPlayerToQuestion()].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.CLUB))
                || players[input.getPlayerToQuestion()].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.DIAMOND))
                || players[input.getPlayerToQuestion()].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.HEART))
                || players[input.getPlayerToQuestion()].containsCard(new Card(input.getRankToSeeIfPlayerHas(), CardSuit.SPADE))
                )
        {
            return true;
        }

        return false;
    }

    private boolean itsOurTurn()
    {
        return (turnOfPlayer == 0);
    }

    public static void main(String[] args) {
        GoFishGame goFishGame = new GoFishGame(5);

        goFishGame.start();
    }


}
