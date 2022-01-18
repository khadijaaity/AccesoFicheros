package leyendo;

import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

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

			int c = 0;
//			
//			System.out.print((char) c);

			while (c != -1) {

				c = entrada.read();

				char letra = (char) c;

				System.out.print(letra);
			}
			entrada.close();

		} catch (IOException e) {
			System.out.println("No se ha entcontrado el archivo.");
		}

	}
}
