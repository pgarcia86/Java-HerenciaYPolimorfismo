package s1_07_n1_ex1_pablogarciabarros;

public class TrabajadorPresencial extends Trabajador{

	private static float gasolina;
	
	public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		this.gasolina = 200;
	}
	
	@Override
	public double calcularSueldo(double cantidadHoras) {
		return (super.getPrecioHora() * cantidadHoras) + gasolina;
	}

}
