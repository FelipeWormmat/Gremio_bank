package controller;

import java.util.ArrayList;

import model.Conta;
import view.ContaView;

public class ContaController {
	public ArrayList<Conta> listaContas = new ArrayList<Conta>();
	public ContaView contaView = new ContaView();
		
	public void criarConta() {
		Conta conta = new Conta();
		listaContas.add(conta);
	}
	
	public void adicionaConta(Conta conta) {
		if (listaContas.size() < 10) {
			conta.setNumero(listaContas.size() + 1);
			listaContas.add(conta);
		} else {
			contaView.listaCheia();
		}
	}
		
}
