
public class Fatorial1a10 {

	public static void main(String[] args) {
		
		int fatorial = 1;
		
		for	(int n = 1;	n <= 10; n++)	{
			fatorial = fatorial * n;
		}
		System.out.println( "O fatorial de 10 é igual a " + fatorial );
	}

}
