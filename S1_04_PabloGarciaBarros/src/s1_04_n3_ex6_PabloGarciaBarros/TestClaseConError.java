package s1_04_n3_ex6_PabloGarciaBarros;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TestClaseConError<assertThatExceptionOfType> {

	ClaseConError claseConError = new ClaseConError();
	
	@Test
	void testClaseConError() {
		
		assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(()-> claseConError.generarError());
	}

}
