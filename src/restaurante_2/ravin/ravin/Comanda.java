package ravin;

import java.time.LocalDate;
import java.util.List;

import ravin.enums.StatusComanda;

public class Comanda {
	
	private int id;
	private Mesa mesa;
	private Cliente cliente;
	private List<Pedido> pedidos;
	private String codigo;
	private String observacoes;
	private StatusComanda statusComanda;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;
    
	public Comanda(int id, Mesa mesa, Cliente cliente, List<Pedido> pedidos, String codigo, String observacoes,
			StatusComanda statusComanda, LocalDate criadoEm, LocalDate alteradoEm) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.cliente = cliente;
		this.pedidos = pedidos;
		this.codigo = codigo;
		this.observacoes = observacoes;
		this.statusComanda = statusComanda;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public StatusComanda getStatusComanda() {
		return statusComanda;
	}

	public void setStatusComanda(StatusComanda statusComanda) {
		this.statusComanda = statusComanda;
	}

	public LocalDate getCriadoEm() {
		return criadoEm;
	}

	public LocalDate getAlteradoEm() {
		return alteradoEm;
	}
	

    
}
