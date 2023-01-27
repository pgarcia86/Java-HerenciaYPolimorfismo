package s1_04_n3_ex4_PabloGarciaBarros;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import static org.assertj.core.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class TestArrayObjetos {
	
	static ArrayObjetos arrayObjetos = new ArrayObjetos();
	
	@BeforeAll
	public static void BeforeAll() {
		arrayObjetos.agregarObjeto(new PrimerObjeto());
		arrayObjetos.agregarObjeto(new SegundoObjeto());
		arrayObjetos.agregarObjeto(new TercerObjeto());
		arrayObjetos.agregarObjeto(new CuartoObjeto());
		arrayObjetos.agregarObjeto(new QuintoObjeto());
	}

	@Test
	@Order(1)
	public void testOrdenObjetos() {
		
		
		//System.out.println(this.arrayObjetos.getArrayClases());
		
		assertThat(arrayObjetos.getArrayClases()).containsExactly(PrimerObjeto.class, SegundoObjeto.class, 
				TercerObjeto.class, CuartoObjeto.class, QuintoObjeto.class);
	}
	
	@Test
	@Order(2)
	public void testCualquierOrden() {
		
		assertThat(arrayObjetos.getArrayClases()).containsExactlyInAnyOrder(PrimerObjeto.class, SegundoObjeto.class,
					TercerObjeto.class, CuartoObjeto.class, QuintoObjeto.class);
		}
	
	@Test
	@Order(3)
	public void testNoContieneTodos() {
		arrayObjetos.getArray().remove(3);		
		assertThat(arrayObjetos.getArrayClases()).containsOnlyOnce(PrimerObjeto.class, SegundoObjeto.class,
					TercerObjeto.class, CuartoObjeto.class, QuintoObjeto.class);	
	}

}
