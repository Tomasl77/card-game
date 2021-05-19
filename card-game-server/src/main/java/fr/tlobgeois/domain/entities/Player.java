package fr.tlobgeois.domain.entities;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * A representation of a {@code Player}.
 * <p>
 * A player always draw 10 cards from the {@code Deck}
 *
 * @author Tomas LOBGEOIS
 *
 */
public class Player {

    private static final int STARTING_HAND_SIZE = 10;

    private final String name;

    private Set<Card> cards = new LinkedHashSet<>();

    public Player(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public Set<Card> getCards(Deck deck) {
	while (cards.size() < STARTING_HAND_SIZE) {
	    drawCards(deck);
	}
	return cards;
    }

    public Set<Card> sortCards() {
	return cards.stream().sorted((o1, o2) -> o1.compareTo(o2))
	        .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private void drawCards(Deck deck) {
	cards.add(deck.drawCard());
    }
}
