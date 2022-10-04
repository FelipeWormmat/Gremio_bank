package view;

import javax.swing.JOptionPane;

public class GremioBankView {
	public int mostraInicio() {
		String aux = JOptionPane.showInputDialog(null, "1 - Minha conta\n2 - Sobre o banco\n3 - Sair\n\nDigite o numero correspondente a opção escolhida: ",
				"Boas Vindas ao Grêmio Bank!", -1);
		int option = Integer.parseInt(aux);
		
		return option;
	}
	
	public int contaMenu() {
		String aux = JOptionPane.showInputDialog(null, "1 - Criar conta\n2 - Acessar conta\n3 - Voltar\n\nDigite o numero correspondente a opção escolhida: ",
				"Menu de conta", -1);
		int option = Integer.parseInt(aux);
		
		return option;
	}
}