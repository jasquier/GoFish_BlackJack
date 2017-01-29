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
        super();
        fillCardDeckWith52Cards();
    }

    public void shuffleDeck()
    {
        Collections.shuffle(this);
    }

    public ArrayList<Card> dealCards(int numCardsToDeal)
    {
        ArrayList<Card> dealtCards = new ArrayList<>();

        for ( int i = 0; i < numCardsToDeal; i++ )
        {
            dealtCards.add(this.get(i));
        }

        for ( int i = 0; i < numCardsToDeal; i++ )
        {
            this.remove(dealtCards.get(i));
        }

        return dealtCards;
    }

    // needs to be put in a cardcollection super class
    public boolean removeCard(Card cardToRemove)
    {
        for ( Card c : this )
        {
            if ( c.equals(cardToRemove) ) // uses my equals method in card
            {
                this.remove(c);
                return true;
            }
        }
        return false;
    }

    // needs to be a string builder
    public String toString()
    {
        String theDeck = "";

        for ( int i = 0; i < this.size(); i++ )
        {
            theDeck += this.get(i).toString() + "\n";
        }

        return theDeck;
    }

    private void fillCardDeckWith52Cards()
    {
        CardRank[] ranks = CardRank.values();
        CardSuit[] suits = CardSuit.values();

        for ( int i = 0; i < suits.length; i++ )
        {
            for ( int j = 0; j < ranks.length; j++ )
            {
                this.add(new Card(ranks[j], suits[i]));
            }
        }
    }
}
