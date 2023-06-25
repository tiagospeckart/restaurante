# 2.0 Sistema de restaurante

## Classes

### Funcionário (superclasse abstrata)

##### Atributos

- nome : String
- telefone : String
- email : String
- dataNascimento : LocalDate
- cpf : String
- rg : String
- endereco : Endereco
- escolaridade : String
- numeroCarteiraTrabalho : integer
- dataAdmissão: LocalDate
- dataDemissão: LocalDate
- status : Enum Status (ATIVO/INATIVO)
- criadoEm: LocalDate
- alteradoEm: LocalDate

### Atendente (subclasse implementa IAtendente)

#### Métodos adicionais

- processarPagamento() : void
- registrarCliente(Cliente) : void
- fecharComanda(Comanda) : void


### Garcom (subclasse implementa IGarcom)

#### Métodos adicionais

- manipularMesa(Mesa) : void
- criarComanda(Comanda) : void
- adicionarItemComanda(ItemComanda, quantidade) : void

### Cozinheiro (subclasse implementa ICozinheiro)

#### Métodos adicionais

- atualizarStatusItem(ItemComanda) : void

### Supervisor (subclasse implementa ISupervisor, IGarcom, IAtendente)

#### Métodos adicionais

- processarPagamento() : bool
- registrarCliente(Cliente) : void
- fecharComanda(Comanda) : bool
- manipularMesa(Mesa) : void
- criarComanda(Comanda) : void
- adicionarItemComanda(ItemComanda, quantidade) : void
- adicionarFuncionario(Funcionario) : void
- atualizarFuncionario(Funcionario) : void
- removerFuncionario(Funcionario) : void

### Cliente

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

### Mesa

#### Atributos

- garcomAtual : Garcom
- numero : Integer
- statusMesa : Enum OcupacaoMesa (LIVRE/RESERVADA/OCUPADA)
- quantidadeMaxima : Integer
- criadoEm: LocalDate
- alteradoEm: LocalDate

#### Métodos

- setGarcomMesa(Garcom) : void

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

- aplicarDescontoAniversario(Cliente) : valorTotal
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

- adicionarProduto(Produto, Quantidade) : bool
- mudarStatusItem(StatusPreparo) : bool
- adicionarObservacao(Observacao) : bool

### Cardápio

#### Atributos

- nome : String
- listaProdutos : List<\Produto>
- codigo : String
- Status : Enum Status (ATIVO/INATIVO)
- criadoEm: LocalDate
- alteradoEm: LocalDate

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
