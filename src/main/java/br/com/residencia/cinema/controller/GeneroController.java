package br.com.residencia.cinema.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.residencia.cinema.entity.Genero;
import br.com.residencia.cinema.service.GeneroService;



@RestController
@RequestMapping("/genero")
public class GeneroController {
	@Autowired
	GeneroService generoService;
	
	@GetMapping
	public ResponseEntity<List<Genero>> getAllGeneros(){
		return new ResponseEntity<>(generoService.getAllGeneros(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Genero> getGeneroById(@PathVariable UUID id){
		return new ResponseEntity<>(generoService.getGeneroById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Genero> saveGenero(@RequestBody Genero genero) {
		return new ResponseEntity<>(generoService.saveGenero(genero), HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Genero>updateGenero(@RequestBody Genero genero,@PathVariable UUID id){
		return new ResponseEntity<> (generoService.updateGenero(genero,id),
				HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Genero> deleteGenero(@PathVariable UUID id) {
		Genero genero = generoService.getGeneroById(id);
		if(null == genero)
			return new ResponseEntity<>(genero,
					HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(generoService.deleteGenero(id),
					HttpStatus.OK);
	}
}