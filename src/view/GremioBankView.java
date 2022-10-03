package view;

import javax.swing.JOptionPane;

public class GremioBankView {
	public int mostraInicio() {
		String aux = JOptionPane.showInputDialog(null, "1 - Minha conta\n2 - Criar conta\n3 - Sair\n\nDigite o numero correspondente a opção escolhida: ",
				"Boas Vindas ao Grêmio Bank!", -1);
		int option = Integer.parseInt(aux);
		
		return option;
	}
}