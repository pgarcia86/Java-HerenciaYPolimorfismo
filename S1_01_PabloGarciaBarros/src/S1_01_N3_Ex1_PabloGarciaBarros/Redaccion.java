package S1_01_N3_Ex1_PabloGarciaBarros;

import java.util.ArrayList;

public class Redaccion {
	
public static ArrayList<Redactor> redactores;
	
	public Redaccion() {
		
		redactores = new ArrayList<Redactor>();
		
	}
	
	public ArrayList<Redactor> getRedactores(){
		return Redaccion.redactores;
	}


}
