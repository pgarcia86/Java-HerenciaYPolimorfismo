package s1_08_n3_pablogarciabarros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		List<Alumno> alumnosA = new ArrayList<Alumno>();
		
		alumnos.add(new Alumno("Pablo Garcia", "Java", 8.50, 36));
		alumnos.add(new Alumno("Julian Perez", "PHP", 10, 25));
		alumnos.add(new Alumno("Ana Lopez", "Java", 7, 17));
		alumnos.add(new Alumno("Romina Palacios", "Python", 6.50, 40));
		alumnos.add(new Alumno("Ruben Nuñez", "Java", 3.5, 22));
		alumnos.add(new Alumno("Hernan Rodriguez", "PHP", 5.5, 62));
		alumnos.add(new Alumno("Ramon Garcia", "Python", 4.5, 37));
		alumnos.add(new Alumno("Julieta Hernandez", "JavaScript", 8.50, 30));
		alumnos.add(new Alumno("Soledad Fernandez", "Java", 9, 29));
		alumnos.add(new Alumno("Santiago Maldonado", "Rubi", 3, 52));
		
		System.out.println("Todos los alumnos");
		imprimirPantalla(alumnos);
		alumnosA = filtrarNombresA(alumnos);
		System.out.println("\nAlumnos cuyos nombres que empiezan con A");
		imprimirPantalla(filtrarNombresA(alumnos));
		System.out.println("\nAlumnos con nota mayor o igual a 5");
		imprimirPantalla(filtrarNota(alumnos));
		System.out.println("\nAlumnos con nota mayor o igual a 5 y que no cursan PHP");
		imprimirPantalla(filtrarNotaYPhp(alumnos));
		System.out.println("\nAlumnos mayores de edad que cursan Java");
		imprimirPantalla(filtrarEdadYJava(alumnos));
		
	}
	
	public static void imprimirPantalla(List<Alumno> alumnos) {
		alumnos.forEach(a -> System.out.println(a.toString()));
	}
	
	public static List<Alumno> filtrarNombresA(List<Alumno> alumnos) {		
		List<Alumno> alumnosLetraA = alumnos.stream().filter
				(a -> a.getNombre().charAt(0) == 'A').collect(Collectors.toList());
		return alumnosLetraA;
	}
	
	public static List<Alumno> filtrarNota(List<Alumno> alumnos) {	
		return(alumnos.stream().filter(a -> a.getNota() >= 5).collect(Collectors.toList()));
	}
	
	public static List<Alumno> filtrarNotaYPhp(List<Alumno> alumnos) {
		return alumnos.stream().filter(a -> !a.getCurso().equalsIgnoreCase("php") && a.getNota() >= 5).collect(Collectors.toList());	
	}
	
	public static List<Alumno> filtrarEdadYJava(List<Alumno> alumnos){
		return alumnos.stream().filter(a -> a.getCurso().equalsIgnoreCase("java") && a.getedad() >= 18).collect(Collectors.toList());
	}
}
