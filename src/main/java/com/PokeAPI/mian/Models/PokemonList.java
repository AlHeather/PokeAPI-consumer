package com.PokeAPI.mian.Models;

public class PokemonList {
    private int count;
    private String next;
    private String previous;
    private NamedAPIResource[] results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public NamedAPIResource[] getPokemonList() {
        return results;
    }

    public void setResults(NamedAPIResource[] results) {
        this.results = results;
    }
}
