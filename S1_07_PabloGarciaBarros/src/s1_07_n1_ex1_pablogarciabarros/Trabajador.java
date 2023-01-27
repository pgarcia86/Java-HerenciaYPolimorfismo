package s1_07_n1_ex1_pablogarciabarros;

public class Trabajador {
	
	private String nombre;
	private String apellido;
	private double precioHora;
	
	public Trabajador(String nombre, String apellido, double precioHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}
	
	public double calcularSueldo(double horasTrabajadas) {
		return this.precioHora * horasTrabajadas;
	}
	
	public double getPrecioHora() {
		return this.precioHora;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}

}
