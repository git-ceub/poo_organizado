package exemplo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@PutMapping("/{id}")
	public Pessoa atualizarPessoa(@PathVariable Long id, 
			                      @RequestBody Pessoa pessoa) {
		Optional<Pessoa> oPessoa = pessoaRepository.findById(id);
		if(oPessoa.isPresent()) {
			Pessoa p = oPessoa.get();
			p.setNome(pessoa.getNome());
			p.setIdade(pessoa.getIdade());
			return pessoaRepository.save(p);
		}
		return null;
	}
	
	@GetMapping
	public List<Pessoa> listarPessoas() {
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public void excluirPessoa(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
	}
	

}
