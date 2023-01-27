package s1_08_n1_ex7_pablogarciabarros;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cadenas = Arrays.asList("Pablo", "Andrea", "45", "133", "Juliana", "Natalia", "88",
				"425", "7", "A", "Amigorena");
		
		cadenas.sort((a,b) -> b.length() - a.length());
		cadenas.forEach(System.out::println);
		
	}

}
