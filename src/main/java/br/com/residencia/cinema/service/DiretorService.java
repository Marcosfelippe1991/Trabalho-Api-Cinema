package br.com.residencia.cinema.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.cinema.entity.Diretor;
import br.com.residencia.cinema.repository.DiretorRepository;

@Service
public class DiretorService {
	@Autowired
	DiretorRepository diretorRepository;
	
	
	public List<Diretor> getAllDiretores(){
		return diretorRepository.findAll();
	}
	
	public Diretor getDiretorById(UUID id) {
		return diretorRepository.findById(id).get();
	}
	
	public Diretor saveDiretor(Diretor diretor) {
		return diretorRepository.save(diretor);
	}
	
	public Diretor updateDiretor(Diretor diretor, UUID id) {
		Diretor diretorExistenteNoBanco = getDiretorById(id);
		
		diretorExistenteNoBanco.setNomeDiretor(diretor.getNomeDiretor());
				
		return diretorRepository.save(diretorExistenteNoBanco);
		
	}
	
	public Diretor deleteDiretor (UUID id) {
		diretorRepository.deleteById(id);
		return getDiretorById(id);
	}
}

