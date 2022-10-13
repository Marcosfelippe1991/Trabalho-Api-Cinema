package br.com.residencia.cinema.entity;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "idDiretor")
@Entity
@Table(name = "diretor")
public class Diretor implements Serializable {
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iddiretor")
	private UUID idDiretor;

	@Column(name = "nomediretor")
	private String nomeDiretor;

	@OneToMany(mappedBy = "diretor")
	private Set<Filme> filmes;

	public UUID getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(UUID idDiretor) {
		this.idDiretor = idDiretor;
	}

	public String getNomeDiretor() {
		return nomeDiretor;
	}

	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}

	public Set<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(Set<Filme> filmes) {
		this.filmes = filmes;
	}
}

