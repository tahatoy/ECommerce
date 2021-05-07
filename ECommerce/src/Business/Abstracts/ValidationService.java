package Business.Abstracts;

import Entities.Concretes.User;

public interface ValidationService {
	boolean passwordValidator(User user);
	boolean nameValidator(User user);
	boolean emailIsVerify(User user);
	boolean checkEmail(User user,String email);
}
