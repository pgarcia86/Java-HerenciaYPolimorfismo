package S1_01_N2_Ex1_PabloGarciaBarros;

public class Smartphone extends Telefono implements Camara, Reloj{

	
	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
	}
	
	@Override
	public void fotografiar() {
		System.out.println("Se esta haciendo una fotografia");
	}
	
	@Override
	public void alarma() {
		System.out.println("Esta sonando la alarma");
	}
}
