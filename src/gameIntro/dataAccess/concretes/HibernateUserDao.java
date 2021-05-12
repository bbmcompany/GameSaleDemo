package gameIntro.dataAccess.concretes;

import gameIntro.dataAccess.abstracts.UserDao;
import gameIntro.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : " + user.getFirstName());
		
	}

}
