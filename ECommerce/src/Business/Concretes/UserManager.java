package Business.Concretes;

import Business.Abstracts.UserService;
import Business.Abstracts.ValidationService;
import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {
	
	private IUserDao userDao;
	private ValidationService validationService;
	
	
	public UserManager(IUserDao userDao, ValidationService validationService) {
		super();
		this.userDao = userDao;
		this.validationService = validationService;
	}


	@Override
	public void register(User user) {
		if(validationService.emailIsVerify(user)==true 
				&& validationService.nameValidator(user)==true 
				&& validationService.passwordValidator(user)==true) {
			System.out.println("Email ve �ifreniz onayland�.");
			userDao.add(user);
		}
		else 
			System.out.println("L�tfen email e �ifrenizi kontrol ediniz.");
		
	}


	@Override
	public void login(User user, String mail, String password) {
		if(mail==user.getEmail() && password==user.getPassword()) {
			System.out.println("Sisteme ba�ar�yla giri� yap�ld�.");
		}
		else
			System.out.println("Hatal� kullan�c� ad� ve �ifre!");
		
	}

	

}
