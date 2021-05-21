package fr.tlobgeois.commons.exceptions;

@SuppressWarnings("serial")
public class NoCardInDeckException extends RuntimeException {

    public NoCardInDeckException() {
	super("No more cards in deck");
    }
}
