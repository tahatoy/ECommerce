package Business.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.Abstracts.ValidationService;
import Entities.Concretes.User;

public class ValidationManager implements ValidationService {

	
	@Override
	public boolean passwordValidator(User user) {
		if(user.getPassword().length()>6) 
			return true;
			
		else
			return false;
	}

	@Override
	public boolean nameValidator(User user) {
		if(user.getFirstName().length()>2 && user.getLastName().length()>2)
			return true;
		else
			return false;
	}

	@Override
	public boolean emailIsVerify(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if (matcher.matches() == true) 
			return true;
		else
			return false;
	
	}

	@Override
	public boolean checkEmail(User user, String email) {
		// TODO Auto-generated method stub
		return false;
	}


}
