import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		//Fluxo de Entrada com Arquivo
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); //para usar as regras norte americanas, pois se usar do BR, o double aqui eh separado por virgula => vai da pau, US double eh separado por ponto. o CSV ta com ponto
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR"),"%s - %04d-%08d, %18s: %08.2f%n", tipoConta, agencia, numero, titular, saldo);
			
			linhaScanner.close();
		}
		
		scanner.close();
		
	}

}
