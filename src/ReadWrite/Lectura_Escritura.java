package ReadWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) {

		int contador = 0;

		int datos_entrada[] = new int[85070];

		try {
			FileInputStream archivo_lectura = new FileInputStream(
					"C:\\Users\\Hola\\eclipse-workspace\\AccesoFicheros\\src\\girasoles.jpg");

			boolean final_archivo = false;

			while (!final_archivo) {

				int byte_entrada = archivo_lectura.read();

				if (byte_entrada != -1) {

					datos_entrada[contador] = byte_entrada;

				} else {
					final_archivo = true;
				}

				System.out.println(datos_entrada[contador]);

				contador++;
			}

			archivo_lectura.close();

		} catch (IOException e) {
			System.out.println("Archivo no encontrado");
		}

		System.out.println(contador);

		crea_fichero(datos_entrada);
	}

	static void crea_fichero(int datos_nuevo_fichero[]) {

		try {

			FileOutputStream fichero_nuevo = new FileOutputStream(
					"C:\\Users\\Hola\\eclipse-workspace\\AccesoFicheros\\src\\girasoles_copia.jpg");

			for (int i = 0; i < datos_nuevo_fichero.length; i++) {

				fichero_nuevo.write(datos_nuevo_fichero[i]);

			}

			fichero_nuevo.close();

		} catch (IOException e) {
			System.out.println("Error al crear el archivo.");
		}
	}

}
