package model;

public class Cliente {
    public String nome;
	public Conta conta;
    public Cpf cpf;
	public Email email;
	public Celular celular;
	public Endereco endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Conta getConta(Conta conta) {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Cpf getCpf() {
		return cpf;
	}
	
	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}
	
	public Email getEmail() {
		return email;
	}
	
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public Celular getCelular() {
		return celular;
	}
	
	public void setCelular(Celular celular) {
		this.celular = celular;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}