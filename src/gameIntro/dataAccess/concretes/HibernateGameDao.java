package gameIntro.dataAccess.concretes;

import java.util.List;

import gameIntro.dataAccess.abstracts.GameDao;
import gameIntro.entities.concretes.Game;

public class HibernateGameDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("Hibernate ile eklendi : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Hibernate ile güncellendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Hibernate ile silindi : " + game.getName());
		
	}

	@Override
	public Game get(int id) {
		
		return null;
	}

	@Override
	public List<Game> getAll() {

		return null;
	}

}
