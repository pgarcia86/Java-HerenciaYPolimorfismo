package S1_01_N3_Ex1_PabloGarciaBarros;

import java.util.ArrayList;

public class Redactor {

	private String nombre;
	private final String DNI;
	private static double sueldo;
	private ArrayList<Noticia> noticias;
	
	static {
		Redactor.sueldo = 1500;
	}
	
	
	public Redactor(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
		noticias = new ArrayList<Noticia>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDNI() {
		return this.DNI;
	}
	public double getSueldo() {
		return Redactor.sueldo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSueldo(double sueldo) {
		Redactor.sueldo = sueldo;
	}
	
	public ArrayList<Noticia> getNoticia(){
		return this.noticias;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " - DNI: " + this.DNI + " - Sueldo: " + Redactor.sueldo;
	}

}
