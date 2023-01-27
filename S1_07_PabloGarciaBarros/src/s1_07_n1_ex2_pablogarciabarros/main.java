package s1_07_n1_ex2_pablogarciabarros;

public class main {

	@SuppressWarnings("deprecation")	//Con esta notacion suprimo los warnings de esta notacion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Pedro", "Ramirez", 10.55);
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Ruben", "Diaz", 8.78);
		
		System.out.println("El sueldo del trabajador online " + trabajadorOnline.toString() + " es " +
			trabajadorOnline.calcularSueldo(120) + "€");
		
		System.out.println("El sueldo del trabajador presencial " + trabajadorPresencial.toString() + " es " +
			trabajadorPresencial.calcularSueldo(150) + "€");
		
		System.out.println("\nUso los metodos con la notacion @Deprecated");
		System.out.println(trabajadorOnline.mostrarDatos());
		System.out.println(trabajadorPresencial.mostrarDatos());
	}

}
