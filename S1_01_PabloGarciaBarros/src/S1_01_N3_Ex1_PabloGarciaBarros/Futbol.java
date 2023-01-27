package S1_01_N3_Ex1_PabloGarciaBarros;

public class Futbol extends Noticia{
	
	private String competicion;
	private String club;
	private String jugador;
	private double puntuacion;
	private double precio;
	
	
	public Futbol(String titular, String competicion, String club, String jugador) {
		
		super(titular);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;
		this.precio = 300;
		this.puntuacion = 5;
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
	
	public String getJugador() {
		return this.jugador;
	}
	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	
	public String getTitular() {
		return super.getTitular();
	}
	
	@Override
	public String toString() {
		return "Titular: " + super.getTitular() + " - Texto: " + super.getTitular() + " - Competicion: " + this.competicion
			+ " - Club: " + this.club + " - Jugador: " + this.jugador + " - Precio: " + this.precio 
			+ " - Puntuacion: " + this.puntuacion;
	}

	@Override
	public double calcularPrecio() {
		
		if(this.competicion.equalsIgnoreCase("liga de campeones")) {
			this.precio += 100;
		}
		if(this.club.equalsIgnoreCase("real madrid") || this.club.equalsIgnoreCase("barcelona")) {
			this.precio += 100;
		}
		if(this.jugador.equalsIgnoreCase("benzema") || this.jugador.equalsIgnoreCase("ferran torres")) {
			this.precio += 50;
		}
		
		return this.precio;
	}
	
	@Override
	public double calcularPuntuacion() {
		
		if(this.competicion.equalsIgnoreCase("liga de campeones")) {
			this.puntuacion += 3;
		}
		if(this.competicion.equalsIgnoreCase("liga")) {
			this.puntuacion += 2;
		}
		if(this.club.equalsIgnoreCase("real madrid") || this.club.equalsIgnoreCase("barcelona")) {
			this.puntuacion += 1;
		}
		if(this.jugador.equalsIgnoreCase("benzema") || this.jugador.equalsIgnoreCase("ferran torres")) {
			this.puntuacion += 1;
		}
		
		return this.puntuacion;
		
	}
	

}
