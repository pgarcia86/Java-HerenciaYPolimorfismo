package s1_07_n1_ex1_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador trabajadorOnline = new TrabajadorOnline("Pablo", "Garcia Barros", 8.50);
		Trabajador trabajadorPresencial = new TrabajadorPresencial("Julian", "Perez", 10.70);
		
		System.out.println("El sueldo de " + trabajadorOnline.toString() + ", trabajador online es " 
				+ trabajadorOnline.calcularSueldo(40.0) + "€");
		System.out.println("El sueldo de " + trabajadorPresencial.toString() + ", trabajador presencial es " 
				+ trabajadorPresencial.calcularSueldo(40.0) + "€");

	}

}
