package s1_04_n3_ex1_PabloGarciaBarros;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import static org.assertj.core.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class TestNumeroEntero {

	
	@Test
	@Order(1)
	public void numerosIgualesTest() {
		int numero1 = 5;
		int numero2 = 5;
		assertThat(numero1).isEqualTo(numero2);
	}
	
	@Test
	@Order(2)
	public void numerosDistintosTest() {
		int numero1 = 44;
		int numero2 = 27;
		assertThat(numero1).isNotEqualTo(numero2);
	}

}
