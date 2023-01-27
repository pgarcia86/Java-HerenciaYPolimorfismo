package s1_04_n3_ex4_PabloGarciaBarros;

import java.util.ArrayList;

public class ArrayObjetos {
	
	private ArrayList<Object> arrayObjetos;
	
	public ArrayObjetos() {
		arrayObjetos = new ArrayList<Object>();
	}
	
	public void agregarObjeto(Object obj) {
		arrayObjetos.add(obj);
	}
	
	public ArrayList<Object> getArray(){
		return this.arrayObjetos;
	}
	
	public ArrayList<Object> getArrayClases(){
		ArrayList<Object> arrayTiposClases = new ArrayList<Object>();
		for(int i = 0; i < this.arrayObjetos.size(); i++) {
			arrayTiposClases.add(this.arrayObjetos.get(i).getClass());
		}
		return arrayTiposClases;
	}
	
	public Object getObjeto(int posicion) {
		return this.arrayObjetos.get(posicion);
	}
}
