package s1_02_n2_pablogarciabarros;

import java.util.InputMismatchException;

public class ExcepcionInput extends InputMismatchException{
	
	private String mensaje;
	
	public ExcepcionInput(String mensaje) {
		super(mensaje);
	}

}
