package s1_04_n3_ex3_PabloGarciaBarros;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class TestArraysIguales {

	List<Integer> array1 = new ArrayList<Integer>() {{add(5);add(7);add(9);add(44);}};
	List<Integer> array2 = new ArrayList<Integer>() {{add(5);add(7);add(9);add(44);}};
		
	@Test
	public void arrayIgualesTest() {
	
		assertThat(array1).usingRecursiveComparison().isEqualTo(array2);
	}

}
