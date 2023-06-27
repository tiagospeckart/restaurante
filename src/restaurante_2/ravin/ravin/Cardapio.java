package ravin;

import java.time.LocalDate;
import java.util.List;
import ravin.enums.*;

public class Cardapio {
	private int id;
	private List<Produto> produtos;
	private String nome;
	private String codigo;
	private String descricao;
	private CategoriaCardapio categoria;
	private boolean ativo;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;
	public Cardapio(int id, List<Produto> produtos, String nome, String codigo, String descricao,
			CategoriaCardapio categoria, boolean ativo, LocalDate criadoEm, LocalDate alteradoEm) {
		super();
		this.id = id;
		this.produtos = produtos;
		this.nome = nome;
		this.codigo = codigo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.ativo = ativo;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public CategoriaCardapio getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaCardapio categoria) {
		this.categoria = categoria;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public LocalDate getCriadoEm() {
		return criadoEm;
	}
	public LocalDate getAlteradoEm() {
		return alteradoEm;
	}
	
    
    
}
