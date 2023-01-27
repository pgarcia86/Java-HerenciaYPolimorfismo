package s1_07_n1_ex2_pablogarciabarros;

public class TrabajadorPresencial extends Trabajador{
	
	private static double gasolina;
	
	public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		gasolina = 50;
	}
	
	@Deprecated
	public String mostrarDatos() {
		return "Nombre: " + super.getNombre() + " - Apellido: " + super.getApellido() + " - Sueldo por hora: " 
				+ super.getPrecioHora();
	}
	
	@Override
	public double calcularSueldo(double cantidadHoras) {
		return(super.getPrecioHora() * cantidadHoras) + gasolina;
	}

}
