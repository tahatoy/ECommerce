package Core;

import Entities.Concretes.User;
import GoogleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService{
	
	private GoogleAuthManager googleAuthManager;
	
	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		super();
		this.googleAuthManager = googleAuthManager;
	}

	@Override
	public void registerWithGoogle(User user) {
		googleAuthManager.registerWithGoogle(user);
		
	}

	@Override
	public void loginWithGoogle(User user) {
		googleAuthManager.loginWithGoogle(user);
		
	}

}
