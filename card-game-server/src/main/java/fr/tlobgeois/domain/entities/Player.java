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

    private String name;

    private Set<Card> cards = new LinkedHashSet<>();

    protected Player() {
	// Protected constructor to ensure non-instantiability
    }

    public Player(String name, Set<Card> cards) {
	this.name = name;
	this.cards = cards;
    }

    public String getName() {
	return name;
    }

    public Set<Card> getCards() {
	return cards;
    }

    /**
     * Draw card until it reach the value defined.
     *
     * @param deck a {@code Deck} of {@code Card}.
     * @return a {@code Set} of {@code Card} representing the player's starting
     *         hand.
     */
    public Set<Card> drawStartingHand(Deck deck) {
	while (cards.size() < STARTING_HAND_SIZE) {
	    drawCard(deck);
	}
	return cards;
    }

    /**
     * Method to sort cards' a player get in hand. Comparator is defined in
     * subclass {@link fr.tlobgeois.domain.entities.Card#compareTo Card}.
     *
     * @return a {@code Set} of {@code Card} sorted.
     */
    public Set<Card> sortCards() {
	return cards.stream().sorted((o1, o2) -> o1.compareTo(o2))
	        .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private void drawCard(Deck deck) {
	cards.add(deck.drawCard());
    }

    @Override
    public String toString() {
	return "{player: " + name + ", cards: " + cards + "}";
    }
}
