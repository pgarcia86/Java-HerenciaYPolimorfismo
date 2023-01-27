package s1_04_n1_ex1_PabloGarciaBarros;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMeses {
	
	Meses meses = new Meses();
	
	@BeforeEach
	public void before() {		
		meses.agregarAgosto();
	}

	@Test
	public void testAgregarAgosto() {
		String esperado = "Agosto";
		String recibido = meses.getNombreMes(7);
		assertEquals(esperado, recibido);
	}
	
	@Test
	public void testCantidadPosiciones() {
		int esperado = 12;
		int recibido = meses.cantidadPosiciones();
		assertEquals(esperado, recibido);
	}
	
	@Test
	public void testEstaVacio() {
		boolean esperado = false;
		boolean recibido = meses.estaVacio();
		assertEquals(esperado, recibido);
	}
	
}
