package view;

import javax.swing.JOptionPane;

import model.Conta;

public class ContaView {
	public int teste = 0;
	
	public void listaCheia() {
		JOptionPane.showMessageDialog(null, "Limite de contas excedido!",
				"Criar conta", 1);
	}
}
