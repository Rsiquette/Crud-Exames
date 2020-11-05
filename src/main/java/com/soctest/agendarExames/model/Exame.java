package com.soctest.agendarExames.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "exames")
public class Exame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column(unique=true, name="nome")
	private String nome;
	
	@NotNull
	@Column(name="idade")
	private int idade;
	
	@NotNull
	@Column(name="email")
	private String email;
	
	@NotNull
	@Column(name="convenio")
	private String convenio;
	
	@NotNull
	@Column(name="medSolicitante")
	private String medSolicitante;
	
	@NotNull
	@Column(name="nmExame")
	private String nmExame;
	
	@NotNull
	@Column(name="dtExame")
	private String dtExame;
	
	@NotNull
	@Column(name="especialidade")
	private String especialidade;
	
	@NotNull
	@Column(name="dsResultado")
	private String dsResultado;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getMedSolicitante() {
		return medSolicitante;
	}
	public void setMedSolicitante(String medSolicitante) {
		this.medSolicitante = medSolicitante;
	}
	public String getNmExame() {
		return nmExame;
	}
	public void setNmExame(String nmExame) {
		this.nmExame = nmExame;
	}
	public String getDtExame() {
		return dtExame;
	}
	public void setDtExame(String dtExame) {
		this.dtExame = dtExame;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getDsResultado() {
		return dsResultado;
	}
	public void setDsResultado(String dsResultado) {
		this.dsResultado = dsResultado;
	}
	
	

	
}
