package S1_01_N3_Ex1_PabloGarciaBarros;

import java.util.Scanner;

public class main {

	static {
		Redaccion redaccion = new Redaccion();
	}
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner entrada = new Scanner(System.in);
		
		int opcion;
				
		do{
			menu();
			opcion = entrada.nextInt();
			switch(opcion) {
				case 1:
					agregarRedactor();
					break;
				case 2:
					eliminarRedactor();
					break;
				case 3:
					introducirNoticia();
					break;
				case 4:
					eliminarNoticia();
					break;
				case 5:
					mostrarNoticiasRedactor();
					break;
				case 6:
					calcularPuntuacionNoticia();
					break;
				case 7:
					calcularPrecioNoticia();
					break;
				case 0:
					break;
				default:
					System.out.println("La opcion ingresada no es correcta\n");
					break;
			}
		}while(opcion != 0);
		System.out.println("Saliendo de la aplicacion");
	}

	public static void menu() {
		System.out.println("Ingrese la opcion deseada: " +
			"\n1. Introducir redactor" + 
			"\n2. Eliminar redactor" +
			"\n3. Introducir noticia a un redactor" +
			"\n4. Eliminar noticia de un redactor" +
			"\n5. Mostrar todas las noticias del redactor" + 
			"\n6. Calcular puntuacion de la noticia" + 
			"\n7. Calcular precio de la noticia" + 
			"\n0. Salir de la aplicacion");
	}
	
	//Busco el redactor por DNI, si lo encuentro, devuelvo la posicion, sino devuelvo -1
	public static int buscarRedactor(String dni) {
		
		int indice = -1;
		int i = 0;
		boolean flag = false;
		
		while(i < Redaccion.redactores.size() && flag == false) {
			if(Redaccion.redactores.get(i).getDNI().equalsIgnoreCase(dni)) {
				flag = true;
				indice = i;
			}
			i++;
		}
		return indice;
	}
	
	//Pido los datos por pantalla y los agrego al array de redactores del objeto Redaccion
	public static void agregarRedactor() {
		
		entrada.nextLine();
		
		String nombre;
		String dni;
		
		System.out.println("Ingrese el nombre del redactor");
		nombre = entrada.nextLine();
		
		System.out.println("Ingrese el DNI del redactor");
		dni = entrada.next();
		
		Redaccion.redactores.add(new Redactor(nombre, dni));
	}
	
	//Elimino redactor por los datos pedidos por pantalla
	public static void eliminarRedactor() {
		System.out.println("Ingrese el DNI del redactor que desea eliminar");
		String dni = entrada.next();
		int indiceBuscado = buscarRedactor(dni);
		if(indiceBuscado >= 0) {
			Redaccion.redactores.remove(indiceBuscado);
			System.out.println("Se elimino correctamente el redactor");
		}
		else {
			System.out.println("El redactor no esta cargado en la aplicacion");
		}
	}
	
	public static void introducirNoticia() {
		
		System.out.println("Ingrese el DNI del redactor al que quiere cargar la noticia");
		String dni = entrada.next();
		int opcion;
		int indiceBuscado = buscarRedactor(dni);
		boolean flag = false;
		if(indiceBuscado >= 0) {
			do {
			System.out.println("Ingrese la opcion deseada:" + 
				"\n1. Noticia de Futbol" + 
				"\n2. Noticia de Basquet" + 
				"\n3. Noticia de Tenis" +
				"\n4. Noticia de Formula1" +
				"\n5. Noticia de Motociclismo" +
				"\n0. Cancelar la operacion");
			opcion = entrada.nextInt();
			switch(opcion) {
				case 1:
					ingresarNoticiaFutbol(indiceBuscado);
					flag = true;
					break;
				case 2:
					ingresarNoticiaBasquet(indiceBuscado);
					flag = true;
					break;
				case 3:
					ingresarNoticiaTenis(indiceBuscado);
					flag = true;
					break;
				case 4:
					ingresarNoticiaFormula1(indiceBuscado);
					flag = true;
					break;
				case 5:
					ingresarNoticiaMotociclismo(indiceBuscado);
					flag = true;
					break;
				case 0:
					System.out.println("Operacion cancelada");
					break;
				default:
					System.out.println("La opcion ingresada no es valida");
					
			}
		}while(opcion != 0 && flag == false);
			
		}
		else {
			System.out.println("No se puede cargar la noticia, el redactor no esta cargado en el sistema");
		}
	}
	
	public static void ingresarNoticiaFutbol(int indiceBuscado) {
		
		String titular;
		String competencia;
		String club;
		String jugador;
		
		System.out.println("Ingrese el titular de la noticia");
		
		entrada.nextLine();
		titular = entrada.nextLine();
		System.out.println("Sobre que competencia trata la noticia?");
		competencia = entrada.nextLine();
		System.out.println("Sobre que club trata la noticia?");
		club = entrada.nextLine();
		System.out.println("Sobre que jugador trata la noticia?");
		jugador = entrada.nextLine();
		
		Redaccion.redactores.get(indiceBuscado).getNoticia().add(new Futbol(titular, competencia, club, jugador));
	}
	
	public static void ingresarNoticiaBasquet(int indiceBuscado) {
		
		entrada.nextLine();
		
		String titular;
		String competencia;
		String club;
		
		System.out.println("Ingrese el titular de la noticia");
		titular = entrada.next();
		System.out.println("Sobre que competencia trata la noticia?");
		competencia = entrada.next();
		System.out.println("Sobre que club trata la noticia?");
		club = entrada.next();
		
		Redaccion.redactores.get(indiceBuscado).getNoticia().add(new Basquet(titular, competencia, club));		
	}
	
	public static void ingresarNoticiaTenis(int indiceBuscado) {		
		
		entrada.nextLine();
		
		String titular;
		String competencia;
		String tenista;
		
		System.out.println("Ingrese el titular de la noticia");
		titular = entrada.next();
		System.out.println("Sobre que competencia trata la noticia?");
		competencia = entrada.next();
		System.out.println("Sobre que tenista trata la noticia?");
		tenista = entrada.next();
		
		Redaccion.redactores.get(indiceBuscado).getNoticia().add(new Tenis(titular, competencia, tenista));

	}
	
	public static void ingresarNoticiaFormula1(int indiceBuscado) {
		
		entrada.nextLine();
		
		String titular;
		String escuderia;
		
		System.out.println("Ingrese el titular de la noticia");
		titular = entrada.next();
		System.out.println("Sobre que escuderia trata la noticia?");
		escuderia = entrada.next();
		
		Redaccion.redactores.get(indiceBuscado).getNoticia().add(new Formula1(titular, escuderia));

	}
	
	public static void ingresarNoticiaMotociclismo(int indiceBuscado) {		
		
		entrada.nextLine();
		
		String titular;
		String equipo;
		
		System.out.println("Ingrese el titular de la noticia");
		titular = entrada.next();
		System.out.println("Sobre que equipo trata la noticia?");
		equipo = entrada.next();
		
		Redaccion.redactores.get(indiceBuscado).getNoticia().add(new Motociclismo(titular, equipo));
	}
	
	//Busco la noticia por el titular. Si lo encuentro devuelvo la posicion, sino devuelvo -1
	public static int buscarNoticia(String titular, int indiceBuscado) {
		
		int i = 0;
		int posicionNoticia = -1;
		boolean flag = false;
		
		while(i < Redaccion.redactores.get(indiceBuscado).getNoticia().size() && flag == false) {
			if(Redaccion.redactores.get(indiceBuscado).getNoticia().get(i).getTitular().equalsIgnoreCase(titular)) {
				posicionNoticia = i;
				flag = true;
			}
			i++;
		}
		
		return posicionNoticia;
	}
	
 	public static void eliminarNoticia() {
				
		int i = 0;
		boolean flag = false;
		System.out.println("Ingrese el DNI del redactor");
		//entrada.next();
		String dni = entrada.next();
		
		int indiceBuscado = buscarRedactor(dni);
		
		if(indiceBuscado >= 0) {
			
			System.out.println("Ingrese el titular de noticia que quiere eliminar");
			
			String titular = entrada.next();
			int posicionNoticia = buscarNoticia(titular, indiceBuscado);
			
			if(posicionNoticia >= 0) {
				Redaccion.redactores.get(indiceBuscado).getNoticia().remove(posicionNoticia);
				System.out.println("Se elimino la noticia");
			}
			else { 
				System.out.println("La noticia no esta cargada para ese redactor");
			}
		}
		else {
			System.out.println("No se puede eliminar la noticia, el redactor no esta cargado");
		}
		
	}
	
	
 	public static void mostrarNoticiasRedactor() {
		
		System.out.println("Ingrese el dni del Redactor del que quiere ver sus noticias");
		String dni = entrada.next();
		int indiceBuscado = buscarRedactor(dni);
		
		if(indiceBuscado >= 0) {
			for(int i = 0; i < Redaccion.redactores.get(indiceBuscado).getNoticia().size(); i++) {
				System.out.println(Redaccion.redactores.get(indiceBuscado).getNoticia().get(i).toString());
			}
		}
		else {
			System.out.println("No se pueden mostrar las noticas, el Redactor no esta cargado");
		}
		
	}
	
	public static void calcularPuntuacionNoticia() {
		
		System.out.println("Ingrese el DNI del Redacctor");
		String dni = entrada.next();
		
		int indiceBuscado = buscarRedactor(dni);
		int posicionNoticia;
		
		if(indiceBuscado >= 0) {
			System.out.println("Ingrese el titular de la noticia que quiere calcular la puntuacion");
			entrada.nextLine();
			String titular = entrada.nextLine();
			posicionNoticia = buscarNoticia(titular, indiceBuscado);
			if(posicionNoticia >= 0) {
				System.out.println(posicionNoticia);
				System.out.println("Linea 337");
				System.out.println("La puntuacion de la noticia es: "  + Redaccion.redactores.get(indiceBuscado).getNoticia().get(posicionNoticia).calcularPuntuacion());
			}
			else {
				System.out.println("La noticia no esta cargada para ese Redactor");
			}
		}
		else {
			System.out.println("El Redactor no esta cargado");
		}		
	}

	public static void calcularPrecioNoticia() {
	
		System.out.println("Ingrese el DNI del Redacctor");
		String dni = entrada.next();
		
		int indiceBuscado = buscarRedactor(dni);
		int posicionNoticia;
		
		if(indiceBuscado >= 0) {
			System.out.println("Ingrese el titular de la noticia que quiere calcular el precio");
			entrada.nextLine();
			String titular = entrada.nextLine();
			posicionNoticia = buscarNoticia(titular, indiceBuscado);
			if(posicionNoticia >= 0) {
				//Redaccion.redactores.get(indiceBuscado).getNoticia().get(posicionNoticia).calcularPrecio();
				System.out.println("El precio de la Notica es: " + Redaccion.redactores.get(indiceBuscado).getNoticia().get(posicionNoticia).calcularPrecio());
			}
			else {
				System.out.println("La noticia no esta cargada para ese Redactor");
			}
		}
		else {
			System.out.println("El Redactor no esta cargado");
		}
		
	}
}
