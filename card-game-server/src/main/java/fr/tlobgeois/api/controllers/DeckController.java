package fr.tlobgeois.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.tlobgeois.api.services.DeckService;
import fr.tlobgeois.domain.entities.Deck;

@RestController
@RequestMapping("/decks")
public class DeckController {

    protected final DeckService deckService;

    public DeckController(DeckService deckService) {
	this.deckService = deckService;
    }

    @GetMapping
    public Deck constructDeck() {
	return this.deckService.constructDeck();
    }
}
