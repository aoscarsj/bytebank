import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("lorem2.txt"));
//		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		fw.write(System.lineSeparator()); metodo de system que retorna o caracter de quebra de linha, pois a depender do SO isso pode variar
		bw2.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw2.newLine();
		bw2.write("Teste");
		
//		bw.close();
		bw2.close();
//		fw.close();
		
	}

}
