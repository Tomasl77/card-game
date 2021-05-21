package fr.tlobgeois.api.services.impl;

import org.springframework.stereotype.Service;

import fr.tlobgeois.api.services.DeckService;
import fr.tlobgeois.domain.entities.Deck;

@Service
public class DeckServiceImpl implements DeckService {

    @Override
    public Deck constructDeck() {
	return new Deck();
    }
}
