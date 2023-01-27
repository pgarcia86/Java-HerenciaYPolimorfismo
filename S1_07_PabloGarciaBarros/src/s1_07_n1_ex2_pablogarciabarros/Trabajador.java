package s1_07_n1_ex2_pablogarciabarros;

public class Trabajador {
	
	private String nombre;
	private String apellido;
	private double precioHora;
	
	public Trabajador(String nombre, String apellido, double precioHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}
	
	public double getPrecioHora() {
		return this.precioHora;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}
	
	public double calcularSueldo(double cantidadHoras) {
		return (this.precioHora * cantidadHoras);
	}

}
