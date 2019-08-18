
public class Main {

	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		Cliente	c = new	Cliente();
		minhaConta.titular = c;
		//Cliente titular = new Cliente();
		
		
		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000.0;
		boolean	consegui = minhaConta.saca(2000);
		
		if (consegui) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não	consegui sacar");
		}
		
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}

}
