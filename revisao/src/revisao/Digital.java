package revisao;

public class Digital extends Livro {
	
	public void recuperarNumeroDePaginas() {
		System.out.println(" O número de páginas do livro digital: " + 
	                      getTitulo() + " não está disponível");
		super.recuperarNumeroDePaginas();
	}

}
