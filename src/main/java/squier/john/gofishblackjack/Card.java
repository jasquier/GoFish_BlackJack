package squier.john.gofishblackjack;

/**
 * @author John A. Squier
 * This class represents an American playing card.
 */
public class Card implements Comparable<Card>
{
    private CardRank rank;
    private CardSuit suit;

    public Card(CardRank rank, CardSuit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public CardRank getRank() { return rank; }

    public CardSuit getSuit() { return suit; }

    public String toString()
    {
        return this.getRank().toString()
                + " OF "
                + this.getSuit().toString();
    }

    // compares cards by rank only
    public int compareTo(Card other)
    {
        if ( this.getRank().ordinal() < other.getRank().ordinal() )
        {
            return -1;
        }
        else if ( this.getRank().ordinal() > other.getRank().ordinal() )
        {
            return 1;
        }
        else // this.rank.ordinal() == other.rank.ordinal()
        {
            return 0;
        }
    }

    public boolean equals(Card other)
    {
        return this.getRank().ordinal() == other.getRank().ordinal() &&
                this.getSuit().ordinal() == other.getSuit().ordinal();
    }
}
