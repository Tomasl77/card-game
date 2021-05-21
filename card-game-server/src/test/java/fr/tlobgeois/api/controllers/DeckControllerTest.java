package fr.tlobgeois.api.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import fr.tlobgeois.config.IntegrationTestConfig;

class DeckControllerTest extends IntegrationTestConfig {

    @Value("${mock.path.decks}")
    private String path;

    @Test
    void should_get_deck() throws Exception {
	api.perform(get(path)).andExpect(status().isOk())
	        .andExpect(jsonPath("$.cards.length()", is(52)));
    }
}
