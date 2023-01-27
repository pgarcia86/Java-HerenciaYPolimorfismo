package s1_04_n2_PabloGarciaBarros;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertArrayEquals;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;


class TestLargoPalabra {
	
	public static Matcher<String> largo(Matcher<? super Integer> matcher){
	
		return new FeatureMatcher<String, Integer> (matcher, " ", " "){
			@Override
			protected Integer featureValueOf(String palabra) {
				return palabra.length();
			}
		};
	}	

	@Test
	public void testLargoPalabra() {
		assertThat("Mordor",largo(is(8)));
	}

}
