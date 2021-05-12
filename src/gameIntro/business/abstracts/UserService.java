package gameIntro.business.abstracts;

import gameIntro.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	

}
