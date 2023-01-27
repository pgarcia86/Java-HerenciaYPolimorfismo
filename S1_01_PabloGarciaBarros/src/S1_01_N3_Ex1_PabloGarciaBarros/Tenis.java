package S1_01_N3_Ex1_PabloGarciaBarros;

public class Tenis extends Noticia{
	
	private String competicion;
	private String tenista;
	private double puntuacion;
	private double precio;
	
	
	public Tenis(String titular, String competicion, String tenista) {
		
		super(titular);
		this.competicion = competicion;
		this.tenista = tenista;
		this.precio = 150;
		this.puntuacion = 4;
		
	}
	
	public String getCompeticion() {
		return this.competicion;
	}
	
	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}
	
	public String getTenista() {
		return this.tenista;
	}
	
	public void setTenista(String tenista) {
		this.tenista = tenista;
	}
	
	public String getTitular() {
		return super.getTitular();
	}
	
	@Override
	public String toString() {
		return "Titular: " + super.getTitular() + " - Texto: " + super.getTitular() + " - Competicion: " + this.competicion
			+ " - Tenista: " + this.tenista + " - Precio: " + this.precio + " - Puntuacion: " + this.puntuacion;
	}
	
	
	@Override
	public double calcularPrecio() {
		
		if(this.tenista.equalsIgnoreCase("nadal") || this.tenista.equalsIgnoreCase("federer")
				|| this.tenista.equalsIgnoreCase("djokivic")) {
			this.precio += 100;
		}
		
		return this.precio;
	}
	
	public double calcularPuntuacion() {
		
		if(this.tenista.equalsIgnoreCase("nadal") || this.tenista.equalsIgnoreCase("federer") || 
				this.tenista.equalsIgnoreCase("djokovic")) {
			this.puntuacion += 3;
		}
		
		return this.puntuacion;
		
	}

}
