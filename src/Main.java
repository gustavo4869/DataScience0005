import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Abrir e fechar arquivo!");

		// Mostra o local do usuário onde está localizado o projeto
		System.out.println(System.getProperty("user.dir"));
		
		try {
			// Declara escritor de arquivo texto
			PrintWriter writer = new PrintWriter("dadosJava.txt", "UTF-8");
			
			int contador = 0;			
			do {
				writer.println(contador);
				contador++;
			}while(contador < 250);
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
