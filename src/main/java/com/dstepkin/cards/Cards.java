package com.dstepkin.cards;

public interface Cards {

    /**
     * every card is a single bit.
     * Hand ranks:    Two   Thre Four Five Six   Seve Eigh Nine Ten   Jack Quee King Ace
     * 0000 0000 0000 0000  0000 0000 0000 0000  0000 0000 0000 0000  0000 0000 0000 0000
     * Hand suits:    cdhs  cdhs cdhs cdhs cdhs  cdhs cdhs cdhs cdhs  cdhs cdhs cdhs cdhs
     *
     * @return list of cards
     */
    long getCards();

    enum Rank {
        ACE,
        KING,
        QUEEN,
        JACK,
        TEN,
        NINE,
        EIGHT,
        SEVEN,
        SIX,
        FIVE,
        FOUR,
        THREE,
        TWO,
    }

    enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS,
    }
}
