package s1_04_n1_ex1_PabloGarciaBarros;

import java.util.ArrayList;

public class Meses {
	
	private ArrayList<String> nombreMeses;
	
	public Meses() {
		nombreMeses = new ArrayList<String>();
		
		nombreMeses.add("Enero");
		nombreMeses.add("Febrero");
		nombreMeses.add("Marzo");
		nombreMeses.add("Abril");
		nombreMeses.add("Mayo");
		nombreMeses.add("Junio");
		nombreMeses.add("Julio");
		nombreMeses.add("Septiembre");
		nombreMeses.add("Octubre");
		nombreMeses.add("Noviembre");
		nombreMeses.add("Diciembre");
		
	}
	
	public String getNombreMes(int indice){
		return this.nombreMeses.get(indice);
	}
	
	public void setNombreMes(String nombreMes, int indice) {
		this.nombreMeses.add(indice, nombreMes);
	}
	
	public void agregarAgosto() {
		this.nombreMeses.add(7, "Agosto");
	}
	
	public int cantidadPosiciones() {
		return nombreMeses.size();
	}
	
	public boolean estaVacio() {
		if(this.nombreMeses.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
