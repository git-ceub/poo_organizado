package revisao;

public class Livro {
	
	private String autor;
	private String titulo;
	private int ano;
	
	public void recuperarNumeroDePaginas() {
		System.out.println(" O número de páginas do livro: " + 
	                      this.titulo + " não está disponível");
	}
	
	public void recuperarNumeroDePaginas(String titulo) {
		System.out.println(" O número de páginas do livro: " + 
                titulo + " não está disponível");
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
