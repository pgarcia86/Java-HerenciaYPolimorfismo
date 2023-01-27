package S1_01_N3_Ex1_PabloGarciaBarros;

public class Basquet extends Noticia{
	
	private String competicion;
	private String club;
	private double puntuacion;
	private double precio;
	
	
	public Basquet(String titular, String competicion, String club) {
		
		super(titular);
		this.competicion = competicion;
		this.club = club;
		this.precio = 250;
		this.puntuacion = 4;
		
	}
	
	public String getCompeticion() {
		return this.competicion;
	}
	
	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}
	
	public String getClub() {
		return this.club;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	
	public String getTitular() {
		return super.getTitular();
	}
	
	@Override
	public String toString() {
		return "Titular: " + super.getTitular() + " - Texto: " + super.getTitular() + " - Competicion: " + this.competicion
			+ " - Club: " + this.club + " - Precio: " + this.precio + " - Puntuacion: " + this.puntuacion;
	}
	
	@Override
	public double calcularPrecio() {
		
		if(this.competicion.equalsIgnoreCase("euroliga")) {
			this.precio += 75;
		}
		if(this.club.equalsIgnoreCase("real madrid") || this.club.equalsIgnoreCase("barcelona")) {
			this.precio += 75;
		}
		
		return this.precio;
	}
	
	@Override
	public double calcularPuntuacion() {
		
		if(this.competicion.equalsIgnoreCase("euroliga")) {
			this.puntuacion += 3;
		}
		if(this.competicion.equalsIgnoreCase("abc")) {
			this.puntuacion += 2;
		}
		if(this.club.equalsIgnoreCase("real madrid") || this.club.equalsIgnoreCase("barcelona")) {
			this.puntuacion += 1;
		}
		
		return this.puntuacion;
		
	}


}
