package com.dstepkin.cards;

public class Card implements Cards {

    private final long cards;

    public Card(long cards) {
        this.cards = cards;
    }

    public long getCards() {
        return cards;
    }

    public static Card from(Rank rank, Suit suit) {
        int shift = rank.ordinal() * Suit.values().length + suit.ordinal();
        long cardValue = 1L << shift;
        return new Card(cardValue);
    }
}
