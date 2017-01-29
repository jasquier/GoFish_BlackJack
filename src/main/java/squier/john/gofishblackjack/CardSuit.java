package squier.john.gofishblackjack;

/**
 * @author John A. Squier
 * This enum represents the suit of an American playing card.
 */
public enum CardSuit
{
    CLUB, DIAMOND, HEART, SPADE;

    public String toString()
    {
        if ( this.ordinal() == 0 ) // CLUB
        {
            return "CLUBS";
        }
        else if ( this.ordinal() == 1 ) // DIAMOND
        {
            return "DIAMONDS";
        }
        else if ( this.ordinal() == 2 ) // HEART
        {
            return "HEARTS";
        }
        else // this.ordinal() == 3 SPADE
        {
            return "SPADES";
        }
    }
}
