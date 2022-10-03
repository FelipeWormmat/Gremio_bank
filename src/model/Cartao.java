package model;

public class Cartao {
	public String nomeCartao;
	public String numero;
	public String validade;
	public int cvc;
	public TipoCartao funcao;
	
	public Cartao(String nomeCartao, String numero, String validade, int cvc) {
		this.nomeCartao = nomeCartao;
		this.numero = numero;
		this.validade = validade;
		this.cvc = cvc;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public TipoCartao getFuncao() {
		return funcao;
	}
	public void setFuncao(TipoCartao funcao) {
		this.funcao = funcao;
	}
}