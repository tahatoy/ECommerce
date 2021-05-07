package Business.Concretes;

import Business.Abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send() {
		System.out.println("Doğrulama postası gönderilmiştir.");
		
	}

	@Override
	public void verify() {
		System.out.println("Kullanıcı doğrulandı. Uyeliginiz basariyla tamamlanmistir.");
		
	}

}
