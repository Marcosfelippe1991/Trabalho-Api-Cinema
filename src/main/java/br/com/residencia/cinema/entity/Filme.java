package br.com.residencia.cinema.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "idFilme")
@Entity
@Table(name = "filme")
public class Filme implements Serializable {
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idfilme")
	private UUID idFilme;
	
	@Column(name = "nomebr")
	private String nomeBr;
	
	@Column(name = "nomeen")
	private String nomeEn;
	
	@Column(name = "anolancamento")
	private Instant anoLancamento;
	
	@Column(name = "sinopse")
	private String sinopse;
	
	@ManyToOne
	@JoinColumn(name = "iddiretor", referencedColumnName = "iddiretor")
	private Diretor diretor;
	
	@ManyToOne
	@JoinColumn(name = "idgenero", referencedColumnName = "idgenero")
	private Genero genero;

	public UUID getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(UUID idFilme) {
		this.idFilme = idFilme;
	}

	public String getNomeBr() {
		return nomeBr;
	}

	public void setNomeBr(String nomeBr) {
		this.nomeBr = nomeBr;
	}

	public String getNomeEn() {
		return nomeEn;
	}

	public void setNomeEn(String nomeEn) {
		this.nomeEn = nomeEn;
	}

	public Instant getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Instant anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
