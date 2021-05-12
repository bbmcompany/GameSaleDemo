package gameIntro.core.concretes;

import gameIntro.core.abstracts.EDevletService;
import gameIntro.entities.concretes.User;
import gameIntro.jEdevlet.JEDevletManager;

public class JEDevletManagerAdapter implements EDevletService{

	@Override
	public void checkEDevlet(User user) {
		String identityNumber = user.getIdentityNumber();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		
		JEDevletManager jeDevletManager = new JEDevletManager();
		jeDevletManager.checkEdevlet(identityNumber, firstName, lastName);
		
	}
	

}
