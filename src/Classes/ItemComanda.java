package Classes;

import Enums.StatusItemProduto;

import java.time.LocalDate;
public class ItemComanda {
    private Comanda comandaVinculada;
    private Produto produtoVinculado;
    private Integer quantidade;
    private StatusItemProduto statusPreparo;
    private String observacao;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;

    public boolean adicionarProduto(Produto produto, int quantidade) {
        // implementação
        return false;
    }

    public boolean mudarStatusItem(StatusItemProduto statusPreparo) {
        // implementação
        return false;
    }

    public boolean adicionarObservacao(String observacao) {
        // implementação
        return false;
    }

    // getters and setters
}