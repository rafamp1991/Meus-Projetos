
public class TestaConta {
	public	static	void	main(String[]	args) {
		Conta conta = new Conta();
		Cliente titular = new Cliente();
		Data data = new	Data();
		conta.dataAbertura = data;
		
		Conta c1 = new Conta();
		c1.titular = titular;
		c1.titular.nome = "Hugo";
		c1.saldo = 100;
		
		Conta c2 = new Conta();	
		c2.titular = titular;
		c2.titular.nome = "Danilo";
		c2.saldo = 100;
		
		c2 = c1;
		
		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");								
		}
		
		titular.nome = "Hugo";
		conta.numero = 123;
		conta.agencia = "45678-9";
		conta.saldo = 50.0;
		conta.dataAbertura.dia = 17;
		conta.dataAbertura.mes = 8;
		conta.dataAbertura.ano = 2019;
		conta.deposita(100.0);
		
		System.out.println("saldo atual:" +	conta.saldo);
		System.out.println("rendimento mensal:"	+ conta.calculaRendimento());
		System.out.println(conta.recuperaDadosParaImpressao());
	}
}
