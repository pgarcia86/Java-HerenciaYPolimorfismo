package s1_02_n3_pablogarciabarros;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cinema {
	
	private int cantidadFilas;
	private int cantidadButacas;
	private GestionButacas gestionButacas;
	static Scanner entrada = new Scanner(System.in);
	
	public Cinema() {
		gestionButacas = new GestionButacas();
		datosIniciales();
	}
	
	public void setCantFilas(int cantFilas) {
		this.cantidadFilas = cantFilas;
	}
	public void setCantButacas(int cantButacas) {
		this.cantidadButacas = cantButacas;
	}
	
	public int getCantFilas() {
		return this.cantidadFilas;
	}
	public int getCantButacas() {
		return this.cantidadButacas;
	}
	
	public void iniciar() {
		
		int opcion;
			do {
			opcion = menu();
			
			switch(opcion) {
			
				case 1:
					mostrarButacas();
					break;
				case 2:
					mostrarButacasPersona();
					break;
				case 3:
					reservarButaca();
					break;
				case 4:
					anularReserva();
					break;
				case 5:
					anularReservaPersona();
					break;
				case 0:
					break;
				default:
					System.out.println("La opcion ingresada no es valida");
					break;		
			}
			}while(opcion != 0);
		}
	
	public void datosIniciales() {
		boolean flag = false;
		int nroFilas = 0;
		int nroButacas = 0;
		
		do {			
			try {		
				System.out.println("Ingrese la cantidad de filas del cinema");
				nroFilas = chequeoEntradaEntero();
				flag = true;
			}
			catch(ExcepcionEntradaDatos eed) {
				entrada.next();
				flag = false;
				System.out.println(eed.getMessage());
			}			
		}while(flag == false);

		setCantFilas(nroFilas);
		flag = false;
		
		do {
			try {
				System.out.println("Ingrese la cantidad de butacas por fila");
				nroButacas = chequeoEntradaEntero();
				flag = true;
			}
			catch(ExcepcionEntradaDatos eed) {
				entrada.next();
				flag = false;
				System.out.println(eed.getMessage());
			}
			
		}while(flag == false);
		
		setCantButacas(nroButacas);
	}
	
	public int menu() {
		
		int opcion = 0;
		
		do {
			System.out.println("Ingrese la opcion deseada" + 
				"\n1. Mostrar todas las butacas reservadas" + 
				"\n2. Mostrar las butacas reservadas por una persona" +
				"\n3. Reservar una butaca" +
				"\n4. Anular la reserva de una butaca" + 
				"\n5. Anular todas las reservas de una persona" +
				"\n0. Salir");
			try {
				opcion = chequeoEntradaEntero();
				return opcion;
			}
			catch(ExcepcionEntradaDatos eed){
				entrada.next();
				System.out.println(eed.getMessage());
			}
		}while(true);
	}
	
	public int chequeoEntradaEntero() throws ExcepcionEntradaDatos{
		
		int entradaEntero;
		
		if(entrada.hasNextInt()) {
			return entradaEntero = entrada.nextInt();
		}
		else {
			throw new ExcepcionEntradaDatos("No ingreso un dato valido");
		}		
	}
	
	public void mostrarButacas() {
		for (int i = 0; i < gestionButacas.getButacas().size(); i++ ) {
			System.out.println(gestionButacas.getButacas().get(i).toString());
		}
	}
	
	public void mostrarButacasPersona() {
		
		entrada.nextLine();		//Si quito este entrada.nextLine() la proxima llamada a entrada pasa de largo.
		String nombre;		
		
		//Estos array los creo para irlos llenando con los asientos que la persona tenga asignados
		ArrayList<Integer> filaAuxiliar = new ArrayList<Integer>();
		ArrayList<Integer> asientoAuxiliar = new ArrayList<Integer>();
		
		System.out.println("Ingrese el nombre de la persona que desea buscar");		
		nombre = entrada.nextLine();
		
		for(int i = 0; i < gestionButacas.getButacas().size(); i++) {
			if(gestionButacas.getButacas().get(i).getNomReserva().equalsIgnoreCase(nombre)) {
				
				filaAuxiliar.add(gestionButacas.getButacas().get(i).getNroFila());
				asientoAuxiliar.add(gestionButacas.getButacas().get(i).getNroAsiento());				
			}
		}
		
		if(filaAuxiliar.isEmpty() && asientoAuxiliar.isEmpty()) {
			System.out.println("La persona no tiene asientos asignados");
		}
		else {
			System.out.println(nombre + " tiene asignados los siguientes asientos: ");
			for(int i = 0; i < filaAuxiliar.size(); i++) {
				System.out.println("Fila: " + filaAuxiliar.get(i) + " - Asiento: " + asientoAuxiliar.get(i));
			}
		}
	}

	public void reservarButaca() {
		
		entrada.nextLine();
		String nombre = introducirPersona();
		int fila = introducirFila();
		int asiento = introducirAsiento();
		
		Butaca nuevaButaca = new Butaca(nombre, fila, asiento);
		
		gestionButacas.agregarButaca(nuevaButaca);		
	}
	
	public void anularReserva() {
		
		int filaEliminar = introducirFila();
		int asientoEliminar = introducirAsiento();
		
		int posicion = gestionButacas.buscarButaca(filaEliminar, asientoEliminar);
		
		if(posicion >= 0) {
			gestionButacas.getButacas().remove(posicion);
			System.out.println("Se elimino la butaca");
		}
		else {
			System.out.println("La butaca no esta vendida. No puede eliminarse");
		}
		
	}
	
	public void anularReservaPersona() {
		
		boolean flag = false;
		String nombreEliminar = introducirPersona();
		
		int j = 0;
		
		while(j < gestionButacas.getButacas().size()) {
			
			if(gestionButacas.getButacas().get(j).getNomReserva().equalsIgnoreCase(nombreEliminar)) {
				gestionButacas.getButacas().remove(j);
				flag = true;
			}		
			j++;
		}
		
		if(flag == true) {
			System.out.println("Se eliminaron las butacas");
		}
		else {
			System.out.println("El cliente no tiene butacas reservadas");
		}
	}
	
	public String introducirPersona(){
		
		String nombre = "";
		boolean flag = false;
		
		do {		
			System.out.println("Ingrese el nombre de la persona");
			
			try {
				nombre = chequeoEntradaNombrePersona();
				flag = true;				
			}
			catch(ExcepcionNombrePersonaIncorrecto enpi) {
				//entrada.next();
				System.out.println(enpi.getMessage());
			}			
		}while(flag == false);
		
		return nombre;
	}
	
	public String chequeoEntradaNombrePersona() throws ExcepcionNombrePersonaIncorrecto{
		
		String nombre;
		
		nombre = entrada.nextLine();
		
		if(nombre.matches(".*[0-9].*")) {
			throw new ExcepcionNombrePersonaIncorrecto("EL NOMBRE NO PUEDE CONTENER NUMEROS. INTENTELO NUEVAMENTE");
		}
		else {
			return nombre;
		}
		
	}

	public int introducirFila() {
		
		int entradaFila = 0;
		boolean flag = false;
		
		do {
			try {
				System.out.println("Ingrese el numero de fila que quiere reservar");
				entradaFila = chequeoEntradaEntero();
				try {
					chequeoFilaCorrecta(entradaFila);
					flag = true;
				}
				catch(ExcepcionFilaIncorrecta efi) {
					System.out.println(efi.getMessage());
					flag = false;
				}				
			}
			catch(ExcepcionEntradaDatos eed) {
				entrada.next();
				System.out.println(eed.getMessage());
			}			
		}while(flag == false);	
		
		return entradaFila;
		
	}
	
	public void chequeoFilaCorrecta(int entradaFila) throws ExcepcionFilaIncorrecta{
		
		if(entradaFila < 1 || entradaFila > this.cantidadFilas) {
			throw new ExcepcionFilaIncorrecta("LA FILA INGRESADA ES MAYOR A LA CANTIDAD DE FILAS DISPONIBLES." + 
					" INTENTALO NUEVAMENTE");
		}		
	}
	
	public int introducirAsiento() {
		
		int entradaAsiento = 0;
		boolean flag = false;
		
		do {
			try {
				System.out.println("Ingrese el numero de asiento que quiere reservar");
				entradaAsiento = chequeoEntradaEntero();
				try {
					chequeoAsientoCorrecto(entradaAsiento);
					flag = true;
				}
				catch(ExcepcionFilaIncorrecta efi) {
					System.out.println(efi.getMessage());
					flag = false;
				}				
			}
			catch(ExcepcionEntradaDatos eed) {
				entrada.next();
				System.out.println(eed.getMessage());
			}			
		}while(flag == false);	
		
		return entradaAsiento;
		
	}
	
	public void chequeoAsientoCorrecto(int entradaAsiento) throws ExcepcionFilaIncorrecta{
		
		if(entradaAsiento < 1 || entradaAsiento > this.cantidadButacas) {
			throw new ExcepcionFilaIncorrecta("EL ASIENTO INGRESADO ES MAYOR A LA CANTIDAD DE FILAS DISPONIBLES." + 
					" INTENTALO NUEVAMENTE");
		}		
	}

}
