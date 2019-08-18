
public class FIBONACCI {

	public static void main(String[] args) {
		int valor1 = 0, valor2 = 1, resultado;
		
		for(int i = 0; i <= 10; i++) {
			if (i == 0) {
				resultado = valor1; 
			} 
			else if (i == 1) {
				resultado = valor2; 
			}
			else {
				resultado = valor1 + valor2; 
				valor1 = valor2; 
				valor2 = resultado; 
				
				
			}
			System.out.println("Fibonacci de " + i + " é " + resultado);
		}

	}

}
