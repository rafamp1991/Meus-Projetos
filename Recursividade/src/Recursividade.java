
public class Recursividade {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 0; i <= 10; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}
	}	
}
