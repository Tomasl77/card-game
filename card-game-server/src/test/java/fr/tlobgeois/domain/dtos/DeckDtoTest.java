package fr.tlobgeois.domain.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.UnitTestConfig;

class DeckDtoTest extends UnitTestConfig {

    private static DeckDto deckUnderTest;

    @BeforeAll
    static void setUp() throws Exception {
	deckUnderTest = new DeckDto(mockSetOfCards);
    }

    @Test
    void should_construct() {
	DeckDto dtoUnderTest = new DeckDto();
	assertNotNull(dtoUnderTest);
    }

    @Test
    void should_get_cards() {
	assertEquals(11, deckUnderTest.getCards().size());
    }
}
