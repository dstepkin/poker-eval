package com.dstepkin.cards;

import com.dstepkin.cards.Card.Rank;
import com.dstepkin.cards.Card.Suit;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CardTest {

    @Test
    public void testAceOfSpades() {
        Card card = Card.from(Rank.ACE, Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(1);
    }

    @Test
    public void testAceOfHearts() {
        Card card = Card.from(Rank.ACE, Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0b10);
    }

    @Test
    public void testAceOfDiamonds() {
        Card card = Card.from(Rank.ACE, Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0b100);
    }

    @Test
    public void testAceOfClubs() {
        Card card = Card.from(Rank.ACE, Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0b1000);
    }

    @Test
    public void testKingOfSpades() {
        Card card = Card.from(Rank.KING, Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(0b1_0000);
    }

    @Test
    public void testQueenOfHearts() {
        Card card = Card.from(Rank.QUEEN, Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0x200);
    }

    @Test
    public void testJackOfDiamonds() {
        Card card = Card.from(Rank.JACK, Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0x4000);
    }

    @Test
    public void testTenOfClubs() {
        Card card = Card.from(Rank.TEN, Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0x80000);
    }

    @Test
    public void testNineOfSpades() {
        Card card = Card.from(Rank.NINE, Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(0x100000);
    }

    @Test
    public void testEightOfHearts() {
        Card card = Card.from(Rank.EIGHT, Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0x2000000);
    }

    @Test
    public void testSevenOfDiamonds() {
        Card card = Card.from(Rank.SEVEN, Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0x40000000);
    }

    @Test
    public void testSixOfClubs() {
        Card card = Card.from(Rank.SIX, Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0x800000000L);
    }

    @Test
    public void testFiveOfSpades() {
        Card card = Card.from(Rank.FIVE, Suit.SPADES);
        assertThat(card.getCards()).isEqualTo(0x1000000000L);
    }

    @Test
    public void testFourOfHearts() {
        Card card = Card.from(Rank.FOUR, Suit.HEARTS);
        assertThat(card.getCards()).isEqualTo(0x20000000000L);
    }

    @Test
    public void testThreeOfDiamonds() {
        Card card = Card.from(Rank.THREE, Suit.DIAMONDS);
        assertThat(card.getCards()).isEqualTo(0x400000000000L);
    }

    @Test
    public void testTwoOfClubs() {
        Card card = Card.from(Rank.TWO, Suit.CLUBS);
        assertThat(card.getCards()).isEqualTo(0x8000000000000L);
    }

    @Test
    public void testAceRank() {
        Card card = Card.from(Rank.ACE, Suit.SPADES);
        assertThat(card.getRank()).isEqualTo(Rank.ACE);
    }

    @Test
    public void testKingRank() {
        Card card = Card.from(Rank.KING, Suit.SPADES);
        assertThat(card.getRank()).isEqualTo(Rank.KING);
    }

    @Test
    public void testTreyRank() {
        Card card = Card.from(Rank.THREE, Suit.CLUBS);
        assertThat(card.getRank()).isEqualTo(Rank.THREE);
    }

    @Test
    public void testDeuceRank() {
        Card card = Card.from(Rank.TWO, Suit.CLUBS);
        assertThat(card.getRank()).isEqualTo(Rank.TWO);
    }

    @Test
    public void testSpadesSuit() {
        Card card = Card.from(Rank.ACE, Suit.SPADES);
        assertThat(card.getSuit()).isEqualTo(Suit.SPADES);
    }

    @Test
    public void testHeartsSuit() {
        Card card = Card.from(Rank.KING, Suit.HEARTS);
        assertThat(card.getSuit()).isEqualTo(Suit.HEARTS);
    }

    @Test
    public void testDiamondsSuit() {
        Card card = Card.from(Rank.THREE, Suit.DIAMONDS);
        assertThat(card.getSuit()).isEqualTo(Suit.DIAMONDS);
    }

    @Test
    public void testClubsSuit() {
        Card card = Card.from(Rank.TWO, Suit.CLUBS);
        assertThat(card.getSuit()).isEqualTo(Suit.CLUBS);
    }

    @Test
    public void testAceOfSpadesFromString() {
        Card card = Card.from("As");
        assertThat(card.getRank()).isEqualTo(Rank.ACE);
        assertThat(card.getSuit()).isEqualTo(Suit.SPADES);
    }

    @Test
    public void testAceOfClubsFromString() {
        Card card = Card.from("Ac");
        assertThat(card.getRank()).isEqualTo(Rank.ACE);
        assertThat(card.getSuit()).isEqualTo(Suit.CLUBS);
    }

    @Test
    public void testKingOfSpadesFromString() {
        Card card = Card.from("Ks");
        assertThat(card.getRank()).isEqualTo(Rank.KING);
        assertThat(card.getSuit()).isEqualTo(Suit.SPADES);
    }

    @Test
    public void testQueenOfHeartsFromString() {
        Card card = Card.from("Qh");
        assertThat(card.getRank()).isEqualTo(Rank.QUEEN);
        assertThat(card.getSuit()).isEqualTo(Suit.HEARTS);
    }

    @Test
    public void testJackOfDiamondsFromString() {
        Card card = Card.from("Jd");
        assertThat(card.getRank()).isEqualTo(Rank.JACK);
        assertThat(card.getSuit()).isEqualTo(Suit.DIAMONDS);
    }

    @Test
    public void testTenOfClubsFromString() {
        Card card = Card.from("Tc");
        assertThat(card.getRank()).isEqualTo(Rank.TEN);
        assertThat(card.getSuit()).isEqualTo(Suit.CLUBS);
    }

    @Test
    public void testNineOfSpadesFromString() {
        Card card = Card.from("9s");
        assertThat(card.getRank()).isEqualTo(Rank.NINE);
        assertThat(card.getSuit()).isEqualTo(Suit.SPADES);
    }

    @Test
    public void testEightOfHeartsFromString() {
        Card card = Card.from("8h");
        assertThat(card.getRank()).isEqualTo(Rank.EIGHT);
        assertThat(card.getSuit()).isEqualTo(Suit.HEARTS);
    }

    @Test
    public void testSevenOfDiamondsFromString() {
        Card card = Card.from("7d");
        assertThat(card.getRank()).isEqualTo(Rank.SEVEN);
        assertThat(card.getSuit()).isEqualTo(Suit.DIAMONDS);
    }

    @Test
    public void testSixOfClubsFromString() {
        Card card = Card.from("6c");
        assertThat(card.getRank()).isEqualTo(Rank.SIX);
        assertThat(card.getSuit()).isEqualTo(Suit.CLUBS);
    }

    @Test
    public void testFiveOfSpadesFromString() {
        Card card = Card.from("5s");
        assertThat(card.getRank()).isEqualTo(Rank.FIVE);
        assertThat(card.getSuit()).isEqualTo(Suit.SPADES);
    }

    @Test
    public void testFourOfHeartsFromString() {
        Card card = Card.from("4h");
        assertThat(card.getRank()).isEqualTo(Rank.FOUR);
        assertThat(card.getSuit()).isEqualTo(Suit.HEARTS);
    }

    @Test
    public void testTreyOfDiamondsFromString() {
        Card card = Card.from("3d");
        assertThat(card.getRank()).isEqualTo(Rank.THREE);
        assertThat(card.getSuit()).isEqualTo(Suit.DIAMONDS);
    }

    @Test
    public void testTwoOfClubsFromString() {
        Card card = Card.from("2c");
        assertThat(card.getRank()).isEqualTo(Rank.TWO);
        assertThat(card.getSuit()).isEqualTo(Suit.CLUBS);
    }

    @Test
    public void testIncorrectSuitFromString() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Card.from("2z")
        );
    }

    @Test
    public void testIncorrectRankFromString() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Card.from("Ys")
        );
    }

    @Test
    public void testIncorrectInputFromString() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Card.from("HELLO")
        );
    }
}