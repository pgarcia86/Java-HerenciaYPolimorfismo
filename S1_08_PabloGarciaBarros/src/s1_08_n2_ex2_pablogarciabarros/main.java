package s1_08_n2_ex2_pablogarciabarros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numeros = Arrays.asList(22, 4, 5, 37, 25,30,20, 55, 17, 88);
		List<String>parImpar = new ArrayList<String>();
		
		paresImpares(numeros, parImpar);		

	}
	
	public static void paresImpares(List<Integer> numeros, List<String> parImpar) {
		numeros.forEach(p -> {if(p%2 == 0) {String num = 'e' + String.valueOf(p)+',';parImpar.add(num);}
			else{String num = 'o' + String.valueOf(p)+',';parImpar.add(num);}});
		parImpar.forEach(s -> {System.out.print(s);});
	}

}
