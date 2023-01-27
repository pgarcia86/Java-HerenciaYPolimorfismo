package S1_01_N1_Ex2_PabloGarciaBarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche = new Coche(125);

		System.out.println(coche.toString());
		coche.acelerar();	//Como el metodo acelerar NO es estatico, lo invoco con la instancia del objeto Coche
		Coche.frenar();		//Como el metodo frenar es estático, lo puedo invocar sin utilizar la instancia del objeto Coche
	
		

	}

}
