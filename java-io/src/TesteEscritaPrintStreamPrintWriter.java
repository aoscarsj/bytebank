import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		
		long inicio = System.currentTimeMillis(); // devolve o tempo corrido em ms desde 1/01/1970
		//Fluxo de Entrada com Arquivo
//		PrintStream ps = new PrintStream("lorem2.txt");
//		ps.println("Testando PrintStream!");
//		ps.print("testeee");
//		
//		ps.close();

		
		//PrintWriter
		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.write("Printando no arquivo com o metodo write!");
		pw.println();
		pw.println("Printando com o println");
		
		
		pw.close();
		
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execucao em ms: " + (fim - inicio));
	}

}
