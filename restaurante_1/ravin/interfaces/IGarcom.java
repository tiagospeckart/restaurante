package ravin.interfaces;

import ravin.Comanda;
import ravin.ItemComanda;
import ravin.Mesa;

public interface IGarcom {
    void manipularMesa(Mesa mesa);
    void criarComanda(Comanda comanda);
    void adicionarItemComanda(ItemComanda itemComanda, int quantidade);
}