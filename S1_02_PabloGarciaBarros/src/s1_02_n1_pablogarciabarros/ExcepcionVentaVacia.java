package s1_02_n1_pablogarciabarros;

public class ExcepcionVentaVacia extends ArrayIndexOutOfBoundsException{
	
	private String mensaje;
	
	public ExcepcionVentaVacia(String mensaje) {
		
		super(mensaje);
		
	}

}
