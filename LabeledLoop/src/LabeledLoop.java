
public class LabeledLoop {

	public static void main(String[] args) {
		
		primeiroloop: for(int i = 0; i < 10; i++){ 
			segundoloop: for(int j = 0; j < 10; j++){ 
				System.out.println(j);
				if(i == 3){ 
					break primeiroloop; 
				}
			}
		}

	}

}
