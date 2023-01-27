package s1_02_n1_pablogarciabarros;

public class IndexOutOfBoundException extends Exception {
	
	private String mensaje;
	
	public IndexOutOfBoundException(String mensaje) {
		super(mensaje);
	}

}
