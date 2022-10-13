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
		property = "idGenero")
@Entity
@Table(name = "genero")
public class Genero implements Serializable {
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idgenero")
	private UUID idGenero;

	@Column(name = "nomegenero")
	private String nomeGenero;

	@OneToMany(mappedBy = "genero")
	private Set<Filme> filmes;

	public UUID getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(UUID idGenero) {
		this.idGenero = idGenero;
	}

	public String getNomeGenero() {
		return nomeGenero;
	}

	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}

	public Set<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(Set<Filme> filmes) {
		this.filmes = filmes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
