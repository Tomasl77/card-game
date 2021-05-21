package fr.tlobgeois.domain.entities;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.UnitTestConfig;

class SuitTest extends UnitTestConfig {

    private static Suit suitUnderTest;

    @BeforeAll
    static void setUp() throws Exception {
	suitUnderTest = Suit.DIAMOND;
    }

    @Test
    void should_test_greater_than() {
	assertTrue(suitUnderTest.isGreaterThan(Suit.HEART) > 0);
    }
}
