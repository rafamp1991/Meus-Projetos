import Dados.Conta;

public class TestaAcessoComPegaSaldo {
	public static void main(String[] args) {
		int identificadorAux;
		Conta minhaConta = new Conta("Carlos");
		
		System.out.println(minhaConta.getTitular());
		minhaConta.deposita(1000);
		System.out.println("Saldo:	" +	minhaConta.pegaSaldo());
		System.out.println("\n");
		
		//int	total =	minhaConta.getTotalDeContas();
		//minhaConta.setTitular("Batman");
		
		System.out.println(minhaConta.getTitular());
		identificadorAux = minhaConta.getidentificador();
		System.out.println(identificadorAux);
		System.out.println("\n");
		
		Conta minhaConta2 = new Conta("Rafa");
		System.out.println(minhaConta2.getTitular());
		identificadorAux = minhaConta.getidentificador();
		System.out.println(identificadorAux);
	}
}
