package S1_01_N3_Ex1_PabloGarciaBarros;

public class Motociclismo extends Noticia{

	private String equipo;
	private double puntuacion;
	private double precio;
	
	
	public Motociclismo(String titular, String equipo) {
		
		super(titular);
		this.equipo = equipo;
		this.precio = 100;
		this.puntuacion = 3;
		
	}
	
	public String getEquipo() {
		return this.equipo;
	}
	
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public String getTitular() {
		return super.getTitular();
	}
	
	@Override
	public String toString() {
		return "Titular: " + super.getTitular() + " - Texto: " + super.getTitular() + " - Equipo: " + this.equipo
			+ " - Precio: " + this.precio + " - Puntuacion: " + this.puntuacion;
	}
	
	
	@Override
	public double calcularPrecio() {
		
		
		if(this.equipo.equalsIgnoreCase("honda") || this.equipo.equalsIgnoreCase("yamaha")) {
			this.precio += 50;
		}
				
		return this.precio;
	}
	
	@Override
	public double calcularPuntuacion() {
		
		if(this.equipo.equalsIgnoreCase("honda") || this.equipo.equalsIgnoreCase("yamaha")) {
			this.puntuacion += 3;
		}
		
		return this.puntuacion;
		
	}
		
}
