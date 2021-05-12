package gameIntro.core.concretes;

import gameIntro.core.abstracts.CampaignService;
import gameIntro.entities.concretes.Game;

public class CampaignManager implements CampaignService{

	@Override
	public void makeDiscount(Game game, int discountAmount) {
		
		float newPrice = ((float)game.getPrice() - ((game.getPrice() * discountAmount) / 100));
		System.out.println(game.getName() + " artik " + newPrice + " TL.");
		
		
	}

	@Override
	public void doItFree(Game game, int duration) {
		System.out.println(game.getName() + " " + duration + " günlügüne bedava.");
		
	}

}
