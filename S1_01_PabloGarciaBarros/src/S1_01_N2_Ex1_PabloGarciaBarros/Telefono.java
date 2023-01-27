package S1_01_N2_Ex1_PabloGarciaBarros;

public class Telefono {
	private String marca;
	private String modelo;
	
	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Marca: " + this.marca + " - Modelo: " + this.modelo;
	}
	
	public void llamar(String nroTelefono) {
		System.out.println("Se esta llamando al " + nroTelefono);
	}


}
