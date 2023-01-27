package S1_01_N1_Ex1_PabloGarciaBarros;

public abstract class Instrumento {

	static {
		System.out.println("COMIENZA EL CONCIERTO");
	}
	
	private String nombre;
	private double precio;
	
	
	public Instrumento(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "Nombre" + this.nombre + " - Precio: " + this.precio;
	}
	
	public abstract String tocar();


}
