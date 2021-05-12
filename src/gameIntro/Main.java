package gameIntro;

import gameIntro.business.abstracts.GameService;
import gameIntro.business.abstracts.UserService;
import gameIntro.business.concretes.GameManager;
import gameIntro.business.concretes.UserManager;
import gameIntro.core.abstracts.CampaignService;
import gameIntro.core.concretes.CampaignManager;
import gameIntro.core.concretes.JEDevletManagerAdapter;
import gameIntro.dataAccess.concretes.HibernateGameDao;
import gameIntro.dataAccess.concretes.HibernateUserDao;
import gameIntro.entities.concretes.Game;
import gameIntro.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		GameService gameService = new GameManager(new HibernateGameDao());
		UserService userService = new UserManager(new HibernateUserDao(), new JEDevletManagerAdapter());
		CampaignService campaignService = new CampaignManager();
		
		Game game = new Game();
		game.setDeveloper("BBM");
		game.setId(1);
		game.setName("Formula 1");
		game.setPrice(80);
		game.setPublisher("EA Games");
		game.setReleaseDate("11 10 2001");
		
		Game game01 = new Game();
		game01.setDeveloper("ZEYNEP");
		game01.setId(2);
		game01.setName("Sims City");
		game01.setPrice(90);
		game01.setPublisher("EA Games");
		game01.setReleaseDate("27 05 2001");
		
		gameService.add(game);
		
		User user = new User();
		user.setBirthDay("01 05 2001");
		user.setFirstName("Baris");
		user.setLastName("Malkoc");
		user.setUserName("BBM5764");
		user.setIdentityNumber("75689542153");
		
		userService.add(user);
		
		campaignService.doItFree(game01, 5);
		campaignService.makeDiscount(game, 20);
		
		

		
	}

}
