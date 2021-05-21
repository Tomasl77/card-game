package fr.tlobgeois.api.services;

import java.util.Set;

import fr.tlobgeois.domain.dtos.SortCardDto;
import fr.tlobgeois.domain.dtos.StartingHandDto;
import fr.tlobgeois.domain.entities.Card;

public interface PlayerService {

    Set<Card> getStartingHand(StartingHandDto dto);

    Set<Card> sortCard(SortCardDto player);
}
