package fr.tlobgeois.domain.dtos;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.tlobgeois.domain.entities.Card;

public class PlayerDto {

    @NotBlank
    private String name;

    @Size(min = 0)
    private Set<Card> cards = new LinkedHashSet<>();

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

    @Override
    public String toString() {
	return "{name: " + name + ", cards: " + cards + "}";
    }
}
