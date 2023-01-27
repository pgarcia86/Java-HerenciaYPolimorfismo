package s1_04_n1_ex3_PabloGarciaBarros;

import java.util.ArrayList;

public class ClaseConError {
	
	private ArrayList<Integer> listaNumeros;
	
	public ClaseConError() {
		
		this.listaNumeros = new ArrayList<Integer>();
		
		this.listaNumeros.add(5);
		this.listaNumeros.add(7);
		
	}
	
	public void lanzaError() throws ArrayIndexOutOfBoundsException{
		
		int i = 0;
		
		while(true) {			
			if(i < listaNumeros.size()) {
				i++;
			}
			else {
				throw new ArrayIndexOutOfBoundsException("Esta Fuera de los limites");
			}
		}		
	}

}
