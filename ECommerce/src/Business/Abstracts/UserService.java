package Business.Abstracts;

import java.util.List;

import Entities.Concretes.User;


public interface UserService {
	void register(User user);
	void login(User user,String email,String password);
	List<User> getUsers();
	void getUser(String email);
	
}
