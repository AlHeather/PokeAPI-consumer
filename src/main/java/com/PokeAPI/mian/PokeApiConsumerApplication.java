package com.PokeAPI.mian;

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
		System.out.println(cs.getIntFromUser());
	}

}
