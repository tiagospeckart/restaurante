package Interfaces;

import Classes.Comanda;
import Classes.ItemComanda;
import Classes.Mesa;

public interface IGarcom {
    void manipularMesa(Mesa mesa);
    void criarComanda(Comanda comanda);
    void adicionarItemComanda(ItemComanda itemComanda, int quantidade);
}