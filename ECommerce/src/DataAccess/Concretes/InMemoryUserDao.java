package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class InMemoryUserDao implements IUserDao {

	List<User> users=new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("Kullanıcı sisteme eklendi : " + user.getEmail());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı bilgileri güncellendi : " + user.getEmail());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı sistemden silindi : " + user.getEmail());

	}

	@Override
	public List<User> getAll() {
		return this.users;
	}


}	
