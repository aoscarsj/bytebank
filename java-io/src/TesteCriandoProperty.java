import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteCriandoProperty {
	
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.setProperty("login", "alura");
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		
		props.store(new FileWriter("conf.properties"), "algum comentário");
		//arquivo criado dentro de 'java-io'
	}
}
