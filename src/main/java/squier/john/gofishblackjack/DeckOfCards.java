package squier.john.gofishblackjack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author John A. Squier
 * This class represents a deck of 52 playing cards.
 */
public class DeckOfCards extends CardCollection
{
    public DeckOfCards()
    {
        super();
        fillCardDeckWith52Cards();
    }

    public void shuffle()
    {
        Collections.shuffle(this);
    }

    public CardCollection dealCards(int numCardsToDeal)
    {
        CardCollection dealtCards = new CardCollection();

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
