import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		
		OutputStream fos = new FileOutputStream("lorem2.txt"); // pode ser a mais generica ou nao
		Writer osw = new OutputStreamWriter(fos); 			// para esse tbm
		BufferedWriter bw = new BufferedWriter(osw); 		// ele ehh um Reader, mas reader nao tem readLine, entao nao pode ser a mais generica!
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("hoeheiehueueu");
		
		
		bw.close();
		
	}

}
