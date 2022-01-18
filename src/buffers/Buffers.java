package buffers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffers {

	public static void main(String[] args) {

		LeerFichero accediendo = new LeerFichero();

		accediendo.lee();

	}

}

class LeerFichero {

	public void lee() {
		try {
			FileReader entrada = new FileReader(
					"C:/Users/Hola/eclipse-workspace/AccesoFicheros/src/ejemplo.txt");

			BufferedReader mibuffer = new BufferedReader(entrada);

			String linea = "";

			while (linea != null) {

				linea = mibuffer.readLine();

				if (linea != null)
					System.out.println(linea);
			}
			entrada.close();

		} catch (IOException e) {
			System.out.println("No se ha entcontrado el archivo.");
		}

	}
}
