package aula4;

public class Revista {
	
	private String autor;
	private String titulo;
	public String editora;
	
	public String getTitulo() {
		return this.titulo.toUpperCase();
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}

}
