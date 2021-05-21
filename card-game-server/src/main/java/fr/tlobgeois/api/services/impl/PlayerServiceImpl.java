package fr.tlobgeois.api.services.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.tlobgeois.api.services.AbstractService;
import fr.tlobgeois.api.services.PlayerService;
import fr.tlobgeois.domain.dtos.SortCardDto;
import fr.tlobgeois.domain.dtos.StartingHandDto;
import fr.tlobgeois.domain.entities.Card;
import fr.tlobgeois.domain.entities.Player;

@Service
public class PlayerServiceImpl extends AbstractService
        implements PlayerService {

    @Override
    public Set<Card> getStartingHand(StartingHandDto dto) {
	return dto.getCardFromDeck();
    }

    @Override
    public Set<Card> sortCard(SortCardDto dto) {
	Player player = dtoConvert(dto.getPlayer(), Player.class);
	return player.sortCards();
    }
}
