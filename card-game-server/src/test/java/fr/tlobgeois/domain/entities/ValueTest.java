package fr.tlobgeois.domain.entities;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.tlobgeois.config.UnitTestConfig;

class ValueTest extends UnitTestConfig {

    private static Value valueUnderTest;

    @BeforeAll
    static void setUp() throws Exception {
	valueUnderTest = Value.FIVE;
    }

    @Test
    void should_test_greater_than() {
	assertTrue(valueUnderTest.isGreaterThan(Value.NINE) < 0);
    }
}
