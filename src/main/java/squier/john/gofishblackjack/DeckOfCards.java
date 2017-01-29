package squier.john.gofishblackjack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author John A. Squier
 * This class represents a deck of 52 playing cards.
 */
public class DeckOfCards extends ArrayList<Card>
{
    public DeckOfCards()
    {
        cardDeck = new ArrayList<Card>();
        fillCardDeckWith52Cards();
    }

    public String toString()
    {
        String theDeck = "";

        for ( int i = 0; i < cardDeck.size(); i++ )
        {
            theDeck += cardDeck.get(i).toString() + "\n";
        }

        return theDeck;
    }

    public void shuffleDeck()
    {
        Collections.shuffle(cardDeck);
    }

    // do we even need this method? it just wraps arraylist.remove(i)
    public void removeCardFromDeck(Card cardToRemove)
    {
        for ( int i = 0; i < cardDeck.size(); i++ )
        {
            if ( cardDeck.get(i).equals(cardToRemove) )
            {
                cardDeck.remove(i);
                break;
            }
        }
    }

    public ArrayList<Card> dealCards(int numCardsToDeal)
    {
        ArrayList<Card> dealtCards = new ArrayList<>();

        for ( int i = 0; i < numCardsToDeal; i++ )
        {
            dealtCards.add(cardDeck.get(i));
        }
        for ( int i = 0; i < numCardsToDeal; i++ )
        {
            cardDeck.remove(dealtCards.get(i));
        }

        return dealtCards;
    }

    private void fillCardDeckWith52Cards()
    {
        CardRank[] ranks = CardRank.values();
        CardSuit[] suits = CardSuit.values();

        for ( int i = 0; i < suits.length; i++ )
        {
            for ( int j = 0; j < ranks.length; j++ )
            {
                cardDeck.add(new Card(ranks[j], suits[i]));
            }
        }
    }
}
