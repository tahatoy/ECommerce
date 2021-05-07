package Business.Abstracts;

import Entities.Concretes.User;

public interface UserService {
	void register(User user);
	void login(User user,String mail,String password);
	
}
