package com.PokeAPI.mian.services;

import com.PokeAPI.mian.Models.NamedAPIResource;

import java.util.Scanner;

public class ConsoleService {
    private Scanner scanner = new Scanner(System.in);

    public int getIntFromUser(){
        boolean isValid = false;
        int result = -1;
        while(!isValid){
            try{
            result = Integer.parseInt(scanner.nextLine());
            if(result >= 0){
                isValid = true;
            }else {
                System.out.println("Enter a number greater or equal to 0");
            }
            } catch(NumberFormatException e) {
                System.out.println("Enter a whole number in digit form");
            }
        }
        return result;
    }

    public String getStringFromUser(){
        return scanner.nextLine();
    }

    public int selectPokemonChoice(){
        String choice =scanner.nextLine();
        try{
            return Integer.parseInt(choice);
        }catch(NumberFormatException e){
            if(choice.equals("edit")){
                return -1;
            }
            if(choice.equals("next")){
                return -2;
            }
            if(choice.equals("previous")){
                return -3;
            }
            if(choice.equals("exit")){
                return -4;
            }
        }
        return -5;
    }

    public void printPokemonList(NamedAPIResource[] pokemonList){
        for(int i = 0; i < pokemonList.length; i++){
            System.out.println(i+". "+pokemonList[i].getName());
        }
    }

    public void printOpeningMenu(){
        System.out.println("Welcome to the Pokemon Finder 2000");
        System.out.println("Please enter a value to continue");
        System.out.println("1. Show list of Pokemon");
        System.out.println("2. Find Pokemon By type(s)");
        System.out.println("3. Find Pokemon by species");
        System.out.println("4. Find Pokemon by learned move(s)");
        System.out.println("5. Find Pokemon by egg group");
        System.out.println("0. To Quit");
    }

}
