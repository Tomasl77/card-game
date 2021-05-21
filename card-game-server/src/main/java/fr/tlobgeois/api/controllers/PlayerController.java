package fr.tlobgeois.api.controllers;

import java.util.Set;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.tlobgeois.api.services.PlayerService;
import fr.tlobgeois.domain.dtos.SortCardDto;
import fr.tlobgeois.domain.dtos.StartingHandDto;
import fr.tlobgeois.domain.entities.Card;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
	this.playerService = playerService;
    }

    @PostMapping
    public Set<Card> getStartingHand(@RequestBody StartingHandDto dto) {
	return this.playerService.getStartingHand(dto);
    }

    @PostMapping("/sort")
    public Set<Card> sortCard(@RequestBody SortCardDto player) {
	return this.playerService.sortCard(player);
    }
}
