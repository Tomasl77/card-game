package fr.tlobgeois.domain.dtos;

public class SortCardDto {

    private PlayerDto player;

    public SortCardDto(PlayerDto player) {
	this.player = player;
    }

    public PlayerDto getPlayer() {
	return player;
    }
}
