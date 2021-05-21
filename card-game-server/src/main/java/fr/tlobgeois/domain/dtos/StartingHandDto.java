package fr.tlobgeois.domain.dtos;

import javax.validation.Valid;

public class StartingHandDto {

    @Valid
    private final PlayerDto player;

    @Valid
    private final DeckDto deck;

    public StartingHandDto(PlayerDto player, DeckDto deck) {
	this.player = player;
	this.deck = deck;
    }

    public PlayerDto getPlayer() {
	return player;
    }

    public DeckDto getDeck() {
	return deck;
    }
}
