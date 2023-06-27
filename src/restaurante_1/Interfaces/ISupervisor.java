package Interfaces;

import Classes.Funcionario;

public interface ISupervisor {
    void adicionarFuncionario(Funcionario funcionario);
    void atualizarFuncionario(Funcionario funcionario);
    void removerFuncionario(Funcionario funcionario);
}