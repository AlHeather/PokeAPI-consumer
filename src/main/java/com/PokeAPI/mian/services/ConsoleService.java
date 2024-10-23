package com.PokeAPI.mian.services;

import java.util.Scanner;

public class ConsoleService {
    private Scanner scanner = new Scanner(System.in);

    public int getIntFromUser(){
        boolean isValid = false;
        int result = -1;
        System.out.println("Enter a number");
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

}
