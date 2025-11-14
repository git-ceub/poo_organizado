package aula7;

public class Principal {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("José Silva");
		a1.setRa("123456789");
		
		Endereco e1 = new Endereco();
		e1.setCep("71909000");
		e1.setLogradouro("Quadra 103");
		e1.setNumero(3);
		
		a1.setEndereco(e1);
		
		System.out.println(a1.getNome() + 
				           " - " + 
				           a1.getRa() +
				           " - " +
				           a1.getEndereco().getCep());
		
	}

}
