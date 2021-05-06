package Concrete;

import Abstracts.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " sisteme eklenmiştir!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " güncellenmiştir!");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " ilinmiştir!");
		
	}

}
