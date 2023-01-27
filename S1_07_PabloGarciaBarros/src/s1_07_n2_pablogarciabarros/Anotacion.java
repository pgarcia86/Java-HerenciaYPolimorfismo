package s1_07_n2_pablogarciabarros;

import java.io.File;
import java.io.FileWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Anotacion {
	String UBICACION = "C:/Users/pgarc/eclipse-workspace/S1_07_PabloGarciaBarros/src/fichero.json";
	}
