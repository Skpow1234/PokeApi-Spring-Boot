package com.Pokemon.API.service;

import com.Pokemon.API.SOAP.client.PokeApiClient;
import com.Pokemon.API.model.entity.Pokemon;
import com.Pokemon.API.model.response.PokeApiResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokeApiClient pokeApiClient;

    public PokemonService(PokeApiClient pokeApiClient) {
        this.pokeApiClient = pokeApiClient;
    }

    public List<Pokemon> getPokemons(int page, int size) {
        int offset = (page - 1) * size;
        PokeApiResponse response = pokeApiClient.getPokemons(size, offset);
        return response.getResults();
    }
}