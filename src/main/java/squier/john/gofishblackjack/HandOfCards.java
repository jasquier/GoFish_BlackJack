package squier.john.gofishblackjack;

import java.util.ArrayList;

/**
 * @author John A. Squier
 * This class represents a hand of cards
 */
public class HandOfCards extends ArrayList<Card>
{
    public HandOfCards()
    {
        super();
    }

    public HandOfCards transferAllCardsOfRank(CardRank rank)
    {
        HandOfCards temp = new HandOfCards();

        for ( int i = 0; i < this.size(); i++ )
        {
            if ( this.get(i).getRank().equals(rank) )
            {
                //System.out.println("ADDING " + this.get(i).toString());
                temp.add(this.get(i));
            }
        }

        // all suits of the given rank
        this.removeAllCardsOfRank(rank);

        return temp;
    }

    // needs to be put in a card collection super class
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

    public void removeAllCardsOfRank(CardRank rankToRemove)
    {
        this.removeCard(new Card(rankToRemove, CardSuit.CLUB));
        this.removeCard(new Card(rankToRemove, CardSuit.DIAMOND));
        this.removeCard(new Card(rankToRemove, CardSuit.HEART));
        this.removeCard(new Card(rankToRemove, CardSuit.SPADE));

        return;
    }

    public boolean containsCard(Card cardToCheck)
    {
        for ( Card c : this )
        {
            if ( c.equals(cardToCheck) )
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsFourCardsOfOneRank(CardRank rankToCheck)
    {
        if ( this.containsCard(new Card(rankToCheck, CardSuit.CLUB))
                && this.containsCard(new Card(rankToCheck, CardSuit.DIAMOND))
                && this.containsCard(new Card(rankToCheck, CardSuit.HEART))
                && this.containsCard(new Card(rankToCheck, CardSuit.SPADE)) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String theHand = "";

        for ( int i = 0; i < this.size(); i++ )
        {
            theHand += this.get(i).toString() + "\n";
        }

        return theHand;
    }
}
