package fr.tlobgeois.domain.dtos;

import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import fr.tlobgeois.domain.entities.Card;

public class DeckDto {

    @NotEmpty
    @Size(min = 0)
    private Set<Card> cards;

    protected DeckDto() {
	// Empty constructor to ensure non-instantiability
    }

    public DeckDto(Set<Card> cards) {
	this.cards = cards;
    }

    public Set<Card> getCards() {
	return cards;
    }
}
