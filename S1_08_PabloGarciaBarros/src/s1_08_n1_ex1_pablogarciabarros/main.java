package s1_08_n1_ex1_pablogarciabarros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listaString = Arrays.asList("Perro", "Vaca", "Animal", "Casona", "Gato");
		List<String> palabrasConO = new ArrayList<String>();
		
		listaString.forEach(p -> {if(p.contains("o") == true) {palabrasConO.add(p);}});
		
		for (String palabra : palabrasConO) {
			System.out.println(palabra);
		}
	}

}
