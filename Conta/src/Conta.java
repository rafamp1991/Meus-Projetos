
public class Conta {
	int numero;
	double saldo;
	double salario;
	String agencia;
	Data dataAbertura;
	Cliente titular;
	
	/*void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}*/
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean	saca(double	valor) {
		if (this.saldo	< valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	double calculaRendimento( ) {
		saldo = saldo * 0.1;
		return saldo;
	}
	
	String	recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero:	" +	this.numero;
		dados += "\nData de abertura: " + this.dataAbertura.formatada();
		return dados;
	}

}
