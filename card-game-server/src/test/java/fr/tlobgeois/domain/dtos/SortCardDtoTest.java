package fr.tlobgeois.domain.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.UnitTestConfig;

class SortCardDtoTest extends UnitTestConfig {

    private static SortCardDto cardDtoUnderTest;

    @BeforeAll
    static void set_up() {
	cardDtoUnderTest = new SortCardDto(
	        new PlayerDto("Tomas", mockSetOfCards));
    }

    @Test
    void should_return_player_name() {
	assertEquals("Tomas", cardDtoUnderTest.getPlayer().getName());
    }
}
