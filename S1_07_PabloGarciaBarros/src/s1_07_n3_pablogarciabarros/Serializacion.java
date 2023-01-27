package s1_07_n3_pablogarciabarros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.json.JSONObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Serializacion {

	private String dato1;
	private String dato2;
	private int dato3;
	
	public Serializacion(String dato1, String dato2, int dato3) {
		this.dato1 = dato1;
		this.dato2 = dato2;
		this.dato3 = dato3;
	}

	@Anotacion(ubicacion = "C:/Users/pgarc/eclipse-workspace/S1_07_PabloGarciaBarros/src/fichero.json")
	public void crearFicheroJson() {
		Class<?> c = Serializacion.class;
		try {
			Method metodo = c.getMethod("crearFicheroJson", null);
			Anotacion anotacion = metodo.getAnnotation(Anotacion.class);
			String ubic = anotacion.ubicacion();
			JSONObject jsonObjeto = new JSONObject();
			File archivoJson = null;
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				archivoJson = new File(ubic);
				fw = new FileWriter(archivoJson, true);
				bw = new BufferedWriter(fw);
				jsonObjeto.put("Dato 1", this.dato1);
				jsonObjeto.put("Dato 2", this.dato2);
				jsonObjeto.put("Dato 3", this.dato3);
				bw.write(jsonObjeto.toString());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					bw.close();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
