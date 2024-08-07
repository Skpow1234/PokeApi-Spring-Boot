package com.Pokemon.API.SOAP.endpoint;

import com.Pokemon.API.model.entity.Pokemon;
import com.Pokemon.API.service.PokemonService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
import java.util.stream.Collectors;

@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/pokemon";

    private final PokemonService pokemonService;

    public PokemonEndpoint(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPokemonsRequest")
    @ResponsePayload
    public GetPokemonsResponse getPokemons(@RequestPayload GetPokemonsRequest request) {
        GetPokemonsResponse response = new GetPokemonsResponse();
        List<Pokemon> pokemons = pokemonService.getPokemons(request.getPage(), request.getSize()).stream()
                .map(p -> {
                    Pokemon pokemon = new Pokemon();
                    pokemon.setName(p.getName());
                    pokemon.setUrl(p.getUrl());
                    return pokemon;
                })
                .collect(Collectors.toList());
        response.getPokemons().getPokemon().addAll(pokemons);
        return response;
    }
}
