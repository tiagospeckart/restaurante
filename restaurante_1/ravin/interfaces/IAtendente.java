package ravin.interfaces;
import ravin.*;

public interface IAtendente {
    boolean processarPagamento();
    void registrarCliente(Cliente cliente);
    boolean fecharComanda(Comanda comanda);
}