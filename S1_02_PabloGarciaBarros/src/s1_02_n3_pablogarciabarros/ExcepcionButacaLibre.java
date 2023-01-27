package s1_02_n3_pablogarciabarros;

public class ExcepcionButacaLibre extends Exception {
	
	private String mensaje;

	public ExcepcionButacaLibre(String mensaje) {
		super(mensaje);
	}
}
