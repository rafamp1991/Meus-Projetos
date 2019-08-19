package Dados;

public class Conta {
	private	String titular;
	private double saldo;
	private double limite;
	private int numero;
	private static int totalDeContas;
	private static int identificador;
	private static Conta uniqueInstance = new Conta();
	 
    public Conta() {
    }
 
    public static Conta getInstance() {
        return uniqueInstance;
    }
	
	public Conta(String titular)	{
		this.titular = titular;
		Conta.totalDeContas	= Conta.totalDeContas + 1;
		Conta.identificador += 1;
	}
	
	public Conta (int numero, String titular)	{
		this(titular);
		this.numero = numero;
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}
	
	public void deposita(double quantidade) {
		if (quantidade > 0) {
			this.saldo += quantidade;
		}
	}
	
	public static int getidentificador() {
		return Conta.identificador;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void	setTitular(String titular) {
		this.titular = titular;
	}
}
