package s1_08_n2_ex1_pablogarciabarros;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nombres = Arrays.asList("Pablo", "Ana", "Analia", "Jorge", "Esteban", "Rey", "Ani", "Ara");
		tresLetras(nombres);		
	}
	
	public static void tresLetras(List<String> nombres) {		
		nombres.forEach(p -> {if(p.charAt(0) == 'A' && p.length() == 3) {System.out.println(p);}});
	}
}
