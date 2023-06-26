package Classes;

import Enums.Status;
import Interfaces.IAtendente;

import java.time.LocalDate;
public class Atendente extends Funcionario implements IAtendente {

    public Atendente(
            String nome,
            String telefone,
            String email,
            String cpf,
            Endereco endereco,
            LocalDate dataNascimento,
            Status status,
            LocalDate criadoEm,
            LocalDate alteradoEm,
            String rg, String escolaridade,
            Integer numeroCarteiraTrabalho,
            LocalDate dataAdmissao,
            LocalDate dataDemissao) {
    }

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
    // getters and setters
}