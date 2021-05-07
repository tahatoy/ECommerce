package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface IUserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	
	
	
}
