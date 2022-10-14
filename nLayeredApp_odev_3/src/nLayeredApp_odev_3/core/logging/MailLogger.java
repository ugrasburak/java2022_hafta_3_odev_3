package nLayeredApp_odev_3.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail gönderildi : "+data);
	}

}
