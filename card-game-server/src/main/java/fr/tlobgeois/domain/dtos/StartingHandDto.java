package fr.tlobgeois.domain.dtos;

public class StartingHandDto {

    private final PlayerDto player;

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
