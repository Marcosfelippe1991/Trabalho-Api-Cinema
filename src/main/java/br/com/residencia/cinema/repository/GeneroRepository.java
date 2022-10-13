package br.com.residencia.cinema.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.residencia.cinema.entity.Genero;

public interface GeneroRepository extends JpaRepository<Genero, UUID>{

}

