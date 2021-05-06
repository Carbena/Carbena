package Concrete;

import Abstracts.SalesService;
import Entity.Game;
import Entity.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " þu oyunu satýn aldý : "+ game.getName() + " Fiyatý: " + game.getPrice());
		
	}

}
