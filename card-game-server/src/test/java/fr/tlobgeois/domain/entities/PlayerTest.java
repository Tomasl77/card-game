package fr.tlobgeois.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.UnitTestConfig;

class PlayerTest extends UnitTestConfig {

    private static Player playerUnderTest;

    @BeforeAll
    static void setUp() throws Exception {
	playerUnderTest = new Player("Tomas", mockSetOfCards);
    }

    @Test
    void should_return_sorted_cards() {
	Set<Card> actual = playerUnderTest.sortCards();
	assertEquals(
	        "[ACE of HEART, FOUR of HEART, "
	                + "JACK of HEART, DEUCE of DIAMOND, "
	                + "NINE of DIAMOND, TEN of DIAMOND, "
	                + "DEUCE of SPADE, SEVEN of SPADE, "
	                + "DEUCE of CLUB, THREE of CLUB, KING of CLUB]",
	        actual.toString());
    }

    @Test
    void should_draw_starting_hand() {
	Player player = new Player();
	Set<Card> actual = player.drawStartingHand(new Deck());
	assertEquals(10, actual.size());
    }

    @Test
    void should_get_player_name() {
	assertEquals("Tomas", playerUnderTest.getName());
    }

    @Test
    void should_get_player_cards() {
	assertEquals(11, playerUnderTest.getCards().size());
    }

    @Test
    void should_to_string() {
	assertEquals(
	        "{player: Tomas, cards: [DEUCE of CLUB, "
	                + "TEN of DIAMOND, THREE of CLUB, KING of CLUB, "
	                + "DEUCE of SPADE, JACK of HEART, DEUCE of DIAMOND, "
	                + "NINE of DIAMOND, SEVEN of SPADE, "
	                + "FOUR of HEART, ACE of HEART]" + "}",
	        playerUnderTest.toString());
    }
}
