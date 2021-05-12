package gameIntro.business.concretes;

import gameIntro.business.abstracts.GameService;
import gameIntro.dataAccess.abstracts.GameDao;
import gameIntro.entities.concretes.Game;

public class GameManager implements GameService{
	
	private GameDao gameDao;
	

	public GameManager(GameDao gameDao) {
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		if(game.getPrice() > 100) {
			System.out.println("Oyun kullanicilar icin cok pahali...");
			return;
		}
		
		gameDao.add(game);
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}
	

}
