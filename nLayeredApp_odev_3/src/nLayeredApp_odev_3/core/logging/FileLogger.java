package nLayeredApp_odev_3.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : "+data);
	}

}
