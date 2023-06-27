package ravin.modelo;

import java.time.LocalDate;
import java.util.List;

import ravin.enumeradores.StatusMesa;

public class Mesa {

	private int id;
	private Funcionario funcionario;
	private List<Comanda> comandas;
	private String nome;
	private String codigo;
	private int numero;
	private int quantidadeMaxPessoas;
	private StatusMesa statusMesa;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;
    
	public Mesa(int id, Funcionario funcionario, List<Comanda> comandas, String nome, String codigo, int numero,
			int quantidadeMaxPessoas, StatusMesa statusMesa, LocalDate criadoEm, LocalDate alteradoEm) {
		super();
		this.id = id;
		this.funcionario = funcionario;
		this.comandas = comandas;
		this.nome = nome;
		this.codigo = codigo;
		this.numero = numero;
		this.quantidadeMaxPessoas = quantidadeMaxPessoas;
		this.statusMesa = statusMesa;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidadeMaxPessoas() {
		return quantidadeMaxPessoas;
	}

	public void setQuantidadeMaxPessoas(int quantidadeMaxPessoas) {
		this.quantidadeMaxPessoas = quantidadeMaxPessoas;
	}

	public StatusMesa getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(StatusMesa statusMesa) {
		this.statusMesa = statusMesa;
	}

	public LocalDate getCriadoEm() {
		return criadoEm;
	}

	public LocalDate getAlteradoEm() {
		return alteradoEm;
	}

	
}
