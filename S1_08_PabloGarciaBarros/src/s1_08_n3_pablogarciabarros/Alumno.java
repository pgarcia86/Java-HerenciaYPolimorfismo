package s1_08_n3_pablogarciabarros;

public class Alumno {
	
	private String nombre;
	private String curso;
	private double nota;
	private int edad;
	
	public Alumno(String nombre, String curso, double nota, int edad) {
		this.nombre = nombre;
		this.curso = curso;
		this.nota = nota;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getCurso() {
		return this.curso;
	}
	public double getNota() {
		return this.nota;
	}
	public int getedad() {
		return this.edad;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " - Edad: " + this.edad + " años - Curso: " + this.curso +
				" - Nota: " + this.nota;
	}

}
