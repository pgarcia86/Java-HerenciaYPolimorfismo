package s1_08_n1_ex8_pablogarciabarros;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Funcional reverse = (palabra) ->{
			String alreves = "";
			for(int i = palabra.length() - 1; i >= 0; i-- ) {
				alreves += palabra.charAt(i);
			}
			return alreves;
			
		};
		System.out.println(reverse.reverse("Dar Vuelta"));
	}

}
