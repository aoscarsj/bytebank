import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		
		InputStream fis = new FileInputStream("lorem.txt"); // pode ser a mais generica ou nao
		Reader isr = new InputStreamReader(fis); 			// para esse tbm
		BufferedReader br = new BufferedReader(isr); 		// ele ehh um Reader, mas reader nao tem readLine, entao nao pode ser a mais generica!
		
		String linha = br.readLine();
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
	}

}
