package s1_02_n3_pablogarciabarros;

public class ExcepcionFilaIncorrecta extends Exception {
	
	private String mensaje;
	
	public ExcepcionFilaIncorrecta(String mensaje) {
		super(mensaje);
	}

}
