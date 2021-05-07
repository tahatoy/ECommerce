package Business.Concretes;

import Business.Abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send() {
		System.out.println("Do�rulama postas� g�nderilmi�tir.");
		
	}

	@Override
	public void verify() {
		System.out.println("Kullan�c� do�ruland�. Uyeliginiz basariyla tamamlanmistir.");
		
	}

}
