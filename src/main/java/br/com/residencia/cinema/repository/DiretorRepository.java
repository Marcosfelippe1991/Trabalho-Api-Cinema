package br.com.residencia.cinema.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.residencia.cinema.entity.Diretor;

public interface DiretorRepository extends JpaRepository<Diretor, UUID>{



}
