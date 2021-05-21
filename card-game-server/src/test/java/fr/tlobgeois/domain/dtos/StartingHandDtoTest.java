package fr.tlobgeois.domain.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.JunitTestConfig;

class StartingHandDtoTest extends JunitTestConfig {

    private static StartingHandDto dtoUnderTest;

    @BeforeAll
    static void setUp() throws Exception {
	dtoUnderTest = new StartingHandDto(
	        new PlayerDto("Tomas", new LinkedHashSet<>()),
	        new DeckDto(mockSetOfCards));
    }

    @Test
    void should_get_player_name() {
	assertEquals("Tomas", dtoUnderTest.getPlayer().getName());
    }

    @Test
    void should_get_player_cards() {
	assertEquals(0, dtoUnderTest.getPlayer().getCards().size());
    }

    @Test
    void should_get_deck() {
	assertEquals(11, dtoUnderTest.getDeck().getCards().size());
    }
}
