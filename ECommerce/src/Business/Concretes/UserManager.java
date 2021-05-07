package Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import Business.Abstracts.UserService;
import Business.Abstracts.ValidationService;
import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {
	
	private IUserDao userDao;
	private ValidationService validationService;
	
	private ArrayList<String> eMailList=new ArrayList<String>();
	
	public UserManager(IUserDao userDao, ValidationService validationService) {
		super();
		this.userDao = userDao;
		this.validationService = validationService;
	}


	@Override
	public void register(User user) {
		if(validationService.emailIsVerify(user)==true 
				&& validationService.nameValidator(user)==true 
				&& validationService.passwordValidator(user)==true
				&& eMailList.contains(user.getEmail())==false)
		{
			System.out.println("Email ve þifreniz onaylandý.");
			eMailList.add(user.getEmail());
			userDao.add(user);
		}
		else {
			System.out.println("Lütfen email e þifrenizi kontrol ediniz.");
				if( eMailList.contains(user.getEmail())==true)
				System.out.println("Bu e-postaya sahip kullanýcý mevcuttur.");
		}
	}


	@Override
	public void login(User user, String email, String password) {
		if(email==user.getEmail() && password==user.getPassword()) {
			System.out.println("Sisteme baþarýyla giriþ yapýldý.");
		}
		else
			System.out.println("Hatalý kullanýcý adý ve þifre!");
		
	}


	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void getUser(String email) {
		// TODO Auto-generated method stub
		
	}

	

}
