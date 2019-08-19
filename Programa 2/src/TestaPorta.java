
public class TestaPorta {

	public static void main(String[] args) {
		Porta porta = new Porta();
		
		porta.dimensaoX = 15;
		porta.dimensaoY = 25;
		porta.dimensaoZ = 5;
		porta.cor = "Verde";
		porta.abre();
		porta.fecha();
		
		porta.estaAberta();
	}

}
