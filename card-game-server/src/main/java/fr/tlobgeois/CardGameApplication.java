package fr.tlobgeois;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardGameApplication {

    public static void main(String[] args) {
	SpringApplication.run(CardGameApplication.class, args);
	/*
	 * Deck deck = new Deck(); Player tomas = new Player("Tomas");
	 * System.out.println("Cards drawed by " + tomas.getName() + ": " +
	 * tomas.getCards(deck)); Set<Card> test = tomas.sortCards();
	 * System.out.println(test);
	 */
    }
}
