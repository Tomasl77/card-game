package fr.tlobgeois.domain.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.JunitTestConfig;

class PlayerDtoTest extends JunitTestConfig {

    private static PlayerDto playerDtoUnderTest;

    @BeforeAll
    static void set_up() {
	playerDtoUnderTest = new PlayerDto("Tomas", mockSetOfCards);
    }

    @Test
    void should_construct() {
	PlayerDto dtoUnderTest = new PlayerDto();
	assertNotNull(dtoUnderTest);
    }

    @Test
    void should_return_player_name() {
	assertEquals("Tomas", playerDtoUnderTest.getName());
    }

    @Test
    void should_return_player_card() {
	assertEquals(11, playerDtoUnderTest.getCards().size());
    }

    @Test
    void should_to_string() {
	assertTrue(playerDtoUnderTest.toString().startsWith("{name: "));
    }
}
