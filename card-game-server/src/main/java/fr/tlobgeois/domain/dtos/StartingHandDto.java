package fr.tlobgeois.domain.dtos;

import java.util.Set;

import fr.tlobgeois.domain.entities.Card;
import fr.tlobgeois.domain.entities.Deck;
import fr.tlobgeois.domain.entities.Player;

public class StartingHandDto {

    private final Player player;

    private final Deck deck;

    public StartingHandDto(Player player, Deck deck) {
	this.player = player;
	this.deck = deck;
    }

    public String getPlayerName() {
	return player.getName();
    }

    public Set<Card> getCardFromDeck() {
	return player.drawStartingHand(deck);
    }

    public Player getPlayer() {
	return player;
    }

    public Deck getDeck() {
	return deck;
    }
}
