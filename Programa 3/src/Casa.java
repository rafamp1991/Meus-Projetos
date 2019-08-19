
public class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();
	
	int quantasPortasEstaoAbertas(){
		int cont=0;
			if(this.porta1.aberta){				
				cont = cont+1;
			}
			if(this.porta2.aberta){
				cont = cont+1;
			}
			if(this.porta3.aberta){
				cont= cont+1;
			}
		return cont; 
	}
}
