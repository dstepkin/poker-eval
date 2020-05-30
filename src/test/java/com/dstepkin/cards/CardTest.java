package com.dstepkin.cards;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    public void test() {
        Card card = new Card();
        assertThat(card.getCards()).isEqualTo(0);
    }

}