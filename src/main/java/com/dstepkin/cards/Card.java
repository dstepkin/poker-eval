package com.dstepkin.cards;

public class Card implements Cards {

    private static final String SUITS = "shdc";
    private static final String RANKS = "AKQJT98765432";

    private final long cards;

    private Card(long cards) {
        this.cards = cards;
    }

    public long getCards() {
        return cards;
    }

    public Rank getRank() {
        int rankIndex = Long.numberOfTrailingZeros(cards) / Suit.values().length;
        return Rank.values()[rankIndex];
    }

    public Suit getSuit() {
        int suitIndex = Long.numberOfTrailingZeros(cards) % Suit.values().length;
        return Suit.values()[suitIndex];
    }

    public static Card from(Rank rank, Suit suit) {
        int shift = rank.ordinal() * Suit.values().length + suit.ordinal();
        long cardValue = 1L << shift;
        return new Card(cardValue);
    }

    public static Card from(String card) {
        if (card == null || card.length() != 2) {
            throw new IllegalArgumentException();
        }
        return from(getCardRank(card), getCardSuit(card));
    }

    private static Suit getCardSuit(String card) {
        return Suit.values()[getIndex(card, SUITS)];
    }

    private static Rank getCardRank(String card) {
        return Rank.values()[getIndex(card, RANKS)];
    }

    private static int getIndex(String card, String paramList) {
        String negativeRegexp = "[^" + paramList + "]";
        String param = card.replaceAll(negativeRegexp, "");
        if (param.length() != 1) {
            throw new IllegalArgumentException();
        }
        return paramList.indexOf(param);
    }

    public enum Rank {
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

    public enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS,
    }
}
