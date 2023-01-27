package s1_04_n3_ex5_PabloGarciaBarros;

import java.util.HashMap;
import java.util.Set;

public class HashMapPrueba {
	
	private HashMap<String, String> hashPrueba;
	
	public HashMapPrueba() {
		hashPrueba = new HashMap<String, String>();
	}
	
	public void setKeyValue(String llave, String valor) {
		this.hashPrueba.put(llave, valor);
	}
	
	public Set<String> getKey() {
		return this.hashPrueba.keySet();
	}

}
