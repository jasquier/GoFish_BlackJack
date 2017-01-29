package squier.john.gofishblackjack;

/**
 * @author John A. Squier
 * This enum represents the rank of an American playing card.  Ace is considered the highest rank.
 */
public enum CardRank
{
    TWO, THREE, FOUR, FIVE, SIX, SEVEN,
    EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

    // make it so 3 prints THREE not "3" and same for other numbers
    public String toString()
    {
        if ( this.ordinal() == 0 )
        {
            return "TWO";
        }
        else if ( this.ordinal() == 1 )
        {
            return "THREE";
        }
        else if ( this.ordinal() == 2 )
        {
            return "FOUR";
        }
        else if ( this.ordinal() == 3 )
        {
            return "FIVE";
        }
        else if ( this.ordinal() == 4 )
        {
            return "SIX";
        }
        else if ( this.ordinal() == 5 )
        {
            return "SEVEN";
        }
        else if ( this.ordinal() == 6 )
        {
            return "EIGHT";
        }
        else if ( this.ordinal() == 7 )
        {
            return "NINE";
        }
        else if ( this.ordinal() == 8 )
        {
            return "TEN";
        }
        else if ( this.ordinal() == 9 ) // index of JACK
        {
            return "JACK";
        }
        else if ( this.ordinal() == 10 ) // index of QUEEN
        {
            return "QUEEN";
        }
        else if ( this.ordinal() == 11 ) // index of KING
        {
            return "KING";
        }
        else // this.ordinal() == 12
        {
            return "ACE";
        }
    }
}
