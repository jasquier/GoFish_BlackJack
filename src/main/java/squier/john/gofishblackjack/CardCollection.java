package squier.john.gofishblackjack;

import java.util.ArrayList;

/**
 * @author John A. Squier
 * Super class for deck and hand classes.
 */
public class CardCollection extends ArrayList<Card>
{
    public CardCollection()
    {
        super();
    }

    public boolean equals(CardCollection other)
    {
        boolean cardCollectionsAreEqual = true;

        if ( this.size() != other.size() )
        {
            cardCollectionsAreEqual = false;
            return cardCollectionsAreEqual;
        }
        else
        {
            for ( int i = 0; i < this.size(); i++ )
            {
                if ( !this.get(i).equals(other.get(i)) )
                {
                    cardCollectionsAreEqual = false;
                }
            }
        }

        return cardCollectionsAreEqual;
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

    public boolean removeCard(Card cardToRemove)
    {
        for ( Card c : this )
        {
            if ( c.equals(cardToRemove) )
            {
                this.remove(c);
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString()
    {
        String tempCardCollection = "";

        for ( int i = 0; i < this.size(); i++ )
        {
            tempCardCollection += this.get(i).toString() + "\n";
        }

        return tempCardCollection;
    }
}
