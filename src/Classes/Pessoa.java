package Classes;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private Endereco endereco;
    private LocalDate dataNascimento;
    private Status status;
    private LocalDate criadoEm;
    private LocalDate alteradoEm;

    // getters and setters
}