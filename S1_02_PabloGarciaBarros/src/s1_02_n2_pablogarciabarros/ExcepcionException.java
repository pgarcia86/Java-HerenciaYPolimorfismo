package s1_02_n2_pablogarciabarros;

public class ExcepcionException extends Exception{
	
	private String mensaje;
	
	public ExcepcionException(String mensaje) {
		
		super(mensaje);
	}
}
