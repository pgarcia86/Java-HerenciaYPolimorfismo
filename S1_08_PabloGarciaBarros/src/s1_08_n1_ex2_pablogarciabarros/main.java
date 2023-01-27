package s1_08_n1_ex2_pablogarciabarros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listaPalabras = Arrays.asList("Perro", "Gato", "Casona", "Bestial", "Caminante", "Zapato");
		List<String> palabrasFiltradas = new ArrayList<String>();
		
		listaPalabras.forEach(p -> {if(p.contains("o") && p.length() >= 5) {palabrasFiltradas.add(p);}});
		
		for (String palabra : palabrasFiltradas) {
			System.out.println(palabra);
		}
	}
}
