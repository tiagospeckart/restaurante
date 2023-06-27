package Classes;

import Enums.StatusPagaComanda;

import java.util.List;
import java.time.LocalDate;
public class Comanda {
    private Mesa mesaAtual;
    private Cliente clienteComanda;
    private List<ItemComanda> listaItemComanda;
    private StatusPagaComanda statusComanda;
    private String codigoComanda;
    private float valorTotal;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;

    public void adicionarCliente(Cliente cliente) {
        // implementação
    }

    public void adicionarMesa(Mesa mesa) {
        // implementação
    }

    public List<ItemComanda> adicionarItemComanda(ItemComanda itemComanda, int quantidade) {
        // implementação
        return null;
    }

    public float calcularTotal(List<ItemComanda> listaItemComanda) {
        // implementação
        return 0.0f;
    }

    public boolean pagarComanda() {
        // implementação
        return false;
    }

    // getters and setters
}