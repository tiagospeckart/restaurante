package ravin.modelo;

import java.time.LocalDate;

public class Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String endereco;
    private String observacao;
    private LocalDate dataNascimento;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;

	public Pessoa(int id, String nome, String telefone, String email, String cpf, String endereco, String observacao,
			LocalDate dataNascimento, LocalDate criadoEm, LocalDate alteradoEm) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.observacao = observacao;
		this.dataNascimento = dataNascimento;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getCriadoEm() {
		return criadoEm;
	}

	public LocalDate getAlteradoEm() {
		return alteradoEm;
	}
	
	
}