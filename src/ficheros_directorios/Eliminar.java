package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {

		File ruta = new File("C:" + File.separator + "Users" + File.separator
				+ "Hola" + File.separator + "eclipse-workspace" + File.separator
				+ "AccesoFicheros" + File.separator + "src" + File.separator
				+ "ficheros_directorios" + File.separator + "java_archivos"
				+ File.separator + "nuevo_texto.txt");

		ruta.delete();
	}

}
