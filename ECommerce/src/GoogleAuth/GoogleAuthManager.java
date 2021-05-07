package GoogleAuth;

import Core.GoogleAuthService;
import Entities.Concretes.User;

public class GoogleAuthManager implements GoogleAuthService {

	@Override
	public void registerWithGoogle(User user) {
		System.out.println("Kullanýcý google ile baþarýyla kayýt oldu: "+ user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void loginWithGoogle(User user) {
	   System.out.println("Kullanýcý sisteme google iile giriþ yaptý: "+ user.getFirstName()+" "+user.getLastName());
		
	}

}
