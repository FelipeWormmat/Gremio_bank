package model;

public class Conta {
	
	public int numero;
	public Banco banco;
	public Pix pix;
	public Cartao cartao;
	public Saldo saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Pix getPix() {
		return pix;
	}

	public void setPix(Pix pix) {
		this.pix = pix;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public Saldo getSaldo() {
		return saldo;
	}

	public void setSaldo(Saldo saldo) {
		this.saldo = saldo;
	}

	public String gerarNumerodaConta() {
        int n = 9;

        int num[] = new int[9];

        for (int i = 0; i < 9; i++) {
            num[i] = randomNumber(n);
        }

        return this.numero = "" + num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + '-' + num[8];
    }
}