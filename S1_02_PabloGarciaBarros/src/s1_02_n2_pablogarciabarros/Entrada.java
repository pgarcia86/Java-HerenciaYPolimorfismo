package s1_02_n2_pablogarciabarros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	private static Scanner entrada;
	
	public Entrada() {
		this.entrada = new Scanner(System.in);
	}
	
	public static byte leerByte(String mensaje) {
		
		byte entradaByte = 0;
		boolean flag = false;
		
		do {
			try {
				System.out.println(mensaje);
				entradaByte = chequeoByte();
				flag = true;
			}
			catch(ExcepcionInput ei) {
				entrada.next();
				System.out.println(ei.getMessage());
				flag = false;
			}
			
		}while(flag == false);	
		
		System.out.println(entradaByte);
		
		return entradaByte;			
	}
	
	public static byte chequeoByte() throws ExcepcionInput{
		
		byte entradaByte;
		
		if(entrada.hasNextByte()) {
			System.out.println("Entrada correcta");
			return entradaByte = entrada.nextByte();
		}
		else {
			throw new ExcepcionInput("No ingreso un byte. Intentelo nuevamente");
		}
		
	}
	
	public static int leerInt(String mensaje) throws ExcepcionInput{
		
		int entradaInt = 0;
		boolean flag = false;
		
		do {
			try {
				System.out.println(mensaje);
				entradaInt = chequeoInt();
				flag = true;
			}
			catch(ExcepcionInput ei) {
				entrada.next();
				System.out.println(ei.getMessage());
				flag = false;
			}
			
		}while(flag == false);	
		
		System.out.println(entradaInt);
		
		return entradaInt;				
	}
	
	public static int chequeoInt() throws ExcepcionInput{
		
		int entradaInt;
		
		if(entrada.hasNextInt() ) {
			System.out.println("Entrada correcta");
			return entradaInt = entrada.nextInt();
		}
		else {
			throw new ExcepcionInput("No ingreso un entero. Intentalo Nuevamente");
		}
	}
	
	public static float leerFloat(String mensaje) throws ExcepcionInput{
				
		float entradaFloat = 0;
		boolean flag = false;
		
		do {
			try {
				System.out.println(mensaje);
				entradaFloat = chequeoFloat();
				flag = true;
			}
			catch(ExcepcionInput ei) {
				entrada.next();
				System.out.println(ei.getMessage());
				flag = false;
			}
			
		}while(flag == false);	
		
		System.out.println(entradaFloat);
		
		return entradaFloat;		
	}
	
	public static float chequeoFloat() throws ExcepcionInput{
		
		float entradaFloat;
			
		if(entrada.hasNextFloat() ) {
			System.out.println("Entrada correcta");
			return entradaFloat = entrada.nextFloat();
		}
		else {
			throw new ExcepcionInput("No ingreso un float. Intentalo Nuevamente");
		}
	}
	
	public static double leerDouble(String mensaje)throws ExcepcionInput {
		
		double entradaDouble = 0;
		boolean flag = false;
		
		do {
			try {
				System.out.println(mensaje);
				entradaDouble = chequeoDouble();
				flag = true;
			}
			catch(ExcepcionInput ei) {
				entrada.next();
				System.out.println(ei.getMessage());
				flag = false;
			}
			
		}while(flag == false);	
		
		System.out.println(entradaDouble);
		
		return entradaDouble;		
	}
	
	public static double chequeoDouble() throws ExcepcionInput{
	
		double entradaDouble;
			
		if(entrada.hasNextDouble() ) {
			System.out.println("Entrada correcta");
			return entradaDouble = entrada.nextDouble();
		}
		else {
			throw new ExcepcionInput("No ingreso un double. Intentalo Nuevamente");
		}	
	}
		
	public static char leerChar(String mensaje){
		
		char entradaChar = 0;
		boolean flag = false;
		
		do{
			try {
				System.out.println(mensaje);
				entradaChar = chequeoChar();
				flag = true;
			}
			catch(ExcepcionException ee){
				System.out.println(ee.getMessage());
				flag = false;
			}
		
		}while(flag == false);
		
		System.out.println(entradaChar);
		
		return entradaChar;		
	}
	
	public static char chequeoChar() throws ExcepcionException{
		
		String entradaChar;
		entradaChar = entrada.next();
		
		if(entradaChar.length() > 1) {
			throw new ExcepcionException("No ingreso un caracter valido. Intentelo nuevamente");
		}
		else {
			System.out.println("Entrada Correcta");
			return entradaChar.charAt(0);			
		}		
	}
	
	public static String leerString(String mensaje){
		
		String entradaString = "";
		boolean flag = false;
		
		do{
			try {
				System.out.println(mensaje);
				entradaString = chequeoString();
				flag = true;
			}
			catch(ExcepcionException ee){
				System.out.println(ee.getMessage());
				flag = false;
			}
		
		}while(flag == false);
		
		return entradaString;		
	}
	
	public static String chequeoString() throws ExcepcionException{
	
		String entradaString;
		entradaString = entrada.next();
		
		if(entradaString.length() > 1) {
			System.out.println("Entrada Correcta");
			return entradaString;
			
		}
		else {
			throw new ExcepcionException("No ingreso un String valido. Intentelo nuevamente");
		}		
	}
	
	public static boolean leerSioNo(String mensaje){
		
		boolean entradaBooleano = false;
		boolean flag = false;
		
		do {
			try {
				System.out.println(mensaje);
				entradaBooleano = chequeoBooleano();
				flag = true;
			}
			catch(ExcepcionException ee) {
				flag = false;
				System.out.println(ee.getMessage());
			}
		}while(flag == false);
		
		return entradaBooleano;
	}
	
	public static boolean chequeoBooleano() throws ExcepcionException{
		
		String entradaBooleano = "";
		entradaBooleano = entrada.next();
		
		if(entradaBooleano.equalsIgnoreCase("n")) {
			System.out.println("Entrada correcta");
			return false;
		}
		else if(entradaBooleano.equalsIgnoreCase("s")) {
			System.out.println("Entrada correcta");
			return true;
		}
		else {
			throw new ExcepcionException("No ingreso un valor valido. Intentelo nuevamente");
		}
		
	}

}
