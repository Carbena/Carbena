package Concrete;

import Abstracts.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " sisteme eklenmiþtir!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " güncellenmiþtir!");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " ilinmiþtir!");
		
	}

}
