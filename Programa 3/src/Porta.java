
public class Porta {
	Boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre() {
		this.aberta = true;
	}
	
	void fecha( ) {
		this.aberta = false;
	}
	
	void pinta(String s) {
		System.out.println("Cor:"+this.cor);
	}
	
	Boolean estaAberta() {
		if (this.aberta) {
			return true;
		} else {
			return false;
		}
	}
}
