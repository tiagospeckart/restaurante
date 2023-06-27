package ravin.modelo;

import java.time.LocalDate;

import ravin.enumeradores.Cargo;
import ravin.enumeradores.Disponibilidade;
import ravin.enumeradores.Escolaridade;
import ravin.enumeradores.EstadoCivil;

public class Funcionario extends Pessoa {
    
	private String rg;
	private EstadoCivil estadoCivil;
	private Escolaridade escolaridade;
	private Cargo cargo;
	private int pis;
	private LocalDate dataAdmissao;
	private LocalDate dataDemissao;
	private Disponibilidade disponibilidade;
	
	public Funcionario(int id, String nome, String telefone, String email, String cpf, String endereco,
			String observacao, LocalDate dataNascimento, LocalDate criadoEm, LocalDate alteradoEm, String rg,
			EstadoCivil estadoCivil, Escolaridade escolaridade, Cargo cargo, int pis, LocalDate dataAdmissao,
			LocalDate dataDemissao, Disponibilidade disponibilidade) {
		super(id, nome, telefone, email, cpf, endereco, observacao, dataNascimento, criadoEm, alteradoEm);
		this.rg = rg;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
		this.cargo = cargo;
		this.pis = pis;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.disponibilidade = disponibilidade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public int getPis() {
		return pis;
	}

	public void setPis(int pis) {
		this.pis = pis;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
}