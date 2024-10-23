package com.PokeAPI.mian.services;

import com.PokeAPI.mian.Models.PokemonList;
import org.springframework.web.client.RestTemplate;

public class PokeService {
    private final String APIBASEURL = "https://pokeapi.co/api/v2/";
    private final RestTemplate template = new RestTemplate();

    public PokemonList getNames(){
            return template.getForObject(APIBASEURL + "pokemon/", PokemonList.class);
    }

    public PokemonList getNames(String url){
        return template.getForObject(url, PokemonList.class);
    }

}
