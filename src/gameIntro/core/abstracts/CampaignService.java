package gameIntro.core.abstracts;

import gameIntro.entities.concretes.Game;

public interface CampaignService {
	void makeDiscount(Game game, int discountAmount);
	void doItFree(Game game, int duration);

}
