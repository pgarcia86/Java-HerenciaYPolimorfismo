package s1_08_n2_ex4_pablogarciabarros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class main {
	
	static List<String> palabrasNumeros;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palabrasNumeros = Arrays.asList("elemento", "casona", "auto", "728", "91", "14028", 
				"animal", "elegido", "elefante", "fiesta", "rapido");
		System.out.println("Array ordenado alfabeticamente");
		ordenarAlfabeticamente();
		System.out.println("\nPalabras con la letra E primero");
		letrasEPrimero();
		System.out.println("\nReemplazar las letras A por el numero 4");
		reemplazarAPor4();
		System.out.println("\nSolo los numeros");
		mostrarSoloNumeros();
		
	}
	
	public static void ordenarAlfabeticamente() {
		palabrasNumeros.sort((a,b) -> a.compareTo(b));
		palabrasNumeros.forEach(pn -> System.out.println(pn));

	}
	
	public static void letrasEPrimero() {
		palabrasNumeros.forEach(pn -> {if(pn.charAt(0) == 'e') {System.out.println(pn);}});
		palabrasNumeros.forEach(pn -> {if(pn.charAt(0) != 'e') {System.out.println(pn);}});
	}
	
	public static void reemplazarAPor4() {
		palabrasNumeros.forEach(p -> {System.out.println(p.replace('a', '4'));});
	}
	
	public static void mostrarSoloNumeros() {
		System.out.println(palabrasNumeros.stream().filter(pn -> pn.chars().allMatch(Character::isDigit)).collect(Collectors.toList()));

	}

}
