package fr.tlobgeois.domain.entities;

/**
 * A representation of a {@code Suit} from a card game.
 * <p>
 * Invarients are :
 * <ul>
 * <li>Heart</li>
 * <li>Diamond</li>
 * <li>Spade</li>
 * <li>Club</li>
 * </ul>
 *
 * @author Tomas LOBGEOIS
 *
 */
public enum Suit {

    HEART(1), DIAMOND(2), SPADE(3), CLUB(4);

    private final int position;

    Suit(int position) {
	this.position = position;
    }

    /**
     * Method to check if a {@code Suit} is greater than an other {@code Suit}.
     * Purpose is to not rely on {@link java.lang.Enum#compareTo compareTo} from
     * Enum, which rely on ordinal.
     *
     * @param other the suit to compare
     * @return the result of comparaison
     */
    public int isGreaterThan(Suit other) {
	return this.position - other.position;
    }
}
