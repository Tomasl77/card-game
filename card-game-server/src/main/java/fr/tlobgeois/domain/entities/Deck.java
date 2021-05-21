package fr.tlobgeois.domain.entities;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import fr.tlobgeois.commons.exceptions.NoCardInDeckException;

/**
 * A representation of a {@code Deck} of card.
 * <p>
 * Invarients are :
 * <ul>
 * <li>{@code Set} of cards</li>
 * </ul>
 *
 * @author Tomas LOBGEOIS
 *
 */
public class Deck {

    private Set<Card> cards;

    public Deck() {
	this.cards = buildNewDeck();
    }

    public Set<Card> getCards() {
	return cards;
    }

    public Card drawCard() {
	Card cardDrawn = cards.stream().skip(pickRandomCard()).findFirst()
	        .get();
	cards.remove(cardDrawn);
	return cardDrawn;
    }

    /**
     * Choose a random card into the deck depending on it's size.
     *
     * @throws {@code NoCardInDeckException} if deck size <= 0.
     * @return a {@code int} representing the card's position into deck.
     */
    private int pickRandomCard() {
	try {
	    return new Random().nextInt(cards.size());
	} catch (IllegalArgumentException exception) {
	    throw new NoCardInDeckException();
	}
    }

    /**
     * Build a deck of cards when a new deck is instanciated
     *
     * @return a {@code Set} of {@code Card}
     */
    private Set<Card> buildNewDeck() {
	Set<Card> decks = new HashSet<>();
	for (Suit suit : Suit.values()) {
	    for (Value value : Value.values()) {
		decks.add(new Card(suit, value));
	    }
	}
	return decks;
    }

    @Override
    public String toString() {
	return "Deck : {" + cards + "}";
    }
}
