package ravin.interfaces;

import ravin.Funcionario;

public interface ISupervisor {
    void adicionarFuncionario(Funcionario funcionario);
    void atualizarFuncionario(Funcionario funcionario);
    void removerFuncionario(Funcionario funcionario);
}