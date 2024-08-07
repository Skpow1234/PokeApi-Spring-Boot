package com.Pokemon.API.controller;

import com.Pokemon.API.model.entity.Pokemon;
import com.Pokemon.API.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> getPokemons(@RequestParam int page, @RequestParam int size) {
        return ResponseEntity.ok(pokemonService.getPokemons(page, size));
    }
}
