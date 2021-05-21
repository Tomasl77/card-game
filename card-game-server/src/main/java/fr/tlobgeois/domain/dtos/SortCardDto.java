package fr.tlobgeois.domain.dtos;

import javax.validation.Valid;

public class SortCardDto {

    @Valid
    private PlayerDto player;

    protected SortCardDto() {
	// Empty constructor to ensure non-instanciability
    }

    public SortCardDto(PlayerDto player) {
	this.player = player;
    }

    public PlayerDto getPlayer() {
	return player;
    }
}
