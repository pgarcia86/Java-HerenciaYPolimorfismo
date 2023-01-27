package s1_07_n1_ex1_pablogarciabarros;

public class TrabajadorOnline extends Trabajador{
	
	private final float PRECIO_INTERNET;
	
	public TrabajadorOnline(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		this.PRECIO_INTERNET = 100;
	}
	
	@Override
	public double calcularSueldo(double cantidadHoras) {
		return (super.getPrecioHora() * cantidadHoras) + this.PRECIO_INTERNET;
	}

}
