package GoogleAuth;

import Core.GoogleAuthService;
import Entities.Concretes.User;

public class GoogleAuthManager implements GoogleAuthService {

	@Override
	public void registerWithGoogle(User user) {
		System.out.println("Kullan�c� google ile ba�ar�yla kay�t oldu: "+ user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void loginWithGoogle(User user) {
	   System.out.println("Kullan�c� sisteme google iile giri� yapt�: "+ user.getFirstName()+" "+user.getLastName());
		
	}

}
