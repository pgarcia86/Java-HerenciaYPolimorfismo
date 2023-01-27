package S1_01_N3_Ex1_PabloGarciaBarros;

public abstract class Noticia {

	private String titular;
	private String texto;
		
	public Noticia(String titular) {
		this.titular = titular;
		this.texto = null;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public String toString() {
		return "Titular: " + this.titular + " - Texto: " + this.texto;
	}
	
	public abstract double calcularPrecio();
	
	public abstract double calcularPuntuacion();

}
