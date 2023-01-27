package s1_04_n1_ex2_PabloGarciaBarros;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCalculoDni {

	CalculoDni calculoDni = new CalculoDni(); 
	
	
	@ParameterizedTest
	@ValueSource(strings = {"86322075Q", "43572455J", "37270278C", "49791284X", "76638380B", "48972860H", 
			"56767774W", "82456580Q", "62807416M", "16744092T"})
	public void testCalcularLetra(String documento) {
		String esperada = documento.substring(8);
		String recibida = calculoDni.calcularLetra(documento.substring(0,8));
		assertEquals(esperada, recibida);
	}

}
