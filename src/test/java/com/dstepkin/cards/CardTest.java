package com.dstepkin.cards;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    public void testAceOfSpades() {
        Card card = Card.from(Cards.Rank.ACE, Cards.Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(1);
    }

    @Test
    public void testAceOfHearts() {
        Card card = Card.from(Cards.Rank.ACE, Cards.Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0b10);
    }

    @Test
    public void testAceOfDiamonds() {
        Card card = Card.from(Cards.Rank.ACE, Cards.Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0b100);
    }

    @Test
    public void testAceOfClubs() {
        Card card = Card.from(Cards.Rank.ACE, Cards.Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0b1000);
    }

    @Test
    public void testKingOfSpades() {
        Card card = Card.from(Cards.Rank.KING, Cards.Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(0b1_0000);
    }

    @Test
    public void testQueenOfHearts() {
        Card card = Card.from(Cards.Rank.QUEEN, Cards.Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0x200);
    }

    @Test
    public void testJackOfDiamonds() {
        Card card = Card.from(Cards.Rank.JACK, Cards.Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0x4000);
    }

    @Test
    public void testTenOfClubs() {
        Card card = Card.from(Cards.Rank.TEN, Cards.Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0x80000);
    }

    @Test
    public void testNineOfSpades() {
        Card card = Card.from(Cards.Rank.NINE, Cards.Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(0x100000);
    }

    @Test
    public void testEightOfHearts() {
        Card card = Card.from(Cards.Rank.EIGHT, Cards.Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0x2000000);
    }

    @Test
    public void testSevenOfDiamonds() {
        Card card = Card.from(Cards.Rank.SEVEN, Cards.Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0x40000000);
    }

    @Test
    public void testSixOfClubs() {
        Card card = Card.from(Cards.Rank.SIX, Cards.Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0x800000000L);
    }

    @Test
    public void testFiveOfSpades() {
        Card card = Card.from(Cards.Rank.FIVE, Cards.Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(0x1000000000L);
    }

    @Test
    public void testFourOfHearts() {
        Card card = Card.from(Cards.Rank.FOUR, Cards.Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0x20000000000L);
    }

    @Test
    public void testThreeOfDiamonds() {
        Card card = Card.from(Cards.Rank.THREE, Cards.Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0x400000000000L);
    }

    @Test
    public void testTwoOfClubs() {
        Card card = Card.from(Cards.Rank.TWO, Cards.Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0x8000000000000L);
    }
}