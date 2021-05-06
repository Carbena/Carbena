package Concrete;

import Abstracts.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " sisteme eklenmi�tir!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " g�ncellenmi�tir!");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " ilinmi�tir!");
		
	}

}
