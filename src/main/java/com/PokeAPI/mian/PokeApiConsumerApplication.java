package com.PokeAPI.mian;

import com.PokeAPI.mian.Models.PokemonList;
import com.PokeAPI.mian.services.ConsoleService;
import com.PokeAPI.mian.services.PokeService;

public class PokeApiConsumerApplication {
	ConsoleService cs = new ConsoleService();
	PokeService ps = new PokeService();


	public static void main(String[] args) {
		PokeApiConsumerApplication app = new PokeApiConsumerApplication();
		app.run();
	}

	private void run(){
		int userChoice = -1;
		while(userChoice != 0){
			cs.printOpeningMenu();
			userChoice = cs.getIntFromUser();
			if(userChoice == 1){
				selectPokemon();
			}else if(userChoice == 2){

			}else if(userChoice == 3){

			}else if(userChoice == 4){

			}else if(userChoice == 5){

			}
		}
	}

	private void selectPokemon(){
		PokemonList pokemon = ps.getNames();
		boolean goBack = false;
		while(!goBack) {
			System.out.println("Select a pokemon to continue or 'exit' to return to main menu");
			System.out.println("Enter 'edit' to change list length");
			System.out.println("Enter 'next' or 'previous' to navigate");
			int userChoice = -5;
			while(userChoice == -5 || userChoice >= pokemon.getPokemonList().length){
				cs.printPokemonList(pokemon.getPokemonList());
				userChoice = cs.selectPokemonChoice();
			}
			if(userChoice >= 0){

			}else if(userChoice == -1){

			}else if(userChoice == -2){
				pokemon = ps.getNames(pokemon.getNext());
			}else if(userChoice == -3){
				if(pokemon.getPrevious() != null) {
					pokemon = ps.getNames(pokemon.getPrevious());
				}else{
					System.out.println("Cannot go back");
				}
			}else if(userChoice == -4){
				goBack = true;
			}
		}
	}


}
