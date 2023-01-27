package s1_04_n1_ex3_PabloGarciaBarros;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class TestClaseConError {

	ClaseConError claseConError = new ClaseConError();
	
	@Test
	public void testClaseConError() {		
		assertThrows(ArrayIndexOutOfBoundsException.class, ()-> claseConError.lanzaError());
	}

}
