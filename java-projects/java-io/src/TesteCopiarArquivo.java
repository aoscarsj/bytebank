import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// tambem funciona para rede, no caso de rede, se usa o socket, que e analogo ao fio do telefone, quem faz a comunicacao
//		Socket soc = new Socket();
//		soc.getInputStream() ;
//		soc.getOutputStream();
		//nao da para testar pq obviamente, precisa de outro pc e coisas a mais...
		
		//Fluxo de Entrada com Arquivo
		
		// ambos(Input e output) funcionam para as 3 formas de comunicacao, arquivo, rede e terminal!
		InputStream fis = /* soc.getInputStream(); */ /*System.in;*/ new FileInputStream("lorem.txt"); // pode ser a mais generica ou nao
		// caso deseje ler do teclado, basta alterar para System.in que a cada br.readLine(), ele lerá do teclado!
		Reader isr = new InputStreamReader(fis); 			// para esse tbm
		BufferedReader br = new BufferedReader(isr); 		// ele ehh um Reader, mas reader nao tem readLine, entao nao pode ser a mais generica!
		
		OutputStream fos = /* System.out; */ new FileOutputStream("lorem2.txt");
		//A mesma regra serve para saida no teclado, nao precisa de sysout(tbm funciona) e sim System.out
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		String linha = br.readLine();
		while(linha != null && !linha.isEmpty()) { // sgda cond para leitura do teclado.
			bw.write(linha);
			bw.newLine();
			bw.flush(); // para despejar a cada leitura. Sem isso, so despeja quando ocorrer o close
			linha = br.readLine();
		}
		
		br.close();
		bw.close(); // ele so escreve quando faz um close, ele fica guardando.
		
	}

}
