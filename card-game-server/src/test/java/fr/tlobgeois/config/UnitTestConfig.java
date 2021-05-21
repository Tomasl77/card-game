package fr.tlobgeois.config;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import fr.tlobgeois.domain.entities.Card;
import fr.tlobgeois.domain.entities.Suit;
import fr.tlobgeois.domain.entities.Value;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UnitTestConfig {

    protected static Set<Card> mockSetOfCards = Stream.of(
            new Card(Suit.CLUB, Value.DEUCE), new Card(Suit.DIAMOND, Value.TEN),
            new Card(Suit.CLUB, Value.THREE), new Card(Suit.CLUB, Value.KING),
            new Card(Suit.SPADE, Value.DEUCE), new Card(Suit.HEART, Value.JACK),
            new Card(Suit.DIAMOND, Value.DEUCE),
            new Card(Suit.DIAMOND, Value.NINE),
            new Card(Suit.SPADE, Value.SEVEN), new Card(Suit.HEART, Value.FOUR),
            new Card(Suit.HEART, Value.ACE))
            .collect(Collectors.toCollection(LinkedHashSet::new));
}
