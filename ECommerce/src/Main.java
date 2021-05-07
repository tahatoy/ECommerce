import Business.Abstracts.EmailService;
import Business.Abstracts.UserService;
import Business.Concretes.EmailManager;
import Business.Concretes.UserManager;
import Business.Concretes.ValidationManager;
import Core.GoogleAuthService;
import DataAccess.Concretes.InMemoryUserDao;
import Entities.Concretes.User;
import GoogleAuth.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
			User taha=new User(1,"Taha","Toy","taha@taha.com","1234567");

			UserService userService = new UserManager(new InMemoryUserDao(), new ValidationManager());
			userService.register(taha);
			
			EmailService eMailService=new EmailManager();
			eMailService.send();
			eMailService.verify();
			
			System.out.println();
			System.out.println("-----------------------");
			System.out.println();
			
			GoogleAuthService googleAuthService=new GoogleAuthManager();
			googleAuthService.registerWithGoogle(taha);
			googleAuthService.loginWithGoogle(taha);
	//------------------------------------------------------------------------------------------------------
			System.out.println("------------------------");
			
			User oguzhan=new User(2,"Oguzhan","Ozturk","oguzhannoguzhan.com","123456789");//@ kullanmadýðýmýz için hata vericek
			userService.register(oguzhan);
			
			EmailService eMailService2=new EmailManager();
			eMailService2.send();
			
	
			
			
			
	}

}
