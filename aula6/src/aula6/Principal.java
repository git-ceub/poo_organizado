package aula6;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<String> disciplinas = new ArrayList<String>();
		disciplinas.add("POO");
		disciplinas.add("Banco de dados II");
		disciplinas.add("Desenvolvimento de Interfaces");
		disciplinas.add("Engenharia de requisitos");		
		
		System.out.println(disciplinas);
		System.out.println(disciplinas.get(2));
		
		disciplinas.set(1, "Banco de dados I");
		System.out.println(disciplinas);
		
		disciplinas.remove(2);
		System.out.println(disciplinas);
		
		for(int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i));
		}
		
		for (String disciplina : disciplinas) {
			System.out.println(disciplina);
		}
		
		System.out.println(disciplinas.contains("POO II"));
		
		
	}

}
