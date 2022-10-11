package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Conta;
import view.ClienteView;

public class ClienteController {
	public ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	public ClienteView clienteView = new ClienteView();
	
	public void adicionaCliente(Cliente cliente) {
		if (listaCliente.size() < 10) {
			listaCliente.add(cliente);
		} else {
			clienteView.listaCheia();
		}
	}
	
	public void pesquisaCliente() {
		String mensagemListaCliente = "";
		for (int i = 0; i < listaCliente.size(); i++) {
			mensagemListaCliente = String.format(mensagemListaCliente + "%s\n", listaCliente.get(i).getNome());
		}

		if (listaCliente.isEmpty() == false) {
			clienteView.mostraPesquisaCliente(mensagemListaCliente);
		} else {
			clienteView.listaVazia();
		}
	}
}
