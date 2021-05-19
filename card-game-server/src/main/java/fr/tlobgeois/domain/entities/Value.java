package fr.tlobgeois.domain.entities;

/**
 * A representation of a {@code Value} from a card game.
 * </p>
 * Invarients are :
 * <ul>
 * <li>Ace</li>
 * <li>number from 2 to 10</li>
 * <li>Jack</li>
 * <li>Queen</li>
 * <li>King</li>
 * </ul>
 *
 * @author Tomas LOBGEOIS
 *
 */
public enum Value {

    ACE(1), DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
    NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private final int position;

    Value(int position) {
	this.position = position;
    }

    /**
     * Method to check if a {@code Value} is greater than an other
     * {@code Value}. Purpose is to not rely on {@link java.lang.Enum#compareTo
     * compareTo} from Enum, which rely on ordinal.
     *
     * @param other the value to compare
     * @return the result of comparaison
     */
    public int isGreaterThan(Value other) {
	return this.position - other.position;
    }
}
