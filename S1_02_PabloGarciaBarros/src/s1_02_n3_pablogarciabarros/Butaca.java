package s1_02_n3_pablogarciabarros;

public class Butaca {
	
	private int numeroFila;
	private int numeroAsiento;
	private String nombreReserva;
	
	public Butaca(String nombreReserva, int numeroFila, int numeroAsiento) {
		
		this.numeroFila = numeroFila;
		this.numeroAsiento = numeroAsiento;
		this.nombreReserva = nombreReserva;
	}

	public int getNroFila() {
		return this.numeroFila;
	}
	public int getNroAsiento() {
		return this.numeroAsiento;
	}
	public String getNomReserva() {
		return this.nombreReserva;
	}
	
	public void setNroFila(int numeroFila) {
		this.numeroFila = numeroFila;
	}
	public void setNroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	public void setNomReserva(String nombreReserva) {
		this.nombreReserva = nombreReserva;
	}
	
	@Override
	public String toString() {
		return "Fila: " + this.numeroFila + " - Asiento: " + this.numeroAsiento + " - Persona: " + this.nombreReserva;
	}
	
	public boolean iguales(Butaca otraButaca) {
		if((this.numeroFila == otraButaca.getNroFila()) &&(this.numeroAsiento == otraButaca.getNroAsiento())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
