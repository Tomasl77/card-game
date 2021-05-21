package fr.tlobgeois;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.tlobgeois.domain.entities.Card;
import fr.tlobgeois.domain.entities.Deck;
import fr.tlobgeois.domain.entities.Player;

@SpringBootApplication
public class CardGameApplication {

    public static void main(String[] args) {
	SpringApplication.run(CardGameApplication.class, args);
	Deck deck = new Deck();
	Player tomas = new Player("Tomas", new LinkedHashSet<>());
	System.out.println("Cards drawed by " + tomas.getName() + ": "
	        + tomas.drawStartingHand(deck));
	Set<Card> cardSorted = tomas.sortCards();
	System.out.println("Sorted cards: " + cardSorted);
    }
}
