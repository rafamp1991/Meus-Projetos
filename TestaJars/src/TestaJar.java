
import Dados.Conta;
import Dados.Cliente;

public class TestaJar {
	String cpf;
	
	public static void main(String[] args) {
		Conta.getInstance();
		Conta.getTotalDeContas();
	}
}
