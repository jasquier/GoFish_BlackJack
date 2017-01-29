package squier.john.gofishblackjack;

/**
 * @author John A. Squier
 * This class represents a hand of cards in a game of Go Fish
 */
public class HandOfCardsForGoFish extends HandOfCards
{
    public HandOfCardsForGoFish()
    {
        super();
    }

    public void removeAllCardsOfRank(CardRank rankToRemove)
    {
        this.removeCard(new Card(rankToRemove, CardSuit.CLUB));
        this.removeCard(new Card(rankToRemove, CardSuit.DIAMOND));
        this.removeCard(new Card(rankToRemove, CardSuit.HEART));
        this.removeCard(new Card(rankToRemove, CardSuit.SPADE));

        return;
    }

    public HandOfCardsForGoFish transferAllCardsOfRank(CardRank rank)
    {
        HandOfCardsForGoFish temp = new HandOfCardsForGoFish();

        for ( int i = 0; i < this.size(); i++ )
        {
            if ( this.get(i).getRank().equals(rank) )
            {
                temp.add(this.get(i));
            }
        }

        // all suits of the given rank
        this.removeAllCardsOfRank(rank);

        return temp;
    }

    public boolean containsFourCardsOfSameRank(CardRank rankToCheck)
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
}
