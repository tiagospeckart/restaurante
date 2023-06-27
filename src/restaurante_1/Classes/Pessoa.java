package Classes;

import java.time.LocalDate;

public abstract class Pessoa extends Usuario {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private Endereco endereco;
    private String observacao;
    private LocalDate dataNascimento;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;
    // getters and setters
	public int getId() {
		return id;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
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