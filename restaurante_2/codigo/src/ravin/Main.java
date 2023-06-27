package ravin;

import java.awt.GridLayout;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ravin.enumeradores.Cargo;
import ravin.enumeradores.CategoriaCardapio;
import ravin.enumeradores.Disponibilidade;
import ravin.enumeradores.Escolaridade;
import ravin.enumeradores.EstadoCivil;
import ravin.enumeradores.StatusComanda;
import ravin.enumeradores.StatusMesa;
import ravin.enumeradores.StatusPreparo;
import ravin.enumeradores.TipoProduto;
import ravin.modelo.Cardapio;
import ravin.modelo.Cliente;
import ravin.modelo.Comanda;
import ravin.modelo.Funcionario;
import ravin.modelo.Mesa;
import ravin.modelo.Pedido;
import ravin.modelo.Pessoa;
import ravin.modelo.Produto;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = cadastrarPessoa();
		Funcionario funcionario = cadastrarFuncionario();
		Cliente cliente = cadastrarCliente();
		Cardapio cardapio = cadastrarCardapio();
		Produto produto = cadastrarProduto();
		Pedido pedido = cadastrarPedido();
		Comanda comanda = cadastrarComanda();
		Mesa mesa = cadastrarMesa();
	}
	
	public static Pessoa cadastrarPessoa() {
	    JPanel panel = new JPanel(new GridLayout(0, 1));
	    
	    JTextField idField = new JTextField();
	    panel.add(new JLabel("Digite o Id:"));
	    panel.add(idField);
	    
	    JTextField nomeField = new JTextField();
	    panel.add(new JLabel("Digite o nome da pessoa:"));
	    panel.add(nomeField);
	    
	    JTextField telefoneField = new JTextField();
	    panel.add(new JLabel("Digite o telefone:"));
	    panel.add(telefoneField);

	    JTextField emailField = new JTextField();
	    panel.add(new JLabel("Digite o email:"));
	    panel.add(emailField);
	    
	    JTextField cpfField = new JTextField();
	    panel.add(new JLabel("Digite o CPF:"));
	    panel.add(cpfField);

	    JTextField enderecoField = new JTextField();
	    panel.add(new JLabel("Digite o endereco:"));
	    panel.add(enderecoField);
	    
	    JTextField observacaoField = new JTextField();
	    panel.add(new JLabel("Digite alguma observação:"));
	    panel.add(observacaoField);
	    
	    JTextField dataNascimentoField = new JTextField();
	    panel.add(new JLabel("Digite a data de nascimento (formato YYYY-MM-DD):"));
	    panel.add(dataNascimentoField);
	    
	    int result = JOptionPane.showConfirmDialog(null, panel, "Cadastro de Pessoa",
	        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	        
	    if (result == JOptionPane.OK_OPTION) {
	        int id = Integer.parseInt(idField.getText());
	        String nome = nomeField.getText();
	        String telefone = telefoneField.getText();
	        String email = emailField.getText();
	        String cpf = cpfField.getText();
	        String endereco = enderecoField.getText();
	        String observacao = observacaoField.getText();
	        LocalDate dataNascimento = LocalDate.parse(dataNascimentoField.getText());
	        LocalDate criadoEm = LocalDate.now();
	        LocalDate alteradoEm = LocalDate.now();
	        
	        Pessoa pessoa = new Pessoa(id, nome, telefone, email, cpf, endereco, observacao, dataNascimento, criadoEm, alteradoEm);
	        
	        return pessoa;
	    } else {
	        System.out.println("Cadastro cancelado");
	        return null;
	    }
	}
	
	public static Funcionario cadastrarFuncionario() {
	    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id"));
	    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
	    String telefone = JOptionPane.showInputDialog("Digite o telefone");
	    String email = JOptionPane.showInputDialog("Digite o email");
	    String cpf = JOptionPane.showInputDialog("Digite o CPF");
	    String endereco = JOptionPane.showInputDialog("Digite o endereco");
	    String observacao = JOptionPane.showInputDialog("Digite alguma observação");

	    String dataNascimentoStr = JOptionPane.showInputDialog("Digite a data de nascimento (formato YYYY-MM-DD)");
	    LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

	    LocalDate criadoEm = LocalDate.now();
	    LocalDate alteradoEm = LocalDate.now();

	    String rg = JOptionPane.showInputDialog("Digite o RG");
	    EstadoCivil estadoCivil = EstadoCivil.valueOf(JOptionPane.showInputDialog("Digite o estado civil (SOLTEIRO, CASADO, etc)"));
	    Escolaridade escolaridade = Escolaridade.valueOf(JOptionPane.showInputDialog("Digite a escolaridade (FUNDAMENTAL, MEDIO, SUPERIOR, etc)"));
	    Cargo cargo = Cargo.valueOf(JOptionPane.showInputDialog("Digite o cargo (DESENVOLVEDOR, ANALISTA, GERENTE, etc)"));
	    int pis = Integer.parseInt(JOptionPane.showInputDialog("Digite o PIS"));

	    String dataAdmissaoStr = JOptionPane.showInputDialog("Digite a data de admissao (formato YYYY-MM-DD)");
	    LocalDate dataAdmissao = LocalDate.parse(dataAdmissaoStr);

	    String dataDemissaoStr = JOptionPane.showInputDialog("Digite a data de demissao (formato YYYY-MM-DD), ou deixe em branco se o funcionário ainda estiver ativo");
	    LocalDate dataDemissao = dataDemissaoStr.isEmpty() ? null : LocalDate.parse(dataDemissaoStr);

	    Disponibilidade disponibilidade = Disponibilidade.valueOf(JOptionPane.showInputDialog("Digite a disponibilidade (PARCIAL, INTEGRAL, etc)"));

	    Funcionario funcionario = new Funcionario(id, nome, telefone, email, cpf, endereco, observacao, dataNascimento, criadoEm, alteradoEm, rg,
	            estadoCivil, escolaridade, cargo, pis, dataAdmissao, dataDemissao, disponibilidade);

	    return funcionario;
	}
	
	public static Cliente cadastrarCliente() {
	    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id"));
	    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
	    String telefone = JOptionPane.showInputDialog("Digite o telefone");
	    String email = JOptionPane.showInputDialog("Digite o email");
	    String cpf = JOptionPane.showInputDialog("Digite o CPF");
	    String endereco = JOptionPane.showInputDialog("Digite o endereco");
	    String observacao = JOptionPane.showInputDialog("Digite alguma observação");

	    String dataNascimentoStr = JOptionPane.showInputDialog("Digite a data de nascimento (formato YYYY-MM-DD)");
	    LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

	    LocalDate criadoEm = LocalDate.now();
	    LocalDate alteradoEm = LocalDate.now();

	    String alergias = JOptionPane.showInputDialog("Digite as alergias do cliente, se houver");
	    boolean vip = Boolean.parseBoolean(JOptionPane.showInputDialog("O cliente é VIP? (true/false)"));

	    Cliente cliente = new Cliente(id, nome, telefone, email, cpf, endereco, observacao, dataNascimento, criadoEm, alteradoEm, alergias, vip);

	    return cliente;
	}
	
	public static Cardapio cadastrarCardapio() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do cardapio"));
		String nome = JOptionPane.showInputDialog("Digite o nome do cardapio");
		String codigo = JOptionPane.showInputDialog("Digite o código do cardapio");
		String descricao = JOptionPane.showInputDialog("Digite a descrição do cardapio");
		CategoriaCardapio categoria = CategoriaCardapio.valueOf(JOptionPane.showInputDialog("Digite a categoria do cardapio (SOBREMESA, PRATO_PRINCIPAL, etc)"));
		boolean ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("O cardápio está ativo? (true/false)"));
		LocalDate criadoEm = LocalDate.now();
		LocalDate alteradoEm = LocalDate.now();

		List<Produto> produtos = new ArrayList<>(); // Lista vazia

		Cardapio cardapio = new Cardapio(id, produtos, nome, codigo, descricao, categoria, ativo, criadoEm, alteradoEm);
		
		return cardapio;
	}
	
	public static Produto cadastrarProduto() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do produto"));
		String nome = JOptionPane.showInputDialog("Digite o nome do produto");
		String descricao = JOptionPane.showInputDialog("Digite a descrição do produto");
		String codigo = JOptionPane.showInputDialog("Digite o código do produto");
		double precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de custo do produto"));
		double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda do produto"));
		String tempoPreparo = JOptionPane.showInputDialog("Digite o tempo de preparo do produto");
		String observacoes = JOptionPane.showInputDialog("Digite as observações para o produto");
		TipoProduto tipoProduto = TipoProduto.valueOf(JOptionPane.showInputDialog("Digite o tipo do produto (PRATO_PRINCIPAL, SOBREMESA, etc)"));
		boolean ativo = Boolean.parseBoolean(JOptionPane.showInputDialog("O produto está ativo? (true/false)"));
		LocalDate criadoEm = LocalDate.now();
		LocalDate alteradoEm = LocalDate.now();

		Produto produto = new Produto(id, nome, descricao, codigo, precoCusto, precoVenda, tempoPreparo, observacoes, tipoProduto, ativo, criadoEm, alteradoEm);

		return produto;
	}
	
	public static Pedido cadastrarPedido() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do pedido"));
		

		Timestamp dataHoraSolicitacao = Timestamp.valueOf(JOptionPane.showInputDialog("Digite a data e hora da solicitação do pedido (formato YYYY-MM-DD HH:MM:SS)"));
		Timestamp dataHoraInicioPreparo = Timestamp.valueOf(JOptionPane.showInputDialog("Digite a data e hora do início do preparo (formato YYYY-MM-DD HH:MM:SS)"));
		Timestamp tempoPreparoRestante = Timestamp.valueOf(JOptionPane.showInputDialog("Digite o tempo de preparo restante (formato YYYY-MM-DD HH:MM:SS)"));

		StatusPreparo statusPreparo = StatusPreparo.valueOf(JOptionPane.showInputDialog("Digite o status de preparo (EM_ANDAMENTO, PRONTO, ENTREGUE, etc)"));
		String observacao = JOptionPane.showInputDialog("Digite as observações para o pedido");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto no pedido"));

		LocalDate criadoEm = LocalDate.now();
		LocalDate alteradoEm = LocalDate.now();

		Produto produto = null;
		
		Pedido pedido = new Pedido(id, produto, dataHoraSolicitacao, dataHoraInicioPreparo, tempoPreparoRestante, statusPreparo, observacao, quantidade, criadoEm, alteradoEm);

		return pedido;
	}
	
	public static Comanda cadastrarComanda() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id da comanda"));
		
		Mesa mesa = null;
		Cliente cliente = null;
		List<Pedido> pedidos = new ArrayList<Pedido>();

		String codigo = JOptionPane.showInputDialog("Digite o código da comanda");
		String observacoes = JOptionPane.showInputDialog("Digite as observações para a comanda");

		StatusComanda statusComanda = StatusComanda.valueOf(JOptionPane.showInputDialog("Digite o status da comanda (ABERTA, FECHADA, etc)"));

		LocalDate criadoEm = LocalDate.now();
		LocalDate alteradoEm = LocalDate.now();

		Comanda comanda = new Comanda(id, mesa, cliente, pedidos, codigo, observacoes, statusComanda, criadoEm, alteradoEm);

		return comanda;
	}

	public static Mesa cadastrarMesa() {
	    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id da mesa"));

	    Funcionario funcionario = null;

	    List<Comanda> comandas = new ArrayList<Comanda>();

	    String nome = JOptionPane.showInputDialog("Digite o nome da mesa");
	    String codigo = JOptionPane.showInputDialog("Digite o código da mesa");
	    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mesa"));
	    int quantidadeMaxPessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade máxima de pessoas para a mesa"));

	    StatusMesa statusMesa = StatusMesa.valueOf(JOptionPane.showInputDialog("Digite o status da mesa (DISPONIVEL, OCUPADA, etc)"));

	    LocalDate criadoEm = LocalDate.now();
	    LocalDate alteradoEm = LocalDate.now();

	    Mesa mesa = new Mesa(id, funcionario, comandas, nome, codigo, numero, quantidadeMaxPessoas, statusMesa, criadoEm, alteradoEm);

	    return mesa;
	}


}
