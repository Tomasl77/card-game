package fr.tlobgeois.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.JunitTestConfig;

class DeckTest extends JunitTestConfig {

    private static Deck deckUnderTest;

    @BeforeAll
    static void setUp() throws Exception {
	deckUnderTest = new Deck();
    }

    @Test
    void should_construct_deck() {
	assertNotNull(deckUnderTest);
    }

    @Test
    void should_get_cards() {
	assertEquals(52, deckUnderTest.getCards().size());
    }

    @Test
    void sould_draw_cards() {
	assertTrue(deckUnderTest.drawCard() instanceof Card);
    }

    @Test
    void should_to_string() {
	assertTrue(deckUnderTest.toString().startsWith("{deck: "));
    }
}
