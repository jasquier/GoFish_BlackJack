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
