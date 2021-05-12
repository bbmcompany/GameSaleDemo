package gameIntro.business.concretes;

import gameIntro.business.abstracts.UserService;
import gameIntro.core.abstracts.EDevletService;
import gameIntro.dataAccess.abstracts.UserDao;
import gameIntro.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EDevletService eDevletService;
	
	public UserManager(UserDao userDao, EDevletService eDevletService) {
		this.userDao = userDao;
		this.eDevletService = eDevletService;
	}

	@Override
	public void add(User user) {
		if(user.getFirstName().length() > 3) {
			if(user.getLastName().length() > 2) {
				if(user.getIdentityNumber().length() == 11) {
					userDao.add(user);
					eDevletService.checkEDevlet(user);
					
				}
			}
		}else {
			System.out.println("Lütfen bilgilerinizi kontrol ediniz...");
			return;
		}
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}
	

}
