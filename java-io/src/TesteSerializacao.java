import java.io.*;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Serialização
//		String nome = "Artur Oscar Júnior";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto2.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		//Desserialização
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//		String nome = (String)ois.readObject();
//		ois.close();
//		System.out.println(nome);

		Cliente cliente = new Cliente();
		cliente.setNome("Artur Oscar");
		cliente.setProfissao("Dev");
		cliente.setCpf("15476789621");

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-io/cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-io/cliente.bin"));
		Cliente c1 = (Cliente)ois.readObject();
		ois.close();
		System.out.println(c1.getCpf());

		
	}

}
