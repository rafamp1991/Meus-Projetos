
public class Fibonacci {
	int valor1 = 0, valor2 = 1, resultado;
	
	int calculaFibonacci(int valor) {
		if (valor == 0) {
			return valor1; 
		} 
		else if (valor == 1) {
			return valor2; 
		}
		else {
			resultado = valor1 + valor2; 
			valor1 = valor2; 
			valor2 = resultado;
			return resultado;
		}
	}
}
