package com.PokeAPI.mian.services;

import org.springframework.web.client.RestTemplate;

public class PokeService {
    private final String APIBASEURL = "https://pokeapi.co/api/v2/";
    private final RestTemplate template = new RestTemplate();

}
