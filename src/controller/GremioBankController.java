package controller;

import view.GremioBankView;
import model.Cliente;

public class GremioBankController {
	
	GremioBankView gremioBankView = new GremioBankView();
	ContaController contaController = new ContaController();
	ClienteController clienteController = new ClienteController();
	BancoController bancoController = new BancoController();	
	
	public void GremioBankPrincipal() {
		int op = 0;
		
		while(op != 3) {
			op = gremioBankView.mostraInicio();
			switch(op) {
				case 1:
					contaMenu();
					break;
				case 2:
					bancoMenu();
					break;
			}
		}
	}
	
	public void contaMenu() {
		int op = 0;
		
		while(op != 3) {
			op = gremioBankView.contaMenu();
			switch(op) {
				case 1:
					criaConta();
					break;
			}
		}
	}
	
	public void bancoMenu() {
		bancoController.bancoClientes();
	}
	
	public void criaConta() {
		Cliente cliente = new Cliente();
		
		clienteController.clienteView.cadastraCliente(cliente);
		clienteController.adicionaCliente(cliente);
		
		contaController.criarConta();
		
	}
	
}
	
	/*
	public static void main(String[] args) {
		
		int firstOption;
		String optionCase[] = {"Sim", "Não"};
		
		firstOption = JOptionPane.showOptionDialog(null, "Deseja criar uma nova conta?", "Boas-Vindas!", 0, -1, null, optionCase, null);
		
		if (firstOption == 1) {
			JOptionPane.showMessageDialog(null, "Vai tomar no cu, seu bosta!", "Seu bosta", 0);
		} else if (firstOption == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		} else {
			
			String titulo = "Grêmio Bank";
			String banco = null;
			String agencia = null;
			String nome = null;
			String cpf = null;
			String email = null;
			String celular = null;
			String cidade = null;
			String estado = null;
			String pix = null;
			
			Cliente cliente1 = new Cliente(null);
			Conta conta1 = new Conta(1);
			
				DADOS DO CLIENTE	
			nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", titulo, -1);
			cliente1.setNome(nome);
			
			cpf = JOptionPane.showInputDialog(null, "Informe seu CPF: ", titulo, -1);
			Cpf cpf1 = new Cpf(cpf);
			cliente1.setCpf(cpf1);
			
			email = JOptionPane.showInputDialog(null, "Digite seu email: ", titulo, -1);
			Email email1 = new Email(email);
			cliente1.setEmail(email1);
			
			celular = JOptionPane.showInputDialog(null, "Digite seu celular: ", titulo, -1);
			Celular celular1 = new Celular(celular);
			cliente1.setCelular(celular1);
			
			cidade = JOptionPane.showInputDialog(null, "Informe sua cidade: ", titulo, -1);
			estado = JOptionPane.showInputDialog(null, "Informe seu estado: ", titulo, -1);
			Endereco endereco1 = new Endereco(cidade, estado);
			cliente1.setEndereco(endereco1);
			
				DADOS DO BANCO	
			String bankOp[] = {"Grêmio Bank"};
			int bankSelected = JOptionPane.showOptionDialog(null, "Em qual banco deseja criar a conta?", titulo, 0, -1, null, bankOp, null);
			if (bankSelected == 0) {
				banco = bankOp[0];
			} else if (bankSelected == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
			Banco banco1 = new Banco(banco);
			conta1.setBanco(banco1);
			
			agencia = JOptionPane.showInputDialog(null, "Informe o número da agência de sua cidade: ", titulo, -1);
			Agencia agencia1 = new Agencia(agencia);
			banco1.setAgencia(agencia1);
			
				DADOS DA CONTA	
			String pixOp[] = {"Email", "Celular", "CPF"};
			int pixSelected = JOptionPane.showOptionDialog(null, "Selecione o tipo de sua chave pix:", titulo, 0, -1, null, pixOp, null);
			switch (pixSelected) {
				case 0:
					pix = cliente1.getEmail().getEmail();
					break;
				case 1:
					pix = cliente1.getCelular().getCelular();
					break;
				case 2:
					pix = cliente1.getCpf().getCpf();
					break;
				default:
					System.exit(0);
					break;
			}
			Pix pix1 = new Pix(pix);
			conta1.setPix(pix1);
			
			String contaCliente = String.format("\t\tMinha conta: \nSaldo: R$ 0,00 \n\nBanco: %s \nAgência: %s \nChave PIX: %s \n", conta1.getBanco().getNome(), conta1.getBanco().getAgencia().getNumero(), conta1.getPix().getChave());
			JOptionPane.showMessageDialog(null, contaCliente, titulo, 1);
		}
		
			INSTANCIAS
		Cliente cliente1 = new Cliente(null);
		Cpf cpf1 = new Cpf("123.456.789-10");
		Email email1 = new Email("Cliente1@gmail.com");
		Celular celular1 = new Celular("(54) 91234-5678");
		Endereco endereco1 = new Endereco("Caxias do Sul", "Rio Grande do Sul");
		Banco banco = new Banco("Grêmio Bank");
		Agencia agencia = new Agencia(10);
		Conta conta1 = new Conta(01);
		Pix pix1 = new Pix(null);
		Cartao cartao1 = new Cartao(null, "1234 5678 9101 1123", "12/2030", 123);
		TipoCartao tipoCartao1 = new TipoCartao("Débito");
		Saldo saldo1 = new Saldo(1329.50);
		Moeda moeda1 = new Moeda("Real");
		
			Sets	
		cliente1.setNome("Ronaldinho Gaúcho");
		cliente1.setCpf(cpf1);
		cliente1.setEmail(email1);
		cliente1.setCelular(celular1);
		cliente1.setEndereco(endereco1);
		agencia.setEndereco(endereco1);
		banco.setAgencia(agencia);
		pix1.setChave(cpf1.cpf);
		cartao1.setNomeCartao(cliente1.nome);
		cartao1.setFuncao(tipoCartao1);
		saldo1.setMoeda(moeda1);
		conta1.setBanco(banco);
		conta1.setCliente(cliente1);
		conta1.setPix(pix1);
		conta1.setCartao(cartao1);
		conta1.setSaldo(saldo1);
		
			PRINT DOS DADOS DO BANCO	
		System.out.println("===============================================");
		System.out.println("============   DADOS DO BANCO   ===============");
		System.out.println("===============================================");
		System.out.printf("Banco: %s\n", banco.getNome());
		System.out.printf("Agência: %s\n\n", banco.getAgencia().getNumero());
		
			PRINT DOS DADOS DO CLIENTE	
		System.out.println("===============================================");
		System.out.println("===========   DADOS DO CLIENTE   ==============");
		System.out.println("===============================================");
		System.out.printf("Nome: %s\n", cliente1.getNome());
		System.out.printf("CPF: %s\n", cliente1.getCpf().getCpf());
		System.out.printf("Email: %s\n", cliente1.getEmail().getEmail());
		System.out.printf("Celular: %s\n", cliente1.getCelular().getCelular());
		System.out.printf("Endereço: %s, %s\n\n", cliente1.getEndereco().getCidade(), cliente1.getEndereco().getEstado());
		
			PRINT DOS DADOS DA CONTA
		System.out.println("===============================================");
		System.out.println("============   DADOS DA CONTA   ===============");
		System.out.println("===============================================");
		System.out.printf("Banco: %s\n", conta1.getBanco().getNome());
		System.out.printf("Cliente: %s\n", conta1.getCliente().getNome());
		System.out.printf("Pix: %s\n", conta1.getPix().getChave());
		System.out.printf("Cartão: %s\n", conta1.getCartao().getFuncao().getFuncao());
		System.out.printf("Saldo: %s\n\n", conta1.getSaldo().getSaldo());
		
	} */