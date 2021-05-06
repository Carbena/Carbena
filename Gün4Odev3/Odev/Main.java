package Odev;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class Main {
	
	public static void main(String[] args) {
		
		Game game = new Game("PUBG",150.00);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Gamer gamer = new Gamer("123","alp","ayd","1998");
		Gamer gamer2 = new Gamer("1234","alpaslan","ayd","1990");
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		gamerManager.add(gamer2);
		
		SalesManager salesManager = new SalesManager();
		salesManager.buy(game, gamer);
		
		Campaign campaign = new Campaign("Pazar indirimi",52);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.addToGame(campaign, game);
		
		salesManager.buy(game, gamer2);
		

	}

}