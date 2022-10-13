package br.com.residencia.cinema.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.cinema.entity.Filme;
import br.com.residencia.cinema.repository.FilmeRepository;

@Service
public class FilmeService {
	@Autowired
	FilmeRepository filmeRepository;
	
	
	public List<Filme> getAllFilmes(){
		return filmeRepository.findAll();
	}
	
	public Filme getFilmeById(UUID id) {
		return filmeRepository.findById(id).get();
	}
	
	public Filme saveFilme(Filme filme) {
		return filmeRepository.save(filme);
	}
	
	public Filme updateFilme(Filme filme, UUID id) {
		Filme filmeExistenteNoBanco = getFilmeById(id);
		
		filmeExistenteNoBanco.setNomeBr(filme.getNomeBr());
		filmeExistenteNoBanco.setNomeEn(filme.getNomeEn());
		filmeExistenteNoBanco.setAnoLancamento(filme.getAnoLancamento());
		filmeExistenteNoBanco.setSinopse(filme.getSinopse());
		
		return filmeRepository.save(filmeExistenteNoBanco);
		
	}
	
	public Filme deleteFilme (UUID id) {
		filmeRepository.deleteById(id);
		return getFilmeById(id);
	}
}
