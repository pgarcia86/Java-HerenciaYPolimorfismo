package S1_01_N1_Ex1_PabloGarciaBarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrumento instrumentoNuevo1 = new InstrumentoCuerda("Guitarra", 126.12);
		Instrumento instrumentoNuevo2 = new InstrumentoViento("Trompeta", 126.21);
		Instrumento instrumentoNuevo3 = new InstrumentoPercusion("Bateria", 126.44);
		
		
		System.out.println("\n" + instrumentoNuevo1.tocar() + "\n");
		
		System.out.println(instrumentoNuevo2.tocar() + "\n");
		System.out.println(instrumentoNuevo3.tocar());
		
	}

}
