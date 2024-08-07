package com.Pokemon.API.SOAP.client;

import com.Pokemon.API.model.response.PokeApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2")
public interface PokeApiClient {

    @GetMapping("/pokemon")
    PokeApiResponse getPokemons(@RequestParam("limit") int limit, @RequestParam("offset") int offset);
}
