package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		Escribiendo accede_es = new Escribiendo();

		accede_es.escribir();
	}

}

class Escribiendo {

	public void escribir() {
		String frase = "Esto es una texto de prueba";

		try {
			FileWriter escritura = new FileWriter(
					"C:/Users/Hola/eclipse-workspace/AccesoFicheros/src/ejemplo_nuevo.txt");

			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}

			escritura.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}