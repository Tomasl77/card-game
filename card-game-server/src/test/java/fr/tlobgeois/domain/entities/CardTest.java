package fr.tlobgeois.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.JunitTestConfig;

class CardTest extends JunitTestConfig {

    private static Card cardUnderTest;

    @BeforeAll
    static void setUp() throws Exception {
	cardUnderTest = new Card(Suit.HEART, Value.SEVEN);
    }

    @Test
    void should_construct_suit_card() {
	assertNotNull(cardUnderTest);
    }

    @Test
    void should_get_suit() {
	assertEquals(Suit.HEART, cardUnderTest.getSuit());
    }

    @Test
    void should_get_value() {
	assertEquals(Value.SEVEN, cardUnderTest.getValue());
    }

    @Test
    void should_to_string() {
	assertEquals("SEVEN of HEART", cardUnderTest.toString());
    }

    @Test
    void should_compare_to_suit() {
	Card cardToCompare = new Card(Suit.CLUB, Value.SEVEN);
	int suitLesserThan = cardUnderTest.compareTo(cardToCompare);
	assertTrue(suitLesserThan < 0);
    }

    @Test
    void should_compare_to_value() {
	Card cardToCompare = new Card(Suit.HEART, Value.ACE);
	int valueGreaterThan = cardUnderTest.compareTo(cardToCompare);
	assertTrue(valueGreaterThan > 0);
    }

    @Test
    void should_compare_to_same_card() {
	Card cardToCompare = new Card(Suit.HEART, Value.SEVEN);
	int suitAndValueEquals = cardUnderTest.compareTo(cardToCompare);
	assertTrue(suitAndValueEquals == 0);
    }

    @Test
    void should_compare_to_null_card() {
	Card cardToCompare = null;
	int nullCard = cardUnderTest.compareTo(cardToCompare);
	assertTrue(nullCard == 1);
    }
}
