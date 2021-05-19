package fr.tlobgeois.domain.entities;

/**
 * A representation of a {@code Card}.
 * <p>
 * Invarients are :
 * <ul>
 * <li>{@code Suit}</li>
 * <li>{@code Value}</li>
 * </ul>
 *
 * @author Tomas LOBGEOIS
 *
 */
public class Card implements Comparable<Card> {

    private final Suit suit;

    private final Value value;

    public Card(Suit suit, Value value) {
	this.suit = suit;
	this.value = value;
    }

    @Override
    public String toString() {
	return value + " of " + suit;
    }

    /**
     * Method to compare if a card is before or after another. It first compare
     * {@code Suit} (Heart, Diamond, Spade, Club) then {@code Value} (from ace
     * to king)
     */
    @Override
    public int compareTo(Card other) {
	if (other == null) {
	    return 1;
	}
	if (this.suit != other.suit) {
	    return this.suit.isGreaterThan(other.suit);
	}
	return this.value.isGreaterThan(other.value);
    }
}
