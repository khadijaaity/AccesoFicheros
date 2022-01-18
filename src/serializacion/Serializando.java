package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando {

	public static void main(String[] args) {

		Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);

		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3];

		personal[0] = jefe;

		personal[1] = new Empleado("Ana", 25000, 2000, 10, 11);

		personal[2] = new Empleado("Luis", 35000, 2009, 8, 30);

		try {

			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(
					new FileOutputStream(
							"C:/Users/Hola/eclipse-workspace/AccesoFicheros/src/serializacion/empleado.txt"));

			escribiendo_fichero.writeObject(personal);

			escribiendo_fichero.close();

			ObjectInputStream recuperando_fichero = new ObjectInputStream(
					new FileInputStream(
							"C:/Users/Hola/eclipse-workspace/AccesoFicheros/src/serializacion/empleado.txt"));

			Empleado[] personal_recuperado = (Empleado[]) recuperando_fichero
					.readObject();

			recuperando_fichero.close();

			for (Empleado e : personal_recuperado) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;

	private double sueldo;

	private Date fechaContrato;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1,
				dia);

		fechaContrato = calendario.getTime();

	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void subirSueldo(double porcentaje) { // SETTER
		double aumneto = sueldo * porcentaje / 100;
		sueldo += aumneto;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato="
				+ fechaContrato;
	}

}

class Administrador extends Empleado {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double incentivo;

	public Administrador(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);
		incentivo = 0;
	}

	@Override
	public double getSueldo() {
		double sueldoBase = super.getSueldo();

		return sueldoBase = incentivo;
	}

	public void setIncentivo(double b) {
		incentivo = b;
	}

	@Override
	public String toString() {
		return super.toString() + " Incentivo=" + incentivo;
	}

}
