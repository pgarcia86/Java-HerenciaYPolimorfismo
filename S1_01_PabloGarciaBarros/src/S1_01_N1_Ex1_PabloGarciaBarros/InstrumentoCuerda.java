package S1_01_N1_Ex1_PabloGarciaBarros;

public class InstrumentoCuerda extends Instrumento{
	
	static {
		System.out.println("Se inicia un instrumento de cuerda");
	}
	
	public InstrumentoCuerda(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public String tocar() {
		return "Esta sonando un instrumento de cuerda";
	}

}
