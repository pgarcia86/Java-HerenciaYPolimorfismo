package s1_04_n3_ex2_PabloGarciaBarros;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import static org.assertj.core.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class TestReferenciaObjeto {

	ObjetoReferencia objetoNuevo = new ObjetoReferencia();
	ObjetoReferencia objetoNuevo2 = new ObjetoReferencia();

	@Test
	@Order(1)
	void testReferenciasIguales() {
		assertThat(objetoNuevo.equals(objetoNuevo2)).isTrue();
	}
	
	@Test
	@Order(2)
	public void testReferenciasDistintas() {
		objetoNuevo2.setVariable("Este es otro objeto");
		assertThat(objetoNuevo.equals(objetoNuevo2)).isFalse();
	}

}
