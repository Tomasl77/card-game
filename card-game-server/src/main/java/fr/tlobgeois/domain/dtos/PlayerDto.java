package fr.tlobgeois.domain.dtos;

import java.util.Set;

import fr.tlobgeois.domain.entities.Card;

public class PlayerDto {

    private String name;

    private Set<Card> cards;

    protected PlayerDto() {
	// Empty controller to ensure non-instanciability
    }

    public PlayerDto(String name, Set<Card> cards) {
	this.name = name;
	this.cards = cards;
    }

    public String getName() {
	return name;
    }

    public Set<Card> getCards() {
	return cards;
    }
}
