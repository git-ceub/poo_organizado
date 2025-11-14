package revisao;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Livro> lista = new ArrayList<Livro>();
		
		Livro l1 = new Digital();
		l1.setTitulo("Engenharia de Software");
		l1.recuperarNumeroDePaginas();
		
		lista.add(l1);
		
		Biblioteca b1 = new Biblioteca(lista);
		Biblioteca b2 = new Biblioteca("Ceub II", lista);
		
	}

}
