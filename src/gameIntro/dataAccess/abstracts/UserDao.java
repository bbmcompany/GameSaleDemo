package gameIntro.dataAccess.abstracts;

import gameIntro.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	

}
