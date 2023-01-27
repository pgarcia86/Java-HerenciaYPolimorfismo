package s1_04_n3_ex6_PabloGarciaBarros;

import java.util.ArrayList;

public class ClaseConError {
	
	private ArrayList<Integer> arrayPrueba;
	
	public ClaseConError() {
		arrayPrueba = new ArrayList<Integer>() {{add(5);add(8);add(44);add(17);}};
	}
	
	public void generarError() throws ArrayIndexOutOfBoundsException{
		int i = 0;
		while(true) {
			if(i < arrayPrueba.size()) {
				i++;
			}
			else {
				throw new ArrayIndexOutOfBoundsException("Esta Fuera Del Array");
			}
		}
	}
	
	

}
