package S1_01_N1_Ex2_PabloGarciaBarros;

public class Coche {


	private static final String MARCA;
	private static String modelo;
	private final double POTENCIA;
	
	
	static {
		MARCA = "Ford";
		Coche.modelo = "Focus";
	}
	
	public Coche(double POTENCIA) {
		this.POTENCIA = POTENCIA;
	}
	
	public String getMarca() {
		return Coche.MARCA;
	}
	
	public String getModelo() {
		return Coche.modelo;
	}
	
	public double getPotencia() {
		return this.POTENCIA;
	}
	
	public void setModelo(String modelo) {
		Coche.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Marca: " + Coche.MARCA + " - Modelo: " + Coche.modelo + " - Potencia: " + this.POTENCIA;
	}
	
	public static void frenar() {
		System.out.println("El coche esta frenando");
	}
	
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}


}
