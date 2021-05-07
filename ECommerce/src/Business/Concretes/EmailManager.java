package Business.Concretes;

import Business.Abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send() {
		System.out.println("Doðrulama postasý gönderilmiþtir.");
		
	}

	@Override
	public void verify() {
		System.out.println("Kullanýcý doðrulandý. Uyeliginiz basariyla tamamlanmistir.");
		
	}

}
