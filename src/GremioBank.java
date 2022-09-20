/*		Nomes: Felipe Wormmat, Fernando Pimmel, Fernando Reinaldo e Luan Adams		*/

public class GremioBank {
	public static void main(String[] args) {
		/*	INSTANCIAS	*/
		Cliente cliente1 = new Cliente(null);
		Cpf cpf1 = new Cpf("123.456.789-10");
		Email email1 = new Email("Cliente1@gmail.com");
		Celular celular1 = new Celular("(54) 91234-5678");
		Endereco endereco1 = new Endereco("Caxias do Sul", "Rio Grande do Sul");
		Banco banco = new Banco("Grêmio Bank");
		Agencia agencia = new Agencia(10);
		Conta conta1 = new Conta(01);
		Pix pix1 = new Pix(null);
		Cartao cartao1 = new Cartao(null, "1234 5678 9101 1123", "12/2030", 123);
		TipoCartao tipoCartao1 = new TipoCartao("Débito");
		Saldo saldo1 = new Saldo(1329.50);
		Moeda moeda1 = new Moeda("Real");
		
		/*	Sets	*/
		cliente1.setNome("Ronaldinho Gaúcho");
		cliente1.setCpf(cpf1);
		cliente1.setEmail(email1);
		cliente1.setCelular(celular1);
		cliente1.setEndereco(endereco1);
		agencia.setEndereco(endereco1);
		banco.setAgencia(agencia);
		pix1.setChave(cpf1.cpf);
		cartao1.setNomeCartao(cliente1.nome);
		cartao1.setFuncao(tipoCartao1);
		saldo1.setMoeda(moeda1);
		conta1.setBanco(banco);
		conta1.setCliente(cliente1);
		conta1.setPix(pix1);
		conta1.setCartao(cartao1);
		conta1.setSaldo(saldo1);
		
		/*	PRINT DOS DADOS DO BANCO	*/
		System.out.println("===============================================");
		System.out.println("============   DADOS DO BANCO   ===============");
		System.out.println("===============================================");
		System.out.printf("Banco: %s\n", banco.getNome());
<<<<<<< HEAD
		System.out.printf("Agência: %s\n\n", banco.getAgencia().getNumero());
=======
		System.out.printf("Agência: %s\n\n", agencia.getNumero());
>>>>>>> 52aad5ae255d28a851ec4aad7905eabfe3545cdb
		
		/*	PRINT DOS DADOS DO CLIENTE	*/
		System.out.println("===============================================");
		System.out.println("===========   DADOS DO CLIENTE   ==============");
		System.out.println("===============================================");
		System.out.printf("Nome: %s\n", cliente1.getNome());
<<<<<<< HEAD
		System.out.printf("CPF: %s\n", cliente1.getCpf().getCpf());
		System.out.printf("Email: %s\n", cliente1.getEmail().getEmail());
		System.out.printf("Celular: %s\n", cliente1.getCelular().getCelular());
		System.out.printf("Endereço: %s, %s\n\n", cliente1.getEndereco().getCidade(), cliente1.getEndereco().getEstado());
=======
		System.out.printf("CPF: %s\n", cpf1.getCpf());
		System.out.printf("Email: %s\n", email1.getEmail());
		System.out.printf("Celular: %s\n", celular1.getCelular());
		System.out.printf("Endereço: %s, %s\n\n", endereco1.getCidade(), endereco1.getEstado());
>>>>>>> 52aad5ae255d28a851ec4aad7905eabfe3545cdb
		
		/*	PRINT DOS DADOS DA CONTA	*/
		System.out.println("===============================================");
		System.out.println("============   DADOS DA CONTA   ===============");
		System.out.println("===============================================");
<<<<<<< HEAD
		System.out.printf("Banco: %s\n", conta1.getBanco().getNome());
		System.out.printf("Cliente: %s\n", conta1.getCliente().getNome());
		System.out.printf("Pix: %s\n", conta1.getPix().getChave());
		System.out.printf("Cartão: %s\n", conta1.getCartao().getFuncao().getFuncao());
		System.out.printf("Saldo: %s\n\n", conta1.getSaldo().getSaldo());
=======
		System.out.printf("Banco: %s\n", banco.getNome());
		System.out.printf("Cliente: %s\n", cliente1.getNome());
		System.out.printf("Pix: %s\n", pix1.getChave());
		System.out.printf("Cartão: %s\n", tipoCartao1.getFuncao());
		System.out.printf("Saldo: R$ %s\n\n", saldo1.getSaldo());
>>>>>>> 52aad5ae255d28a851ec4aad7905eabfe3545cdb
	} 
}