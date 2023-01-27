package S1_01_N3_Ex1_PabloGarciaBarros;

public class Formula1 extends Noticia{
	
	private String escuderia;
	private double puntuacion;
	private double precio;
	
	
	public Formula1(String titular, String escuderia) {
		
		super(titular);
		this.escuderia = escuderia;
		this.precio = 100;
		this.puntuacion = 4;
		
	}
	
	public String getEscuderia() {
		return this.escuderia;
	}
	
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	
	public String getTitular() {
		return super.getTitular();
	}
	
	@Override
	public String toString() {
		return "Titular: " + super.getTitular() + " - Texto: " + super.getTitular() + " - Escuderia: " + this.escuderia
			+ " - Precio: " + this.precio + " - Puntuacion " + this.puntuacion;
	}
	
	@Override
	public double calcularPrecio() {
		
		if(this.escuderia.equalsIgnoreCase("ferrari") || this.escuderia.equalsIgnoreCase("mercedes")) {
			this.precio += 50;
		}
		
		return this.precio;
	}
	
	@Override
	public double calcularPuntuacion() {
		
		if(this.escuderia.equalsIgnoreCase("ferrari") || this.escuderia.equalsIgnoreCase("mercedes")) {
			this.puntuacion += 2;
		}
		
		return this.puntuacion;
		
	}
}
