package s1_04_n3_ex5_PabloGarciaBarros;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TestHashMap {

	static HashMapPrueba hashMapPrueba = new HashMapPrueba();
	
	@BeforeAll
	public static void beforeAll() {
		hashMapPrueba.setKeyValue("Perro", "Cuatro Patas");
		hashMapPrueba.setKeyValue("Gato", "Cuatro Patas");
		hashMapPrueba.setKeyValue("Gallina", "Dos Patas");
		hashMapPrueba.setKeyValue("Araña", "Ocho Patas");
	}
	
	@Test
	void testTieneKey() {
		assertThat(hashMapPrueba.getKey()).containsAnyOf("Perro", "Gato", "Gallina", "Araña");
	}

}
