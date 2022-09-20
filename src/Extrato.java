import java.util.Calendar;

public class Extrato {
    private String Conta;
	
    public String getConta() {
        return Conta;
    }


    public void setConta(String conta) {
        Conta = conta;
    }

    private Calendar data; 
	
    public Calendar getData() {
        return data;
    }


    public void setData(Calendar data) {
        this.data = data;
    }


    public Extrato(String Conta,  Calendar data, Calendar hora, double Saldo) {
		// constructor 
		this.Conta = Conta;
		this.data = data;
	}
}
