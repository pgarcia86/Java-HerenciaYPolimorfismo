package s1_02_n3_pablogarciabarros;

public class ExcepcionButacaOcupada extends Exception{
	
	private String mensaje;
	
	public ExcepcionButacaOcupada(String mensaje) {
		super(mensaje);
	}

}
