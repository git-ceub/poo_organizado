package aula6;

import java.util.ArrayList;

public class Ex2 {
	// Crie uma função que receba um ArrayList e 
	// retorne o número de elementos únicos na lista.
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(50);
		numeros.add(30);
		numeros.add(30);
		System.out.println(retornaUnicos(numeros));
	}
	
	public static Integer retornaUnicos(ArrayList<Integer> numeros) {
		ArrayList<Integer> unicos = new ArrayList<Integer>();
		for (Integer numero : numeros) {
			if(!unicos.contains(numero)) {
				unicos.add(numero);
			}
		}
		return unicos.size();
	}

}
