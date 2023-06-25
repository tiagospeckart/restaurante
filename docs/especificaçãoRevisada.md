# 2.0 Sistema de restaurante

## Classes

### Pessoa (superclasse abstrata)

#### Atributos

- nome : String
- telefone : String
- email : String
- cpf : String
- endereco : Endereco
- dataNascimento : LocalDate
- status : Enum Status (ATIVO/INATIVO)
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- getters() : type
- setters() : void

### Funcionário (subclasse de Pessoa, classe abstrata)

#### Atributos

- rg : String
- escolaridade : String
- numeroCarteiraTrabalho : integer
- dataAdmissão: LocalDate
- dataDemissão: LocalDate

#### Métodos

- getters() : type
- setters() : void

### Atendente (subclasse de Funcionario, implementa IAtendente)

#### Métodos adicionais

- Atendente()
- processarPagamento() : void
- registrarCliente(Cliente) : void
- fecharComanda(Comanda) : void


### Garcom (subclasse de Funcionario, implementa IGarcom)

#### Métodos adicionais

- Garcom()
- manipularMesa(Mesa) : void
- criarComanda(Comanda) : void
- adicionarItemComanda(ItemComanda, quantidade) : void

### Cozinheiro (subclasse de Funcionario, implementa ICozinheiro)

#### Métodos adicionais

- Cozinheiro()
- atualizarStatusItem(ItemComanda) : void

### Supervisor (subclasse de Funcionario, implementa ISupervisor, IGarcom, IAtendente)

#### Métodos adicionais

- Supervisor()
- processarPagamento() : bool
- registrarCliente(Cliente) : void
- fecharComanda(Comanda) : bool
- manipularMesa(Mesa) : void
- criarComanda(Comanda) : void
- adicionarItemComanda(ItemComanda, quantidade) : void
- adicionarFuncionario(Funcionario) : void
- atualizarFuncionario(Funcionario) : void
- removerFuncionario(Funcionario) : void

### Cliente (subclasse Pessoa)

##### Atributos

- nome : String
- telefone : String
- dataNascimento : LocalDate
- email : String
- cpf : String
- endereço : Endereco
- observacao : String
- status : Enum Status (ATIVO/INATIVO)
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- Cliente()
- getters() : type
- setters() : void

### Endereco

##### Atributos

- pais : String
- estado : String
- cidade : String
- rua : String
- numero : Integer
- complemento : String
- cep : String
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- Endereco()
- getters() : type
- setters() : void

### Mesa

#### Atributos

- garcomAtual : Garcom
- numero : Integer
- statusMesa : Enum OcupacaoMesa (LIVRE/RESERVADA/OCUPADA)
- quantidadeMaxima : Integer
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- Mesa()
- setGarcomMesa(Garcom) : void
- alocar(): void
- reservar(): void
- liberar(): void
- listarClientes(): void
- getters() : type
- setters() : void

### Comanda

#### Atributos

- mesaAtual (associação) : Mesa
- clienteComanda (associação) : Cliente
- listaItemComanda : List<\ItemComanda>
- statusComanda : Enum StatusPagaComanda (ABERTA/PAGA/FECHADA)
- codigoComanda: String
- valorTotal : float
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- Comanda()
- getters() : type
- setters() : void
- aplicarDescontoAniversario(Cliente) : valorTotal
- fecharComanda(): void
- adicionarItemComanda(ItemComanda, quantidade) : List<\ItemComanda>
- calcularTotal(List<\ItemComanda>) : valorTotal
- pagarComanda(aplicarDescontoAniversario()) : bool

### Produto

#### Atributos

- nome : String
- descricao : String
- codigo : String
- precoCusto : float
- precoVenda : float
- TempoPreparo : Time
- Status : Enum Status (ATIVO/INATIVO)
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- Produto()
- getters() : type
- setters() : void
- ativar()
- desativar()

### ItemComanda

#### Atributos

- comandaVinculada : Comanda
- produtoVinculado : Produto
- quantidade : Integer
- StatusPreparo : Enum StatusItemProduto (PRONTO/PREPARANDO/AGUARDANDO)
- observacao : String
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- ItemComanda()
- getters() : type
- setters() : void
- adicionarProduto(Produto, Quantidade) : bool
- mudarStatusItem(StatusPreparo) : bool
- adicionarObservacao(Observacao) : bool

### Cardapio

#### Atributos

- nome : String
- listaProdutos : List<\Produto>
- codigo : String
- Status : Enum Status (ATIVO/INATIVO)
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- Cardapio()
- getters() : type
- setters() : void

## Interfaces

### IAtendente

Métodos

- processarPagamento() : bool
- registrarCliente(Cliente) : void
- fecharComanda(Comanda) : bool

### IGarcom

Métodos

- manipularMesa(Mesa) : void
- criarComanda(Comanda) : void
- adicionarItemComanda(ItemComanda, quantidade) : void

### ICozinheiro

Métodos

- atualizarStatusItem(ItemComanda) : void

### ISupervisor

Métodos:

- adicionarFuncionario(Funcionario) : void
- atualizarFuncionario(Funcionario) : void
- removerFuncionario(Funcionario) : void

## Enums

### Status

- ATIVO
- INATIVO

### OcupacaoMesa

- LIVRE
- RESERVADA
- OCUPADA

### StatusItemProduto

- PRONTO
- PREPARANDO
- AGUARDANDO

### StatusPagaComanda

- ABERTA
- PAGA
- FECHADA
