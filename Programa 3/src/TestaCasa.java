
public class TestaCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.cor = "Verde";
		casa.porta1.abre();
		casa.porta2.fecha();
		casa.porta3.abre();
		
		System.out.println("Portas que est�o abertas: "+casa.quantasPortasEstaoAbertas());
	}

}
