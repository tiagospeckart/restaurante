package Interfaces;
import Classes.*;

public interface IAtendente {
    boolean processarPagamento();
    void registrarCliente(Cliente cliente);
    boolean fecharComanda(Comanda comanda);
}