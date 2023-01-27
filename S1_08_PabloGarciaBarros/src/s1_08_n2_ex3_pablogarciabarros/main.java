package s1_08_n2_ex3_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcional suma = (float num1, float num2) -> num1+num2;
		Funcional resta = (float num1, float num2) -> num1-num2;
		Funcional multiplicacion = (float num1, float num2) -> num1*num2;
		Funcional division = (float num1, float num2) ->{if(num2 !=0){return num1/num2;}
			else{System.out.println("No se puede dividir por cero");return 0;}};
		
		
		System.out.println(suma.operacion(4, 5));
		System.out.println(resta.operacion(5, 2));
		System.out.println(multiplicacion.operacion(3,8));
		System.out.println(division.operacion(4, 3));
	}

}
