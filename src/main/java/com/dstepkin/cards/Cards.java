package com.dstepkin.cards;

public interface Cards {

    /**
     * every card is a single bit.
     * Card ranks:    Two   Thre Four Five Six   Seve Eigh Nine Ten   Jack Quee King Ace
     * 0000 0000 0000 1111  1111 1111 1111 1111  1111 1111 1111 1111  1111 1111 1111 1111
     * Card suits:    cdhs  cdhs cdhs cdhs cdhs  cdhs cdhs cdhs cdhs  cdhs cdhs cdhs cdhs
     *
     * @return list of cards as a single long number
     */
    long getCards();
}
