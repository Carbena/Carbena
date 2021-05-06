package Abstracts;

import Entity.Campaign;
import Entity.Game;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void addToGame(Campaign campaign,Game game);

}
