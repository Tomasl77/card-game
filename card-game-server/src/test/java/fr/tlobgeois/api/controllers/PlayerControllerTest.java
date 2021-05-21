package fr.tlobgeois.api.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;

import fr.tlobgeois.config.IntegrationTestConfig;

class PlayerControllerTest extends IntegrationTestConfig {

    @Value("${mock.path.players}")
    private String path;

    @ParameterizedTest
    @CsvFileSource(resources = "/playercontroller/startinghand.csv", delimiterString = DELIMITER, numLinesToSkip = 1)
    void should_get_starting_hand(String json) throws Exception {
	api.perform(post(path).contentType(MediaType.APPLICATION_JSON)
	        .content(json)).andExpect(status().isOk())
	        .andExpect(jsonPath("$.length()", is(10)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/playercontroller/sorthand.csv", delimiterString = DELIMITER, numLinesToSkip = 1)
    void should_sort_hand(String json) throws Exception {
	api.perform(post(path + "/sort").contentType(MediaType.APPLICATION_JSON)
	        .content(json)).andExpect(status().isOk());
    }
}
