package controller;

import view.BancoView;
import controller.ClienteController;

public class BancoController {
	ClienteController clienteController = new ClienteController(); 
	
	public void bancoClientes() {
		clienteController.pesquisaCliente();
	}
}
