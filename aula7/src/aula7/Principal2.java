package aula7;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Endereco e1 = new Endereco();
		e1.setCep("71000900");
		e1.setLogradouro("Quadra 211");
		e1.setNumero(4);
		
		String nome = "Francisco Molina";
		
		Aluno a2 = new Aluno(nome, e1);
		a2.setRa("1234564");
		
		System.out.println(a2.getNome() + 
		           " - " + 
		           a2.getRa() +
		           " - " +
		           a2.getEndereco().getCep());
		
	}

}
