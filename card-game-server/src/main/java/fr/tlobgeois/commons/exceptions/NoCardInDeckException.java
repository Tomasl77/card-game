package fr.tlobgeois.commons.exceptions;

@SuppressWarnings("serial")
public class NoCardInDeckException extends RuntimeException {

    public NoCardInDeckException(String message) {
	super(message);
    }
}
