package s1_02_n3_pablogarciabarros;

import java.util.InputMismatchException;

public class ExcepcionEntradaDatos extends InputMismatchException{

	String mensaje;
	
	public ExcepcionEntradaDatos(String mensaje) {
		super(mensaje);
	}
}
