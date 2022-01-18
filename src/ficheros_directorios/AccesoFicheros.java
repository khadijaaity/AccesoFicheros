package ficheros_directorios;

import java.io.File;

public class AccesoFicheros {

	public static void main(String[] args) {

		// File ruta = new
		// File("C:\\Users\\Hola\\eclipse-workspace\\AccesoFicheros\\src\\ficheros_directorios\\java_archivos");

		File ruta = new File("C:" + File.separator + "Users" + File.separator
				+ "Hola" + File.separator + "eclipse-workspace" + File.separator
				+ "AccesoFicheros" + File.separator + "src" + File.separator
				+ "ficheros_directorios" + File.separator + "java_archivos");

		System.out.println(ruta.getAbsolutePath());

		String[] nombres_archivos = ruta.list();

		for (int i = 0; i < nombres_archivos.length; i++) {

			System.out.println(nombres_archivos[i]);

			File f = new File(ruta.getAbsolutePath(), nombres_archivos[i]);

			if (f.isDirectory()) {

				String[] archivos_subcarpeta = f.list();

				for (int j = 0; j < archivos_subcarpeta.length; j++) {

					System.out.println("sub " + archivos_subcarpeta[j]);

				}
			}
		}

	}
}
