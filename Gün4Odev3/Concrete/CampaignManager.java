package Concrete;

import Abstracts.CampaignService;
import Entity.Campaign;
import Entity.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya olu�turuldu : " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi!");
		
	}

	@Override
	public void addToGame(Campaign campaign, Game game) {
		game.setPrice(game.getPrice()-(game.getPrice()/100)*campaign.getDiscount());
		
	}

}
