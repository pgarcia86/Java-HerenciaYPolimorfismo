package s1_07_n1_ex2_pablogarciabarros;

public class TrabajadorOnline extends Trabajador{
	
	private final double PRECIO_INTERNET;
	
	public TrabajadorOnline(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		this.PRECIO_INTERNET = 100;
	}
	
	@Deprecated
	public String mostrarDatos() {
		return "Nombre: " + this.getNombre() + " - Apellido: " + super.getApellido() + " - Sueldo por hora: " + 
				super.getPrecioHora();
	}
	
	@Override
	public double calcularSueldo(double cantidadHoras) {
		return (super.getPrecioHora() * cantidadHoras) + this.PRECIO_INTERNET;
	}

}
