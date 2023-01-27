package s1_08_n1_ex4_pablogarciabarros;

import java.util.Arrays;
import java.util.List;
import java.lang.Object.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		meses.forEach(System.out::println);
	}
}
