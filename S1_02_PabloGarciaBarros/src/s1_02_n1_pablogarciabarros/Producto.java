package s1_02_n1_pablogarciabarros;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " - Precio: " + this.precio;
	}
}
