package Core;

import Entities.Concretes.User;

public interface GoogleAuthService {
	void registerWithGoogle(User user);
	void loginWithGoogle(User user);
}
