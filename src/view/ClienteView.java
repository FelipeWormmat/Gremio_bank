package view;

import model.Cliente;

import javax.swing.JOptionPane;

public class ClienteView {

	int teste = 0;
	
	public int cadastraCliente(Cliente cliente) {
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Criar conta", -1);
		
		if(!((nome.startsWith(" ") == true || nome.endsWith(" ") == true || nome.isEmpty() == true))) {
			cliente.setNome(nome);
			teste = 0;
		} else {
			JOptionPane.showMessageDialog(null, "Nome inválido!",
					"Criar conta", 1);
			teste = 1;
		}
		
		return teste;
	}
	
	public void mostraPesquisaCliente(String mensagem) {
		if (mensagem.isEmpty() == false) {
			JOptionPane.showMessageDialog(null, mensagem, "Clientes", 1);
		}
	}
	
	public void listaCheia() {
		JOptionPane.showMessageDialog(null, "Limite de clientes excedido!", "Criar conta", 1);
	}

	public void listaVazia() {
		JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado!", "Clientes", 1);
	}
}
