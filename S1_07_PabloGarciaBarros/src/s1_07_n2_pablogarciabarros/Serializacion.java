package s1_07_n2_pablogarciabarros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.annotation.Annotation;

import org.json.JSONObject;

public class Serializacion {
	
	private String dato1;
	private String dato2;
	private String dato3;
	
	public Serializacion(String dato1, String dato2, String dato3) {
		this.dato1 = dato1;
		this.dato2 = dato2;
		this.dato3 = dato3;
	}
	
	
	@Anotacion
	public void crearFicheroJson() {
		File archivo = new File(Anotacion.UBICACION);
		FileWriter fw = null;
		BufferedWriter bw = null;
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("Dato 1", this.dato1);
		jsonObj.put("Dato 2", this.dato2);
		jsonObj.put("Dato 3", this.dato3);
		try {
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);
			bw.write(jsonObj.toString());
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
	}
}


