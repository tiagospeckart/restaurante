package ravin;

import ravin.*;
import ravin.interfaces.IAtendente;
import ravin.interfaces.IGarcom;
import ravin.interfaces.ISupervisor;

public class Supervisor extends Funcionario implements ISupervisor, IAtendente, IGarcom {
    @Override
    public boolean processarPagamento() {
        return false;
    }

    @Override
    public void registrarCliente(Cliente cliente) {

    }

    @Override
    public boolean fecharComanda(Comanda comanda) {
        return false;
    }

    @Override
    public void manipularMesa(Mesa mesa) {

    }

    @Override
    public void criarComanda(Comanda comanda) {

    }

    @Override
    public void adicionarItemComanda(ItemComanda itemComanda, int quantidade) {

    }

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {

    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) {

    }

    @Override
    public void removerFuncionario(Funcionario funcionario) {

    }

    // methods
}